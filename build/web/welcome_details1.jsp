
<%@page import="java.sql.Blob"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.DataInputStream"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.*"%>
<style>
  .tb3{
   border: 1px solid gray;
  border-collapse: collapse;
  height: 100px;
  width: 1220px;
    }  
    .col2{
  border:.5px solid graytext;
  border-collapse: collapse;
  text-align: left;
  height: 20px;
  width: 85px;
  text-align:center;
  font-size:11px;
           }
        .m1{
             margin-top:-25px;
             }
             .edit{
                 overflow: hidden;
                /*border: 1px solid gray;*/
                 height: 50px;
                 width: 220px;
                 margin-top:-175px;
                 margin-left: 620px;
                 position: fixed;
             }
</style>
<form method="post"  action="Action.jsp">
   <%
        String p1 = "";
        String p2 = "";
        String p3 = "";
        String p4 = "";
        String p5 = "";
        String p6 = "";
        String p7 = "";
        Blob p8;
        String p9 = ""; 
        String p10 = "";
        String p11=request.getParameter("sel");
    %>
    <%
   try 
   { 
  Class.forName("com.mysql.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shn", "root", "123");
  Statement st = con.createStatement();
  ResultSet rs = st.executeQuery("select uid,pform,city,media,size,location,facing,image from merg where pform='"+p11+"' ");
   %> 
   <div class="m1">
<table class="tb3" id="table3">
      <thead style="background:#f9f7f7">
          <tr>
      <th class="col2"><input type="checkbox" name="check"></th>
      <th class="col2" >Media_ID</th>
      <th class="col2">Purchase Form</th>
      <th class="col2">Media</th>
      <th class="col2">Size</th>
      <th class="col2">Location</th>
      <th class="col2">Facing </th>
      <th class="col2">city</th>
      <th class="col2">Agency</th>
      <th class="col2">D2</th>
      <th class="col2">U Agency</th>
      <th class="col2">Image</th>
      </tr>
      </thead>
      <%   
          Blob image = null;
         while(rs.next()){
             p1 = rs.getString("uid");
             p2 = rs.getString("pform");
             p3 = rs.getString("city");
             p4 = rs.getString("media");
             p5 = rs.getString("size");
             p6 = rs.getString("location");
             p7 = rs.getString("facing");
            // p8=rs.getBlob("image");
             
          %>
          <tr name="rw1" id="row1">
          <td class="col2"><% out.println("<input type='checkbox' name='chbx'/>");%></td>
          <td class="col2"><% out.println(p1);%></td>
          <td class="col2"><%out.println(p2);%></td>
          <td class="col2"><%out.println(p3);%></td>
          <td class="col2"><%out.println(p4);%></td>
          <td class="col2"><%out.println(p5);%></td>
          <td class="col2"><%out.println(p6);%></td>
          <td class="col2"><%out.println(p7);%></td>
          <td class="col2"><%out.println();%></td>
          <td class="col2"><%out.println();%></td>
          <td class="col2"><%out.println();%></td>
          <td class="col2"><img src="image2.jsp?imgid=<%=rs.getInt(1)%>" width="50" height="50"></td>
          
          </tr>
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
    </table>
</div>
    <div class="edit">
    <table>
     <tr>
         <td class="col1">Edit Your Record</td>
     </tr>
     <tr>
      <td><input type="number" name="id" placeholder="Enter Media_ID"></td>
      <td><input type="submit" name="sbt" style="color:green; font-size: 13px;"value="EDIT"></td>
             </tr>
    </table>
    </div>
   
</form>
