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

@WebServlet("/employeeList")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List EmployeeList = new ArrayList();
        EmployeeList.add(new Employees("Alice", "R&D", "SDE"));
        EmployeeList.add(new Employees("Bill", "R&D", "DevOp"));
        EmployeeList.add(new Employees("Charles", "H&R", "HR Manager"));

        String employees = JSON.toJSONString(EmployeeList);
        resp.getWriter().println(employees);
    }
}
