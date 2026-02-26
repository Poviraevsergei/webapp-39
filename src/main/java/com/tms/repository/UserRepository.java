package com.tms.repository;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static UserRepository instance;
    private final Map<String, String> users;

    private UserRepository() {
        users = new HashMap<>();
        users.put("admin", "admin");
        users.put("user", "user");
    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public String getPasswordByUsername(String username) {
        return users.get(username);
    }
}
