<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width= device-width, initial-scale=1.0 ">
        <title>Upload Photo</title>
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
        
     .photo{
        /*border: 1px solid black;*/
         height: 164px;
         width: 169px;
         margin-top: 100px;
         margin-left: 150px;
         background-image:url("upload.jpg"); 
     }
        .photo2{
        /*border: 1px solid black;*/
         height: 450px;
         width: 410px;
         margin-top: -340px;
         margin-left: 800px;
         background-image:url("side.jpg"); 
     } 
     
 </style>
    </head>
    <body>
        <form action="UploadServlet" method="post" enctype="multipart/form-data">
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
            <div class="photo" ></div>
            <input type="file" value="choose File"name="cimage" style="margin-left:140px;margin-top: 30px; font-size:12px; color: midnightblue;"><br>
            <input type="submit" value="Upload" name="upld" style="margin-left:140px; margin-top: 15px; font-size:12px; color: darkred;">
       
         <div class="photo2" ></div>
        </form>
    </body>
    
</html>

