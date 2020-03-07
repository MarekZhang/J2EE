package com.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class trafficListener implements ServletContextListener, ServletRequestListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        List<String> timeList = new ArrayList<>();
        List<Integer> trafficList = new ArrayList<>();
        sce.getServletContext().setAttribute("time", timeList);
        sce.getServletContext().setAttribute("traffic", trafficList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest req = (HttpServletRequest)sre.getServletRequest();
        String uri = req.getRequestURI();
        if(uri.endsWith("/trafficServlet"))
            return;

        ArrayList<String> timeList = (ArrayList<String>) sre.getServletContext().getAttribute("time");
        ArrayList<Integer> trafficList = (ArrayList<Integer>) sre.getServletContext().getAttribute("traffic");
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        String dateString = dateFormat.format(date);

        if(timeList.indexOf(dateString) == -1){
            timeList.add(dateString);
            trafficList.add(1);
            sre.getServletContext().setAttribute("time", timeList);
        }else{
            int idx = timeList.indexOf(dateString);
            Integer traffic = trafficList.get(idx);
            trafficList.set(idx, ++traffic);
        }
        sre.getServletContext().setAttribute("traffic", trafficList);
        System.out.println("The current time is: " + dateString);
        System.out.println("The current traffic is: " + trafficList.get(timeList.indexOf(dateString)));
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }
}
