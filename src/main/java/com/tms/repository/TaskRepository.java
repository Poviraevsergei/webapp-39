package com.tms.repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class TaskRepository {
    private static TaskRepository instance;
    private Map<String, Set<String>> taskList;

    private TaskRepository() {
        taskList = new HashMap<>();
    }

    public static TaskRepository getInstance() {
        if (instance == null) {
            instance = new TaskRepository();
        }
        return instance;
    }

    public boolean updateTaskList(Set<String> taskList, String username) {
        return this.taskList.put(username, taskList) != null;
    }

    public Set<String> getTasksByUsername(String username) {
        return taskList.get(username) == null ? new LinkedHashSet<>() : taskList.get(username);
    }
}
