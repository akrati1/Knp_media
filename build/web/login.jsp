<%@page import="java.sql.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>
    <head>
        <title></title>
             <meta charset="UTF-8">
               
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            .layout{
                width: 500px;
                height: 300px;
                /*border: 1px solid black;*/
            }
            .tbl{
                width: 100%;
                height:100%;
             /*  border: 1px solid black;*/
               background-color:snow;
                
                
                            }
            .td1{
                font-family: verdana;
                font-size: 12px;
                 margin-left:5%;
                 margin-top:30%;
                height:50px;
                padding:10px;
                width: 100px;
              /*border: 1px solid black;*/
                
            }
            .txt{
               /*border: 1px solid black;*/
                width: 320px;
                height: 30px;
                padding-left:20px;
            }
            .sbt{
                width: 80px;
                height: 30px;
                background-color: dimgray;  
                margin-left:70px;
                color:black;
               /*border: 1px solid black;*/
            }
        </style>
          <script>
            function resize(){
                //alert("you are in resize");
                w=window.innerWidth;
                h=window.innerHeight;
                l=(w-400)/2;
               t=(h-180)/2;
            d=document.getElementById("mid");
            d.style.marginLeft=l;
            d.style.marginTop=t;
            }
            function validate(){
           var a=document.forms["frm"]["uname"].value.trim();
           var b=document.forms["frm"]["pass"].value.trim();
                 
   

                             if(a==="" && b==="")
                            {
                                alert("All Fields must be filled out");
                                return false;
                                
                            }
                            else if(a==="")
                            {
                                // document.getElementById("uname").setCustomValidity("please enter suitable username");
                            
                               alert("User ID must be filled out");
                                  return false;
                            }
                             else if (!a.match(/^[a-zA-Z]+$/)) 
                              {
                               alert('Only alphabets are allowed');
                                 return false;
                               }
                              else if(b==="")
                             {
                              
                                //document.getElementById("pass").setCustomValidity("please enter suitable password");
                                alert("Password must be filled out");
                               return false;
                            }
                            return true;
                            
                        
      }
              
    
    </script>
  
    </head>
    <body onload="resize()" onresize="resize()">
            <div class="layout" id="mid">
            <form onsubmit="return validate(this)"  name="frm" method="post" >
                 <table class="tbl">
                     <tr>
                         <td colspan="2" class="td1" style="margin-top:60px;color:brown; font-size:30px ;text-align: center;" > LOGIN </td>
                        
                    </tr>
                    <tr style="margin-top: 40px; ">
                        <td class="td1" style="color:brown; ">User Name</td>
                        <td ><input type="text" name="uname" id="uname" size="30" class="txt" placeholder="User Name" style="padding-left:5px "  ></td>
                    </tr>
                    <tr>
                        <td class="td1" style="color:brown">Password</td>
                        <td><input type="password"  id="pass" name="pass" size="30" class="txt" placeholder="Enter your password" style="padding-left:5px"></td>    
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" class="sbt" name="sbt" value="SUBMIT"></td>
                    </tr>
                  
                </table>
            </form>
        </div>
         <%
        if(request.getParameter("uname")!= null){
            
            
                     String s1=request.getParameter("uname");
                     String s2=request.getParameter("pass");
               
               
                   try {
                          Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shn","root","123");
        Statement st= con.createStatement();
            ResultSet rs=st.executeQuery("select * from login where admin = '" + s1 + "' and password='"+s2 +"' "); 
       if(rs.next()){
            String name=rs.getString(1)+" "+rs.getString(2);
            HttpSession ses=request.getSession();
            ses.setAttribute("user", s1);
          // ses.setAttribute("upass", s2);
            response.sendRedirect("Welcome.jsp");
        }else{
            response.sendRedirect("loginerr.jsp");
        }
        st.close();
        con.close();
             } catch (Exception e) {
                            System.out.println("exception"+e);
                           }
            }
         
                   
        
        %>
            
           
       </body>
     
     
</html>


