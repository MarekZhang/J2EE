package com.ajax;


import com.alibaba.fastjson.JSON;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/jsonList")
public class NewsListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        List newsList = new ArrayList();
        if(title != null && title.equals("programming")) {
            newsList.add(new News("2020-1-2", "google", "rankings..", "The rank of Programming Languages"));
            newsList.add(new News("2020-1-3", "bing", "rankings..", "The rank of Programming Languages"));
            newsList.add(new News("2020-1-4", "stakOverflow", "rankings..", "The rank of Programming Languages"));
            newsList.add(new News("2020-1-5", "GeekForGeek", "rankings..", "The rank of Programming Languages"));
        }else if(title == null || title.equals("program")){
            newsList.add(new News("2020-1-2", "google", "rankings..", "The rank of Program Languages"));
            newsList.add(new News("2020-1-3", "bing", "rankings..", "The rank of Program Languages"));
            newsList.add(new News("2020-1-4", "stakOverflow", "rankings..", "The rank of Program Languages"));
            newsList.add(new News("2020-1-5", "GeekForGeek", "rankings..", "The rank of Program Languages"));
        }
        String json = JSON.toJSONString(newsList);
        resp.getWriter().println(json);

    }
}
