package com.tms.servlet;

import com.tms.repository.TaskRepository;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Set;

@WebServlet("/todo")
public class TodoServlet extends HttpServlet {
    private TaskRepository taskRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        taskRepository = TaskRepository.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("tasks", getUserTasks(req));
        getServletContext().getRequestDispatcher("/WEB-INF/pages/todo.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Set<String> tasks = getUserTasks(req);
        String addTaskValue = req.getParameter("addTask");
        String removeTaskValue = req.getParameter("deleteTask");

        if (addTaskValue != null) {
            tasks.add(addTaskValue);
            taskRepository.updateTaskList(tasks, getUsername(req));
        }
        if (removeTaskValue != null) {
            tasks.remove(removeTaskValue);
            taskRepository.updateTaskList(tasks, getUsername(req));
        }

        req.setAttribute("tasks", getUserTasks(req));
        getServletContext().getRequestDispatcher("/WEB-INF/pages/todo.jsp").forward(req, resp);
    }

    private Set<String> getUserTasks(HttpServletRequest req){
        String username = getUsername(req);
        return taskRepository.getTasksByUsername(username);
    }

    private String getUsername(HttpServletRequest req){
        return req.getSession().getAttribute("username").toString();
    }
}
