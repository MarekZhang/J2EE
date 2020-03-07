package com.Listener;

import com.alibaba.fastjson.JSON;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/trafficServlet")
public class trafficServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> timeList = (ArrayList<String>) req.getServletContext().getAttribute("time");
        List<Integer> trafficList = (ArrayList<Integer>) req.getServletContext().getAttribute("traffic");

        Map<String, List> map = new HashMap<>();
        map.put("time", timeList);
        map.put("traffic", trafficList);

        String json = JSON.toJSONString(map);
        resp.getWriter().print(json);

    }
}
