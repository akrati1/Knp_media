<%@ page import="java.sql.*,java.io.*,java.util.*" %> 
<HTML>
 <table border="1">
 <tr><th>ID</th><th>Image</th></tr>
   <%
  try{      
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shn","root","123");
    Statement stmt=con.createStatement();
    String strQuery = "select uid from dimg" ;
    ResultSet rs = stmt.executeQuery(strQuery);
    while(rs.next()){
     String  p1= rs.getString("uid");
       %>
      <tr>
      <td><% out.println(p1);  %></td>
      <td>
      <img src="img2.jsp?imgid=<%=rs.getInt(1)%>" width="100" height="100">
</a></td>
      </tr>
      <%
    }
    rs.close();
    con.close();
    stmt.close();
  }
  catch(Exception e)
  {
    e.getMessage();
  }
  %>
 </table>
</HTML>
 

 
