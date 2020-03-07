package com.Listener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Listener")
public class ListenerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().setAttribute("Context-attr", "Cont-attr1");
        req.getSession().setAttribute("Session-attr", "Session-attr1");
        req.setAttribute("Req-attr", "Req-attr1");
    }
}
