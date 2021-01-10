<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%  
    
    String s1=request.getParameter("search_term");
    String p1="";
   
 
   try 
   { 
  Class.forName("com.mysql.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shn", "root", "123");
  Statement st = con.createStatement();
  ResultSet rs =st.executeQuery("select select_site from booking_pannel where select_site like '%"+s1+"%' ");

       while(rs.next()){
                p1=rs.getString("select_site");
            out.println(p1);

     %>

 <%
             }
                rs.close();
            st.close();
           con.close();
        } 
    catch (Exception e) {
    System.out.println(e);
       }
    %>
