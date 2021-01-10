<%@page import="java.io.InputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="auto.NewClass"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="javax.servlet.annotation.MultipartConfig"%>
<%@page import="javax.servlet.annotation.WebServlet"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width= device-width, initial-scale=1.0">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.1/jquery-ui.min.js"></script>
    <script async src="//jsfiddle.net/ugPDx/embed/"></script>
        <title>Add New Media</title>
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
                    height: 430px;
                    width:390px;
                    margin-top: 15px;
                    margin-left: 450px;
                }
                 .tb3{
                    
                     text-align: center;
                     font-size: 14px;
                  
                }
 </style>
 <script type="text/javascript">
             var loadFile = function(event){
             var output = document.getElementById('output');
              output.src = URL.createObjectURL(event.target.files[0]);
              };
  
    function validate(){
        var a=document.forms["frm"]["pform"].value.trim();
       var b=document.forms["frm"]["city"].value.trim();
       var c=document.forms["frm"]["media"].value.trim();
       var d=document.forms["frm"]["size"].value.trim();
       var e=document.forms["frm"]["locat"].value.trim();
       var f=document.forms["frm"]["facing"].value.trim();
       var g=document.forms["frm"]["button1"].value.trim();
        
        if(a===""&&b===""&&c===""&&d===""&&e===""&&f===""){
             alert("All Fields must be filled out.")
             return false;
                                
                            }
                           else if(a==="")
                            {
                               alert("Purchase data must be filled out.");
                                  return false;
                            }
                           else if(b==="")
                            {
                               alert("City must be filled out.");
                                  return false;
                            }
                            else if(c==="")
                            {
                               alert("Media must be filled out.");
                                  return false;
                            }
                            else if(d==="")
                            {
                               alert("Size must be filled out.");
                                  return false;
                            }
                            else if(e==="")
                            {
                               alert("Location must be filled out.");
                                  return false;
                            }
                            else if(f==="")
                            {
                               alert("Facing must be filled out.");
                                  return false;
                            }
                             else if (g==="SAVE") {
                                 alert("Records has been Inserted");
	
                                    }
         return true;
    }
</script>
    </head>
    <body>
  <form onsubmit="return validate(this)" action="UploadServlet" method="post" name="frm" enctype="multipart/form-data"> 
            <div class="head">  
            <div class="txthead">   
                <h>KNP MEDIA </h>
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
                <table>
                    <tr>
                        <td class="tb3">Purchase From </td>
                        <td><input type="text" name="pform" id="pform"  style="width:180px " ></td>
                    </tr>
                    <tr>
                        <td class="tb3"> City</td>
                        <td> <input type="text" name="city" id="city" style="width:180px "></td>
                    </tr>
                    <tr>
                        <td class="tb3"> Media</td>
                        <td> <input type="text" name="media" id="media" style="width:180px "></td>
                        
                    </tr>
                    <tr>
                        <td class="tb3"> Size</td>
                        <td> <input type="text" name="size"  id="size" style="width:180px "></td>
                    </tr>
                    <tr>
                        <td class="tb3"> Location</td>
                        <td> <input type="text" name="locat" id="locat"  style="width:180px "></td>
                    </tr>
                    <tr>
                        <td class="tb3"> Facing</td>
                        <td> <input type="text" name="facing" id="facing" style="width:180px "></td>
                    </tr>
                    <tr>
                        <td class="tb3"> Upload image</td>
                        <td><img id="output" name="img1" style="height: 170px; width:230px"/></td>
                        
                    <tr>
                        <td></td>
                        <td><input type="file" accept="image/*" name="cimage" onchange="loadFile(event)"></td>
                    </tr>
                </table> 
 <input type="submit" name="button1" value="SAVE" style="margin-left:140px;margin-top: 48px; font-size:13px; color: green;">
</div>
  </form>
 </body>
</html>