<%-- 
    Document   : Message
    Created on : Jun 21, 2017, 6:03:36 PM
    Author     : akrati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <center>
        <h3><%=request.getAttribute("Message")%></h3>
    </center>
    </body>
</html>
