package com.tms.util;

public interface SqlCommands {
    String GET_ALL_USERS = "SELECT * FROM users";
    String GET_PASSWORD_BY_USERNAME = "SELECT password FROM users WHERE username = ?";
    String GET_USER_INFO_BY_USERNAME = "SELECT * FROM users WHERE username = ?";
    String ADD_NEW_TASK_BY_USERNAME = "INSERT INTO tasks (id,message,created,user_id) VALUES (DEFAULT, ?, now(), (SELECT id FROM users WHERE username = ?))";
    String REMOVE_TASK_BY_USERNAME = "DELETE FROM tasks WHERE user_id = (SELECT id FROM users WHERE username = ?) AND message = ?";
    String GET_TASKS_BY_USERNAME = "SELECT * FROM tasks WHERE user_id = (SELECT id FROM users WHERE username = ?)";
}
