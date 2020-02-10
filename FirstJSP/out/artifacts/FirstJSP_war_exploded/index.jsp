<%--
  Created by IntelliJ IDEA.
  User: zhangbowen
  Date: 10/02/2020
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Salary</title>
  </head>
  <body>
    <%
      int sum = 0;
      for (int i = 1; i <= 100; i++)
        sum += i;

    %>
    <%= "<b>sum = " + sum + "</b>"%>
  </body>
</html>
