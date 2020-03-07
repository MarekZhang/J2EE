<%@page contentType="text/html; charset = UTF-8"  pageEncoding = "UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FAIL</title>
</head>
<body>
    <%
        out.println(session.getAttribute("result"));
    %>
</body>
</html>