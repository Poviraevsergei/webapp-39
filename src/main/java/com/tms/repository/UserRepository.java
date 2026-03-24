package com.tms.repository;

import com.tms.model.User;
import com.tms.util.DatabaseConfig;
import com.tms.util.SqlCommands;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private static UserRepository instance;
    private final Connection connection;

    private UserRepository() {
        connection = DatabaseConfig.getConnection();
    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public Optional<String> getPasswordByUsername(String username) {
        try {
            PreparedStatement statement = connection.prepareStatement(SqlCommands.GET_PASSWORD_BY_USERNAME);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return Optional.ofNullable(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }

    public boolean isUsernameExist(String username) {
        try {
            PreparedStatement statement = connection.prepareStatement(SqlCommands.GET_USER_INFO_BY_USERNAME);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<User> getAllUsers() {
        try {
            //Подготовить Statement(Statement, PrepareStatement, CallableStatement)
            PreparedStatement statement = connection.prepareStatement(SqlCommands.GET_ALL_USERS);
            //Отправляем и принимаем ответ(ResultSet)
            ResultSet resultSet = statement.executeQuery();
            //Парсим ResultSet
            return parseResultSetToUserList(resultSet);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public List<User> parseResultSetToUserList(ResultSet resultSet) throws SQLException {
        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setAge(resultSet.getInt("age"));
            user.setFirstName(resultSet.getString("first_name"));
            user.setCreated(resultSet.getDate("created").toLocalDate());

            users.add(user);
        }

        return users;
    }
}
