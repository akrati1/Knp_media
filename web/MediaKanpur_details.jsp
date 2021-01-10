

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
 <form method="post" name="frm" action="delete.jsp"> 
     
   <%
        String p1 = "";
        String p2 = "";
        String p3 = "";
        String p4 = "";
        String p5 = "";
        String p6 = "";
         String p8="";
        String p7 = "";
        String p9 = ""; 
        String p10 = "";
        String p11 = ""; 
        String p12 = "";
        String p13 = "";
        Blob p14;
        String p15 = "";
      
    %>
    <%
  try 
   { 
  Class.forName("com.mysql.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shn", "root", "123");
  Statement st = con.createStatement();
  ResultSet rs = st.executeQuery("SELECT merg.uid,merg.pform,merg.media,merg.size,merg.location,merg.facing,merg.image, "
 + "booking_pannel.exeDate,booking_pannel.duration,booking_pannel.display,booking_pannel.agency,booking_pannel.available,"
 +"booking_pannel.uagency,booking_pannel.foc FROM booking_pannel,merg WHERE merg.select_site=booking_pannel.select_site");
   %> 
   <div class="m1">
<table class="tb3" id="table3">
      <thead style="background:#f9f7f7">
          <tr>
        <th class="col2"><input type="checkbox" name="check" ></th>
                 <th class="col2">Media_ID</th>
                 <th class="col2"> Purchase From</th>
                 <th class="col2"> Media  </th>
                 <th class="col2"> Size</th>
                 <th class="col2"> Location</th>
                 <th class="col2"> Facing </th>
                 <th class="col2"> Display</th>
                 <th class="col2"> Agency</th>
                 <th class="col2"> Exe Date</th>
                 <th class="col2"> Dur</th>
                <th class="col2"> FOC</th>
                 <th class="col2"> UAgency</th>
                 <th class="col2"> Aval Date</th>
                 <th class="col2"> Image</th>
               
                 
      </tr>
      </thead>
      <%   
          Blob image = null;
         while(rs.next()){
             p1 = rs.getString("uid");
             p2 = rs.getString("pform");
             p3 = rs.getString("media");
             p4 = rs.getString("size");
             p5 = rs.getString("location");
             p6 = rs.getString("facing");
             p7= rs.getString("display");
             p8= rs.getString("agency");
           
            p9 = rs.getString("exeDate");
             p10 = rs.getString("duration");
             p11= rs.getString("foc");
            p12= rs.getString("uagency");
             p13 = rs.getString("available");
             p14=rs.getBlob("image");
          %>
          <tr name="rw1" id="row1">
              <td class="col2"><input type='checkbox' name='chk[]' value="<% out.println(p1);%>" /></td>
          <td class="col2"><% out.println(p1);%></td>
          <td class="col2"><% out.println(p2);%></td>
          <td class="col2"><%out.println(p3);%></td>
          <td class="col2"><%out.println(p4);%></td>
          <td class="col2"><%out.println(p5);%></td>
          <td class="col2"><%out.println(p6);%></td>
          <td class="col2"><%out.println(p7);%></td>
          <td class="col2"><%out.println(p8);%></td>
          <td class="col2"><%out.println(p9);%></td>
          <td class="col2"><%out.println(p10);%></td>
          <td class="col2"><%out.println(p11);%></td>
          <td class="col2"><%out.println(p12);%></td>
            <td class="col2"><%out.println(p13);%></td>
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
     <table>
              <tr>
                    <td><input type="submit" name="btn3" value="Delete" style="font-size:14px; color: green;">
              </tr>
          </table>
          </form>
