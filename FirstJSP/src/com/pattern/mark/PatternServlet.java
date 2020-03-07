package com.pattern.mark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/pattern/*")
public class PatternServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURL().toString();
        String pattern = url.substring(url.lastIndexOf("/") + 1);
        PrintWriter out = resp.getWriter();
        if(pattern.equals("1"))
            out.println("Professor");
        else if(pattern.equals("2"))
            out.println("PostGraduate");
        else
            out.println("Graduate");

    }
}
