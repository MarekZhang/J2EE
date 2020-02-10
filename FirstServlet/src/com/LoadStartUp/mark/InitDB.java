package com.LoadStartUp.mark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/init", loadOnStartup = 0)
public class InitDB extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Initializing the DataBase");
    }
}
