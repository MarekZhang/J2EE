package com.mark;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RquestMethod extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Opn1 = req.getParameter("Operand1");
        resp.getWriter().println("<h1 style='color:red>" + Opn1 + "</h1>");
        resp.getWriter().println("<h1>hello world</h1>");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Opn1 = req.getParameter("Operand1");
        resp.getWriter().println("<h1 style='color:green>" + Opn1 + "</h1>");
        resp.getWriter().println("<h1>hello world</h1>");
    }
}
