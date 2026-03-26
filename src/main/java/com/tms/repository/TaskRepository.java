package com.tms.repository;

import com.tms.model.Task;
import com.tms.util.DatabaseConfig;
import com.tms.util.SqlCommands;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class TaskRepository {
    private static TaskRepository instance;
    private final Connection connection;

    private TaskRepository() {
        connection = DatabaseConfig.getConnection();
    }

    public static TaskRepository getInstance() {
        if (instance == null) {
            instance = new TaskRepository();
        }
        return instance;
    }

    public boolean addTaskByUsername(String taskMessage, String username) {
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(SqlCommands.ADD_NEW_TASK_BY_USERNAME);
            preparedStatement.setString(1, taskMessage);
            preparedStatement.setString(2, username);
            int result = preparedStatement.executeUpdate(); //autoCommit=true-применялись изменения
            connection.commit(); //autoCommit=false-применялись изменения
            return result > 0;
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                throw new RuntimeException(ex);
            }
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean removeTaskByUsername(String taskMessage, String username) {
        try {
            CallableStatement statement = connection.prepareCall(SqlCommands.REMOVE_TASK_BY_USERNAME);
            statement.setString(1, username);
            statement.setString(2, taskMessage);
            return statement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public Set<Task> getTasksByUsername(String username) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlCommands.GET_TASKS_BY_USERNAME);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            return parseResultSetToTaskList(resultSet);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    public Set<Task> parseResultSetToTaskList(ResultSet resultSet) throws SQLException {
        Set<Task> tasks = new HashSet<>();
        while (resultSet.next()) {
            Task task = new Task();
            task.setId(resultSet.getInt("id"));
            task.setMessage(resultSet.getString("message"));
            task.setUserId(resultSet.getInt("user_id"));
            task.setDate(resultSet.getTimestamp("created").toLocalDateTime());
            tasks.add(task);
        }
        return tasks;
    }
}
