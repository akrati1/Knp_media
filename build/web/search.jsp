
     <%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width= device-width, initial-scale=1.0 " >
        <title>Data</title>
 <link href="style2.css" rel="stylesheet" type="text/css" />
    <form method="post" action="search.jsp" >
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
     .hed1{
                   border: 1px solid black;
                    height: 25px;
                    width:970px;
                    background: #cccccc;
                   margin-top: -25px;
                }
                 .col2{
            /*border: 1px solid black;*/
    text-align: left;
  
                    height: 20px;
                    width: 70px;
                    text-align: center;
                    background:#cccccc;  
                    font-size: 11px;
                }
                .hed{
                  /*border: 1px solid black;*/
                    height: 50px;
                    width:1200px;
                    margin-top: -100px;
                }
                .mid{
                /*border: 1px solid black;*/
                  height: 130px;
                     width: 1218px;
                     margin-left:-150px;
                     margin-top: 15px;
        </style>
    </head>
    <body>
            <div class="head">  
            <div class="txthead">   
                KNP MEDIA 
            </div>
             <%
            String str=(String)session.getAttribute("myuser");
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
       
            <div class="mid">
                <table class="tb1" align="center">
                    <tr>
                        <td class="col1">Purchase From</td>
                 
                     <tr>                   
                    <td class="col1"> 
                        <input type="text" name="sel" id="select">
                            
                   </td>                  
                    <td>
<input type="submit" value="search" name="src">
                        </td>
                    </tr>                            
        </table>
     </div>
                        </form>
     <div class="hed">
         <h3 style="color: teal;">Purchase Media Sheet </h3>
     </div>
           
              <jsp:include page="welcome_details1.jsp"></jsp:include> 
    </body>
</html>

