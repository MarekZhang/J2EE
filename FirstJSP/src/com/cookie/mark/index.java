package com.cookie.mark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie/index")
public class index extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if(cookies == null){
            resp.getWriter().println("No cookie stored");
            return;
        }

        for (Cookie cookie : cookies) {
            resp.getWriter().println(cookie.getName() + ":" + cookie.getValue());
        }
    }
}
