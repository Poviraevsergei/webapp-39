package com.tms.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Random;

@WebServlet("/show-my-money")
public class SummaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer summaVar = new Random().nextInt(100,10000);
        resp.setContentType("text/html");
        req.setAttribute("summaKey", summaVar);

        getServletContext().getRequestDispatcher("/WEB-INF/pages/show.jsp").forward(req, resp);
    }
}
