<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width= device-width, initial-scale=1.0 ">
        <title>AdminHome page</title>
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
                .body1{
                 /*border: 1px solid black;*/
                    height: 40px;
                    width:200px;
                    margin-top: -90px;
                }
                .body2{
                   /*border: 1px solid black;*/
                    height: 35px;
                    width: 180px;
                    /*border: 1px solid black;*/
                    margin-top: -10px;
                }
                .body3{
                   border: 1px solid black;
                    height: 33px;
                    width: 1220px;
                    background: #cccccc;
                    margin-top: -18px;
                    
                }
                .col2{
            /*border: 1px solid black;*/
                   text-align: left;
                    height: 20px;
                    width: 750px;
                    text-align: center;
                    background:#cccccc; 
                    font-size: 11px
                }
                .sel{
                /*border: 1px solid black;*/
                  height: 130px;
                     width: 1218px;
                     margin-left: -1%;
                     margin-top: 15px;
                
                 .col1{
                    
                     text-align: center;
                     font-size: 12px;
                  
                }
 </style>
    </head>
    <body>
        
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
        <div class="sel">
                <table class="tb1" align="center">
                    <tr>
                   <td class="col1">From</td>
                   <td class="col1">To</td>                
                   <td class="col1">Location </td>
                   <td class="col1">Media</td>
                   <td class="col1">City</td>
                   </tr>
                   <tr>
                   <td class="col1" ><input type="text" name="pf"></td>
                   <td class="col1" ><input type="text" name="to"></td>
                   <td class="col1"><input type="text" name="location"></td>
                    <td class="col1">                 
                        <select>
                            <option value="select1" style="font-size: 11px;">Select</option>
                           <option value="board1" style="font-size: 11px;"> BillBoard</option>
                              <option value="cantti" style="font-size: 11px;"> Cantilever</option>
                             <option value="Divider" style="font-size: 11px;"> Divider Boards</option>
                                <option value="front" style="font-size: 11px;"> Front Facade</option>
                              <option value="gantry" style="font-size: 11px;"> Gantry</option>
                                <option value="hording" style="font-size: 11px;"> Hoarding</option>
                               <option value="pencil" style="font-size: 11px;"> Pencilpole</option>
                               <option value="pole" style="font-size: 11px;"> Pole Kiosk</option>
                             <option value="unipole" style="font-size: 11px;"> Unipole</option>
                        </select>
                        </td>
                         <td class="col1">                 
                        <select>
                            <option value="select1" style="font-size: 11px;">Select</option>
                           <option value="knp" style="font-size: 11px;"> Kanpur</option>
                              <option value="gkh" style="font-size: 11px;">Gorakhpur</option>
                        </td>
                        <td class="col1"><input type="submit" name="Search" value="Search" style="font-size:13px; color: green;"></td>
                        
                   </tr>
                  </table>
                   </div>
     <div class="body1">
         <h3 style="color: teal; font-size: 20px;">Our Media Sheet</h3>
     </div>
     <div class="body3">
         <table>
             <tr>
                 <td class="col2"><input type="checkbox" name="check" ></td>
                 <td class="col2">Media_ID</td>
                 <td class="col2">Purchase From</td>
                  <td class="col2">Media</td>
                 <td class="col2">Size</td>
                 <td class="col2">Location</td>
                 <td class="col2">Facing </td>
                 <td class="col2">Display</td>
                 <td class="col2">Agency</td>
                 <td class="col2">Exe Date</td>
                  <td class="col2">Dur</td>
                 <td class="col2">Comp date</td>                
                 <td class="col2">D2</td>
                 <td class="col2">D2 Agency</td>
                 <td class="col2">D2 Exe Date</td>
                <td class="col2">D2 Dur</td>
                <td class="col2">Comp Date</td>
                <td class="col2">Upcomming</td>
                 <td class="col2">U Agency</td>
                <td class="col2">U Dur</td>
                <td class="col2">Comp Date</td>
                <td class="col2">Aval Date</td>
                <td class="col2">Image</td>
                <td class="col2"> Action</td> 
             </tr>
         </table>
     </div>
    </body>
</html>

