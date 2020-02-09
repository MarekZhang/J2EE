package com.mark;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("n");
        int length = Integer.parseInt(name);
        int result = 0;
        for(int i = 1; i <= length; i++){
            result += i;
        }
        String html = "<h1 style='color:blue'>" + result + "</h1>";
        PrintWriter out = resp.getWriter();
        out.println(html);
    }
}
