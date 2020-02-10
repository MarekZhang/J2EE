package com.Calculation.mark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/direct/calc")
public class Calculate extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num = req.getParameter("num");
        int Num = Integer.parseInt(num);
        int result = 0;
        for(int i = 1; i <= Num; i++)
            result += i;
        req.setAttribute("result", result);
        req.getRequestDispatcher("/direct/result").forward(req, resp);
    }
}
