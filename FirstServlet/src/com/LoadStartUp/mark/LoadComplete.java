package com.LoadStartUp.mark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet(urlPatterns = "/comp", loadOnStartup = 2)
public class LoadComplete extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("All Configuration Loaded");
    }
}
