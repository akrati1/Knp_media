<%@page import="dbconn.Connections"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Media Kanpur</title>
    </head>
    <body>
        <%
            String [] id = request.getParameterValues("chk[]");
            Connection con=null;
                PreparedStatement pstmt=null;
        String ids = "";
if (id != null && id.length != 0) {
    out.println("You have selected: ");

    for (int i = 0; i < id.length; i++) {
        ids += id[i] +",";
        out.println(id[i]); 
    } //end for loop
}// end if

if (ids .endsWith(","))
    ids = ids.substring(0, ids .length() - 1);

try {
if (!"".equals(ids)){ 
    try {
             Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shn","root","123");
       String sqlStr = "Delete FROM merg WHERE uid in (?)";
     pstmt = con.prepareStatement(sqlStr);
     
    pstmt.setString(1, ids); 

    int rec=pstmt.executeUpdate();
    con.commit();
        } catch (Exception e) {
            out.println(e);
        }
    
}
} finally {
    if (pstmt != null)
       pstmt.close();
    if (con != null)
      con.close();
}
        %>
    </body>
</html>
