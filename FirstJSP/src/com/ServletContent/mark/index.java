package com.ServletContent.mark;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/context/index")
public class index extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        String google = (String)context.getAttribute("google");
        String title = (String)context.getAttribute("Title");
        resp.getWriter().println("The title is: " + title);
        resp.getWriter().println("The url is: " + google);
    }
}
