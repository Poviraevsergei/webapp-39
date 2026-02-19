package com.tms;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/bye")
public class ByeServlet extends HttpServlet {

    //Жизненный цикл сервлета
    //Init - 1 раз при создании сервлета
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Bye Servlet Init method");
    }

    //Service - отрабатывает при каждом запросе, определяет какой метод(doGet doPost ... ) вызвать.
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp); //НЕ УДАЛЯТЬ !
        System.out.println("Bye Service method");
    }

    //Destroy - отрабатывает 1 раз при закрытии приложения
    @Override
    public void destroy() {
        System.out.println("Bye Destroy method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("name");   //не путать с req.getAttribute() !!!

        System.out.println("Возвращаем страницу hello-page.html");

        //Как вернуть страницу из WEB-INF
        req.getRequestDispatcher("/WEB-INF/pages/bye-page.html").forward(req, resp);
    }
}







