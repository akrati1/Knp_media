<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width= device-width, initial-scale=1.0 ">
        <title>Change password</title>
 <link href="style2.css" rel="stylesheet" type="text/css" />
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
     .body1{
         /*border: 1px solid black;*/
         height:133px;
         width:140px;
         float:left;
         margin-top:15px;
         margin-left: 35px;
         background-image: url("cp3.jpg");
     }
      .body2{
         /*border: 1px solid black;*/
         height:30px;
         width:210px;
         margin-left:550px;
         margin-top:50px;
         
     }
     .body3{
         /*border: 1px solid black;*/
         height:130px;
         width:430px;
         float:left;
         margin-left:250px;
         margin-top:5px;
         
     }
 </style>
    <script>
      function validate(){
        
           var a=document.forms["frm"]["curpass"].value.trim();
            var b=document.forms["frm"]["np"].value.trim();
            var c=document.forms["frm"]["cp"].value.trim();
                 
   

                             if(a=="" && b=="" &&c=="")
                            {
                                alert("All Fields must be filled out");
                                return false;
                                
                            }
                            else if(a=="")
                            {
                                // document.getElementById("uname").setCustomValidity("please enter suitable username");
                            
                               alert("current password must be filled out");
                                  return false;
                            }
                            
                              else if(b=="")
                             {
                              
                                //document.getElementById("pass").setCustomValidity("please enter suitable password");
                                alert("New  Password must be filled out");
                               return false;
                            }
                              else if(c=="")
                             {
                              
                                //document.getElementById("pass").setCustomValidity("please enter suitable password");
                                alert(" Reenter new Password must be filled out");
                               return false;
                            }
                            return true;
             
      }
 </script>
    </head>
    <body>
        <form method="post" action="ChangePassword.jsp" name="frm" onsubmit="return validate(this)">
        
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
            <div class="body1">
            </div>
            <div class="body2">
                <table>
                    <tr>
                        <td> <h3 style="color: teal; margin-top:-20px;">Change Your Password</h3></td></tr></table>
     </div>
            
            
            <div class="body3">
            <table>
                <tr>
                    <td style="color: black;font-size:13px;">Current Password</td>
                    <td><input type="password" style="width:300px;" name="curpass"></td>
                </tr>
                <tr>
                    <td style="color: black;font-size:13px;">New Password</td>
                    <td><input type="password" style="width:300px;" name="np"></td>
                    
                </tr>
                <tr>
                    <td style="color: black;font-size:13px;">Confirm Password</td>
                    <td><input type="password" style="width: 300px;" name="cp"></td>
                    
                </tr>
                <tr> 
                    <td></td>
                    <td style="padding-top: 10px; padding-left: 10px;">
                        <input type="submit" name="Cpass" value="Change Password" style="font-size:12px; color: green;">
                      <input type="reset" name="rst" value="Reset" style="font-size:12px; color: midnightblue;"></td>
                </tr>
            </table>
            </div>
         <%
              
              if("POST".equalsIgnoreCase(request.getMethod())){
                   if(request.getParameter("Cpass")!=null){
                   if( request.getParameter("Cpass").equals("Change Password")){                       
                       String currpass=request.getParameter("curpass");
                       String npass=request.getParameter("np");
                       String cpass=request.getParameter("cp");
                       System.out.println("currpass");
                       Connection con=null;
                       int count=0;
                       String pass;
                       PreparedStatement ps;
                       ResultSet rs;
                       if( currpass!=null && npass!=null && cpass!=null){
                           if(currpass!="" && npass!="" && cpass!=""){
                            
	       if(npass.equals(cpass)){
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shn","root","123");
                    Statement st=con.createStatement();
                    rs=st.executeQuery("select * from login where password='"+currpass+"'");
                    while(rs.next()){
                    count++;
                    
                        }
                    
                    if(count>0){
             Statement st1=con.createStatement();
             int i=st1.executeUpdate("update login set password='"+npass+"'where admin='"+str+"'");
              out.println("<script type=\"text/javascript\">");
               out.println("alert('Password Change Successfully');");
                     out.println("</script>");
                    }
                    else{
                    response.sendRedirect("changeError.jsp");
                    }
                    
           // st1.close();
            con.close();
          } catch (Exception e) {
                 out.println("exception"+e);
                 }
                  }
                       }
                    }
                   }
               }}
        
                 %>
  
    </body>
</html>

