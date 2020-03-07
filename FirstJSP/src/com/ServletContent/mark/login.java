package com.ServletContent.mark;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/context/init")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context =  req.getServletContext();
        String google = context.getInitParameter("google");
        String title  = context.getInitParameter("Title");
        context.setAttribute("google", google);
        context.setAttribute("Title", title);
        resp.getWriter().println("Init Successfully");
    }
}
