package com.tms.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Random;

@WebServlet("/todo")
public class TodoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] names = {"Sergey", "Alex"};
        req.setAttribute("randomNumber", new Random().nextInt(1,4));
        req.setAttribute("array", names);
        getServletContext().getRequestDispatcher("/WEB-INF/pages/todo.jsp").forward(req, resp);
    }
}
