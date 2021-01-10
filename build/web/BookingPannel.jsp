<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width= device-width, initial-scale=1.0">
        <title>Booking Pannel</title>
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
         height: 320px;
         width: 300px;
         float: left;
         margin-top: 20px;
         margin-left: -20px;
         
     }
     .txt{
         font-size: 14px;
         color: #0033cc;
         font-family: serif
     }
     .txt1{
         color: red;
     } 
     .body2
     {
      /*border: 1px solid black;*/
         height: 20px;
         width: 200px;
         font-color: red;
         margin-top: 20px;
         margin-left: 450px;
     }
     
 </style> 
 
 <script type="text/javascript">
     function AddDate(){
           
    var start=document.getElementById("edate").value;
        var d=new Date(start);
        
          var dur=document.getElementById("dur").value;
          var day=parseInt(dur);
       //var da= d.setTime((d.getDate()+day));
       d.setTime((d.getTime())+day *1000*60*60*24); 
     var d1=d.getDate();
    var mon=d.getMonth()+1;
          var y=d.getFullYear();
       var d2 = mon +"/"+d1+"/"+y;
        document.getElementById("avaldate").value=d2;

     } 
  function validate(){
      function Confirm(form){
alert("Records has been Inserted"); 
form.submit();
}   
          var a=document.forms["frm"]["t1"].value.trim();
           var b=document.forms["frm"]["c1"].value.trim();
           var c=document.forms["frm"]["e1"].value.trim();
           var d=document.forms["frm"]["du1"].value.trim();
           var e=document.forms["frm"]["d1"].value.trim();
           var f=document.forms["frm"]["a1"].value.trim(); 
            var g=document.forms["frm"]["bt1"].value.trim(); 
          
  
                   if(a===""&&b===""&&c===""&&d===""&&e===""&&f===""){
                                alert("All Fields must be filled out.");
                                return false;
                                
                            }
                            else if(a==="")
                            {
                                // document.getElementById("uname").setCustomValidity("please enter suitable username");
                            
                               alert("Select site must be filled out");
                                  return false;
                            }else if(b==="")
                            {
                                // document.getElementById("uname").setCustomValidity("please enter suitable username");
                            
                               alert("City must be filled out");
                                  return false;
                            }else if(c==="")
                            {
                                // document.getElementById("uname").setCustomValidity("please enter suitable username");
                            
                               alert("Suitable date must be filled out");
                                  return false;
                            }else if(d==="")
                            {
                                // document.getElementById("uname").setCustomValidity("please enter suitable username");
                            
                               alert("Duration must be filled out");
                                  return false;
                            }
                            

                            else if(e==="")
                            {
                                // document.getElementById("uname").setCustomValidity("please enter suitable username");
                            
                               alert("Display must be filled out");
                                  return false;
                            }else if(f==="")
                            {
                                // document.getElementById("uname").setCustomValidity("please enter suitable username");
                            
                               alert("Agency must be filled out");
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
        <form onsubmit="return validate(this)" method="post" name="frm"> 
        
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
               <div class="body2"> 
                   <table>
                       <tr>
                           <td style="color:red;" >* Fields must be filled out.</td>
                             
                       </tr>
                   </table>
            <div class="body1">
                <table>
                <tr>
                    <td class="txt"> Select Site</td><td class="txt1">*</td>
                    <td> <input type="text" name="t1" id="srch"></td>
                    <div class="searchcontent" id="srchcon" >   
                                    
                                </div>  
                </tr>
                <tr>
                    <td class="txt"> City </td><td class="txt1">* </td>
                    <td> <input type="text" name="c1"></td>
                </tr>
                 <tr>
                    <td class="txt"> Exe Date</td><td class="txt1">* </td>
                    <td> <input type="date" name="e1" id="edate"></td>
                </tr>
               <tr>
                    <td class="txt"> Duration </td><td class="txt1">* </td>
                    <td> <input type="text" name="du1" id="dur" oninput="AddDate()"></td>
                </tr>
                 <tr>
                            <td class="txt"> Available </td><td class="txt1"></td>
                    <td> <input type="text" name="ad" id="avaldate"></td>
                        </tr>
                <tr>
                    <td class="txt"> Display </td><td class="txt1">* </td>
                    <td> <input type="text" name="d1"></td>
                </tr>
                
                <tr>
                    <td class="txt"> Agency</td><td class="txt1">* </td>
                    <td> <input type="text" name="a1"></td>
                </tr>
                               <td class="txt"> Upcomming</td><td class="txt1"></td>
                    <td> <input type="text" name="u1"></td>
                        </tr>
                        <tr>
                            <td class="txt"> U agency</td><td class="txt1"></td>
                    <td> <input type="text" name="u2"></td>
                        </tr>
                        <tr>
                            <td class="txt"> FOC</td><td class="txt1"></td>
                    <td> <input type="text" name="u3"></td>
                        </tr>
                </table>
                </div>             
<input type="submit" name="bt1" value="SAVE" style="margin-left: 105px;margin-top: -25px; font-size:13px; color: green;" onClick ="Confirm(this.form)">


          <%
                   if("POST".equalsIgnoreCase(request.getMethod())){
                   if(request.getParameter("t1")!=""&& request.getParameter("t1")!=null){
                   if(request.getParameter("bt1")!=null){
                   if( request.getParameter("bt1").equals("SAVE")){
                   
                             String dbURL = "jdbc:mysql://localhost:3306/shn";
                             String dbUser = "root";
                             String dbPass = "123";
                             
                            int count=0;
                 
            String s1= request.getParameter("t1");
            String s2= request.getParameter("c1");
            String s3= request.getParameter("e1");
            String s4= request.getParameter("du1");
            String s5= request.getParameter("ad");
            String s6= request.getParameter("d1");
            String s7= request.getParameter("a1");
            String s8= request.getParameter("u1");
            String s9= request.getParameter("u2");
            String s10= request.getParameter("u3");
         Connection conn = null; // connection to the database
         
        String message = null;  // message will be sent back to client
       //int auto_id;
       
       if(s1!=null && s2!=null && s3!=null && s4!=null && s5!=null && s6!=null&& s7!=null && s8!=null&& s9!=null &&s10!=null){
	 		 // check if the text box having only blank spaces
	     if(s1!="" && s2!="" && s3!="" && s4!="" && s5!="" && s6!=""&& s7!=""&& s8!=""&& s9!="" && s10!="") {
	                 try {
              
	     DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
  String queryString = "insert into booking_pannel(select_site,ctiy,exeDate,duration,available,"
          + "display,agency,upcomming,uagency,foc) values(?,?,?,?,?,?,?,?,?,?)";
  PreparedStatement pstatement=conn.prepareStatement(queryString);
      //String str1=(String)session.getAttribute("site");
                            
      // pstatement.setInt(1, id);
                        pstatement.setString(1, s1);
			pstatement.setString(2, s2);
			pstatement.setString(3, s3);
                        pstatement.setString(4, s4);
                        pstatement.setString(5, s5);
                        pstatement.setString(6, s6);
                        pstatement.setString(7, s7);
                        pstatement.setString(8, s8);
                        pstatement.setString(9, s9);
                        pstatement.setString(10, s10);
                        int  updateQuery = pstatement.executeUpdate();
                       if (updateQuery != 0) { %>
	           <br>
	           <table style="background-color: #E3E4FA;" 
                   WIDTH="30%" border="1">
		      <tr><th>Data is inserted successfully 
                    in database.</th></tr>
		   </table>
   %>
     <%
           } 
            }catch (Exception ex) {
            out.println("Unable to connect"+ex);
   
               }
            finally {

        response.sendRedirect("BookingPannel.jsp");//to avoid unused data while  refresh
              conn.close();


            }
	  }
	}
}
}
}
}
%>  
</form> 
 </body>
</html>


