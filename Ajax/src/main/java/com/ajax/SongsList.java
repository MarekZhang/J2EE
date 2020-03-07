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

@WebServlet("/SongsList")
public class SongsList extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        List songList = new ArrayList();
        if(type != null && type.equals("rap")){
            songList.add(new Song("Lose yourself"));
            songList.add(new Song("Rap God"));
            songList.add(new Song("Stepping Stone"));
        }else if(type != null && type.equals("pop")){
            songList.add(new Song("Last Christmas"));
            songList.add(new Song("Love Story"));
            songList.add(new Song("Red"));
        }else if(type != null && type.equals("classic")){
            songList.add(new Song("What's going on"));
            songList.add(new Song("Tears in Haven"));
            songList.add(new Song("Country Road"));
        }

        String songJson = JSON.toJSONString(songList);
        resp.getWriter().println(songJson);

    }
}
