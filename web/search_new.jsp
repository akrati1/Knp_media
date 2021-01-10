<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cons.Connections"%>
<jsp:useBean scope="application" class="searchpannel.searchpannel" id="srch"/>
<jsp:setProperty name="srch" property="srchtext" param="txt"/>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%
        ArrayList<String> al=srch.getUsers();
        pageContext.setAttribute("emails", al);
%>
<c:forEach var="e" items="${emails}">
<sql:setDataSource driver="com.mysql.jdbc.Driver" 
                   url="jdbc:mysql://localhost:3306/shn" 
                   user="root" password="123" var="con"/>    
<sql:query var="rs" dataSource="${con}">
    select * from booking_pannel where select_site=?
    <sql:param value="${e}"/>
</sql:query>
<c:forEach var="row" items="${rs.rows}">    
<div style="width: 100%;height: 100%;border-bottom: 1px solid #4eb9ed;margin-bottom: 10px;float: left;">
    <div class="srchlbl"><c:out value="${row.select_site}"/></div>
</div>
</c:forEach>    
</c:forEach>