<%--
  Created by IntelliJ IDEA.
  User: zhangbowen
  Date: 10/02/2020
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.*" contentType="text/html;charset=utf-8" %>
<%! public boolean isPrime(int number){
    for(int i = 2; i <= (int)Math.sqrt(number); i++)
        if((number % i) == 0)
            return false;

    return true;
}
%>

<%
    List<Integer> list = new ArrayList<>();
    for(int i = 2; i <= 1000; i++)
        if(isPrime(i))
            list.add(i);
%>

<%
    for (int p : list) {

%>
    <h1 style="color:red"> <%=p%> 是质数</h1>
<%
    }
%>