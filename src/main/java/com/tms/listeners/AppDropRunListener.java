package com.tms.listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppDropRunListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("App running listener ...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("App drops listener ...");
    }
}
