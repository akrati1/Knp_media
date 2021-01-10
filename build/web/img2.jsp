
<%@page import="java.io.InputStream"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<HTML>
    <HEAD>
        <TITLE>Fetching Data From a Database</TITLE>
    </HEAD>
    <BODY>
        <H1>Fetching Data From a Database</H1>
        
<%
    Connection con = null;
 int id =  Integer.parseInt(request.getParameter("imgid"));
                   ResultSet rs = null;
                String sql=null;
                PreparedStatement pst=null;
        
        OutputStream ot;
      
            try {
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shn", "root", "123");
             Statement st = con.createStatement();
             rs = st.executeQuery("select image from dimg where uid="+id);
            while(rs.next()) {
             byte barray[] = rs.getBytes(1);
             response.setContentType("image/png");
             ot=response.getOutputStream();
             ot.write(barray);
              ot.flush();
             ot.close();
    
                 }
           } catch (Exception e) {
             out.println(e);
           }finally {
                     try{
                         if(con!=null)
                        con.close();
                                 }catch(Exception ex){
                                  ex.printStackTrace();
                              }
 
                         } 
%>
    </BODY>
</HTML>
