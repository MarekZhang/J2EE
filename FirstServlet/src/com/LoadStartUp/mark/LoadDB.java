package com.LoadStartUp.mark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet(urlPatterns = "/Load", loadOnStartup = 1)
public class LoadDB extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Loading the DataBase");
    }
}
