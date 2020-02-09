package com.mark;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentInfo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Name = req.getParameter("name");
        String Mobile = req.getParameter("mobile");
        String Sex = req.getParameter("sex");
        String[] Spec = req.getParameterValues("spec");

        PrintWriter out = resp.getWriter();
        String html = "<h1> name:" + Name + "</h1></br>" +
                      "<h1> mobile:" + Mobile + "</h1></br>"+
                      "<h1> sex: " + Sex + "</h1>";
        out.println(html);

        for(int i = 0; i < Spec.length; i++){
            String temp = "<h2> spec:" + Spec[i] + "</h2>";
            out.println(temp);
        }
    }
}
