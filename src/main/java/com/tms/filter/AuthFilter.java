package com.tms.filter;

import com.tms.repository.UserRepository;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = {
        "/todo",
        "/about-me"
})
public class AuthFilter implements Filter {
    private UserRepository userRepository;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        userRepository = UserRepository.getInstance();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpSession userSession = ((HttpServletRequest) request).getSession();
        String username = userSession.getAttribute("username") == null ? null : userSession.getAttribute("username").toString();
        if (username != null && userRepository.isUsernameExist(username)) {
            chain.doFilter(request, response);
            return;
        }
        request.getRequestDispatcher("/login.html").forward(request, response);
    }
}
