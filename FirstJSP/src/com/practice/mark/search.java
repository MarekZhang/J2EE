package com.practice.mark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/practice/search")
public class search extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> map = new HashMap<>();
        map.put("apple", "苹果");
        map.put("orange", "橘子");
        map.put("banana", "香蕉");

        String key = (String) req.getParameter("key");
        if(map.containsKey(key)){
            System.out.println("contains");
            req.setAttribute("value", map.get(key));
            req.getRequestDispatcher("/success.jsp").forward(req,resp);
        }else{
            HttpSession session = req.getSession();
            session.setAttribute("result", "No words found");
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }
    }
}
