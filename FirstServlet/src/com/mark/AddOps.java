package com.mark;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddOps extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String opn1 = req.getParameter("Operand1");
        String opn2 = req.getParameter("Operand2");
        int result = Integer.parseInt(opn1) + Integer.parseInt(opn2);
        String html = "<span>The result is: " + result + "</span>";
        PrintWriter out = resp.getWriter();

        out.println(html);
    }
}
