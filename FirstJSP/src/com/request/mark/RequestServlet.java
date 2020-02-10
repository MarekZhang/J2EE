package com.request.mark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Req")
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String User_Agent = request.getHeader("User-Agent");
        response.setContentType("text/html;charset=utf-8");
        if(User_Agent.indexOf("Macintosh") != -1)
            response.getWriter().println("<h1 style='color:red'> This is a web for MacOS </h1>");
        else if(User_Agent.indexOf("iPhone") != -1)
            response.getWriter().println("<h1 style='color:blue'> This is a web for Iphone </h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String User_Agent = request.getHeader("User-Agent");
        response.setContentType("text/html;charset=utf-8");
        if(User_Agent.indexOf("Macintosh") != -1)
            response.getWriter().println("<h1 style='color:red'> This is a web for MacOS </h1>");
        else if(User_Agent.indexOf("iPhone") != -1)
            response.getWriter().println("<h1 style='color:green'> This is a web for Iphone </h1>");
    }
}
