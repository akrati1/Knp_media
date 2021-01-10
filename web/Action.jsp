<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
         <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.1/themes/base/jquery-ui.css" rel="stylesheet" />
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.1/jquery-ui.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width= device-width, initial-scale=1.0">
        
        <title>Action page</title>
 <link href="style2.css" rel="stylesheet" type="text/css"/>
 <style>
     .head{
              /*border: 1px solid black;*/
               height: 70px;
                width: 1220px;
                 margin-left: 3px;
                 background-image: url("backpic.jpg");   
                
       }
     
      .nav{
                    width: 995px;
                    background-color:  #9999ff;
                    margin-left: 110px;
                }
                .admin{
                  /*border: 1px solid black;*/
                    margin-left:880px;
                    margin-top:20px;
                    height: 40px;
                    width: 90px;
                    color: white;
                    font-size: 13px;  float: left;
                }
                .logout{
                   /*border: 1px solid black;*/
                     background: bottom;
                     height:20px;
                     width: 60px;
                     padding:.5%; 
                     margin-top:5px;
                     margin-left:15px;
                     text-align: center;
                     float: left;                   
                     font-size: 13.5px;
                   
                }
       .v1{
              /*border: 1px solid black;*/
               height: 160px;
                width: 1160px;
                 margin-top:20px;
                 margin-left:20px;
       }
 </style>
 <script type="text/javascript">
  function AddDate(){
    var start=document.getElementById("exed").value;
        var d=new Date(start);
        var end=document.getElementById("compd").value;
        var d1=new Date(end);
       var timeDiff = Math.abs(d1.getTime() - d.getTime());
       var diffDays = Math.ceil(timeDiff /(1000 * 3600 * 24)); 
    document.getElementById("dur").value=diffDays;
          
     } 
     function AddDate1(){
      
    var start=document.getElementById("uexed").value;
        var ud=new Date(start);
  
          var end=document.getElementById("ucompd").value;
          var ud1=new Date(end);
        
        var timeDiff = Math.abs(ud1.getTime() - ud.getTime());
   var diffDays1 = Math.ceil(timeDiff /(1000 * 3600 * 24)); 
    document.getElementById("udur").value=diffDays1;
     }
 </script>
    </head>
    <body>
        <form onsubmit="return validate(this)" method="post" name="frm" action="Action.jsp">
        <div class="head">  
            <div class="txthead">   
                KNP MEDIA 
            </div>
             <%
            String str=(String)session.getAttribute("user");
        %>
            <div class="admin" > Welcome <%= str %> 
            <div class="logout"><a style="text-decoration:none; color:white" href="login.jsp">LOGOUT</a></div>
            </div>
   </div>
        <div class="nav">
            <table>
                <tr>
                <td class="col"> <a style="text-decoration: none ;color: black;" href="Mediakanpur.jsp">Media Kanpur</a>  
                </td> 
                    
                <td class="col"> <a style="text-decoration: none ;color: black;" href="Mediapurchase.jsp">Media purchase</a>
                </td> 
                <td class="col"> <a style="text-decoration: none ;color: black;" href=Data.jsp>Data</a>
                </td> 
                <td class="col"> <a style="text-decoration: none ;color: black;" href=AddNewMedia.jsp>Add New Media Site</a>
               </td> 
               <td class="col"> <a style="text-decoration: none ;color: black;" href="BookingPannel.jsp">Booking Panel</a>
                </td> 
                <td class="col"> <a style="text-decoration: none ;color: black;" href="UploadPhoto.jsp">Upload Photo</a>
                </td> 
                <td class="col"> <a style="text-decoration: none ;color: black;" href="AdminHome.jsp">Admin Home</a>
                </td> 
                <td class="col"> <a style="text-decoration: none ;color: black;" href="ChangePassword.jsp">Change Password</a>
                </td>
                </tr>
            </table>
        </div>
           <% 
        String p1 = "";
        String p2 = "";
        String p3 = "";
        String p4 = "";
        String p5 = "";
        String p6 = "";
        String p7 = "";
        String p8 = "";
        String p9 = "";
        String p10 = "";
       
    %>
    <%
        try {
            String s21=request.getParameter("id");
            String s1=request.getParameter("selst");
            String s2= request.getParameter("uid");
            String s3 = request.getParameter("pf");
            String s4 = request.getParameter("city");
            String s5 = request.getParameter("foc");
            String s6 = request.getParameter("display");
            String s7 = request.getParameter("agency");
            String s8 = request.getParameter("exedate");
            String s9 = request.getParameter("dur");
            String s10 = request.getParameter("cd");
            String s11 = request.getParameter("uc");
            String s12 = request.getParameter("uagency");
            String s13 = request.getParameter("uexe");
            String s14 = request.getParameter("udur");
            String s15 = request.getParameter("ucd");
            %>
            <%
             Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shn", "root", "123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from merg where uid='"+s21+"' ");
                 while (rs.next()) {
                p2 = rs.getString("pform");
                p3 = rs.getString("facing");
                p4 = rs.getString("media");
                p5 = rs.getString("size");
               p6 = rs.getString("location");
                p7 = rs.getString("city");
                p8 = rs.getString("uid");
                %>
<div class="v1">
 <table>
<tr>
    <td class="col1" style=" font-size: 12px;">Select Site</td>
    <td class="col1" ><input type="text" name="selst" readonly="readonly" value="<%out.println(p4);%>-<%out.println(p5);%>-<%out.println(p6);%>-<%out.println(p3);%>-<%out.println(p2);%>"  style="color: brown;"></td>                   
    <td class="col1" style=" font-size: 12px;">Media_Id</td>
    <td class="col1"><input type="text" name="uid" readonly="readonly" value="<%out.println(p8); %>"  style="color:brown;"></td> </tr>
<tr>
<td></td>
 <td></td>
 <td class="col1" style=" font-size: 12px;">Purchase From</td>
 <td class="col1"><input type="text" name="pf" value="<%out.println(p2); %>"></td>
 <td class="col1" style=" font-size: 12px;">City</td>
 <td class="col1"><input type="text" name="city" value="<%out.println(p7); %>"></td>
<td class="col1" style=" font-size: 12px;">Foc</td>
<td class="col1"><input type="text" name="foc" ></td>
</tr>
 <tr>
   <td class="col1" style=" font-size: 12px;">Display</td>
     <td class="col1"><input type="text" name="display"></td> 
     <td class="col1" style=" font-size: 12px;">Agency</td>
     <td class="col1"><input type="text" name="agency"></td>
     <td class="col1" style=" font-size: 12px;" >Exe Date</td>
     <td class="col1"><input type="date" name="exedate" id="exed"></td>
     <td class="col1" style=" font-size: 12px;" >Comp Date</td>
     <td class="col1"><input type="date" name="cd" id="compd" oninput="AddDate()"></td>
<td class="col1" style=" font-size: 12px;" >Duration</td>
 <td class="col1"><input type="text" name="dur"id="dur" ></td>                                           
  </tr>            
   <tr>
 <td class="col1" style=" font-size: 12px;">Upcoming</td>
  <td class="col1"><input type="text" name="uc"></td>                     
 <td class="col1" style=" font-size: 12px;">U Agency</td>
 <td class="col1"><input type="text" name="uagency"></td>
 <td class="col1" style=" font-size: 12px;">U Exe Date</td>
  <td class="col1"><input type="date" name="uexe" id="uexed"></td>
 <td class="col1" style=" font-size: 12px;">U Comp Date</td>
 <td class="col1"><input type="date" name="ucd" id="ucompd" oninput="AddDate1()"></td>  
  <td class="col1" style=" font-size: 12px;">U Dur</td>
<td class="col1"><input type="text" name="udur" id="udur"  ></td>
</tr>
 <tr>
<td></td>
        <td></td>
         <td></td>
          <td></td>
<td><input type="submit" name="bt1" value="Save" style="font-size:14px; color: green; margin-top: 10px;" ></td>
                    </tr>
                    </table>
            </div>
    </form>
        <% }       
if(s1!=null && s2!=null && s3!=null && s4!=null && s5!=null && s6!=null&& s7!=null && s8!=null&& s9!=null && s10!=null)
{
 // check if the text box having only blank spaces
if(s1!="" && s2!="" && s3!="" && s4!="" && s5!="" && s6!=""&& s7!=""&& s8!=""&& s9!=""&& s10!=""){
String queryString = "Update merg set select_site=?,pform=?,city=?,foc=?,display=?,agency=?,"
+ "exedate=?,compdate=?,duration=?,upcomming=?,uagency=?,uexedate=?,ucompdate=?,uduration=?  where uid='"+s2+"' ";
                    PreparedStatement pstatement = con.prepareStatement(queryString);
                        pstatement.setString(1, s1);
			pstatement.setString(2, s3);
                        pstatement.setString(3, s4);
                        pstatement.setString(4, s5);
                        pstatement.setString(5, s6);
                        pstatement.setString(6, s7);
                        pstatement.setString(7, s8);
                        pstatement.setString(8, s10); 
                        pstatement.setString(9, s9);
                        pstatement.setString(10, s11);
                        pstatement.setString(11, s12);
                        pstatement.setString(12, s13);
                        pstatement.setString(13, s15);
                        pstatement.setString(14, s14);
               
                   int  updateQuery = pstatement.executeUpdate();
                }
            }    
 
                      %>
          <%    
            rs.close();
            st.close();
            con.close();
        } 
        catch (Exception e)
        {
        out.println( e);
        }
        %>
    
</body>
</html>

