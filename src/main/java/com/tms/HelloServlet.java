package com.tms;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(15);
        Integer countFromRequest = (Integer) session.getAttribute("count");

        if (countFromRequest == null) {
            countFromRequest = 0;
        }

        session.setAttribute("count", ++countFromRequest);

        if (countFromRequest == 20) {
            session.invalidate();
        }

        //Задать свою cookie
        Cookie cookie = new Cookie("name", "Dima");
        resp.addCookie(cookie);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("Hello from HelloServlet. Count now: " + countFromRequest);
    }
}
