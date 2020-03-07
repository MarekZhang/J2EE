<%@page contentType="text/html; charset = UTF-8"  pageEncoding = "UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SUCCESS</title>
</head>
<body>
<%
    out.print("<h1 style='color:green'>" + request.getAttribute("value") + "</h1>");
%>
</body>
</html>