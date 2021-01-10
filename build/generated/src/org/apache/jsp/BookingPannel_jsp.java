package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class BookingPannel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width= device-width, initial-scale=1.0 \">\n");
      out.write("        <title>Booking Pannel</title>\n");
      out.write(" <link href=\"style2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write(" <style>\n");
      out.write(".head{\n");
      out.write("              /*border: 1px solid black;*/\n");
      out.write("               height: 70px;\n");
      out.write("                width: 1220px;\n");
      out.write("                 margin-left: 3px;\n");
      out.write("                 background-image: url(\"backpic.jpg\");   \n");
      out.write("                \n");
      out.write("       }\n");
      out.write("       \n");
      out.write("      .nav{\n");
      out.write("                    width: 995px;\n");
      out.write("                    background-color:  #9999ff;\n");
      out.write("                    margin-left: 110px;                                      \n");
      out.write("                }\n");
      out.write("                .admin{\n");
      out.write("                   /*border: 1px solid black;*/\n");
      out.write("                    margin-left:880px;\n");
      out.write("                    margin-top:20px;\n");
      out.write("                    height: 40px;\n");
      out.write("                    width: 90px;\n");
      out.write("                    color: white;\n");
      out.write("                    font-size: 13px;  float: left;\n");
      out.write("                  \n");
      out.write("                   \n");
      out.write("                }\n");
      out.write("                .logout{\n");
      out.write("                   /*border: 1px solid black;*/\n");
      out.write("                     background: bottom;\n");
      out.write("                     height:20px;\n");
      out.write("                     width: 60px;\n");
      out.write("                     padding:.5%; \n");
      out.write("                     margin-top:5px;\n");
      out.write("                     margin-left:15px;\n");
      out.write("                     text-align: center;\n");
      out.write("                     float: left;                   \n");
      out.write("                     font-size: 13.5px;\n");
      out.write("                   \n");
      out.write("                }\n");
      out.write("                \n");
      out.write("    \n");
      out.write("     .body1{\n");
      out.write("        /*border: 1px solid black;*/\n");
      out.write("         height: 320px;\n");
      out.write("         width: 300px;\n");
      out.write("         float: left;\n");
      out.write("         margin-top: 20px;\n");
      out.write("         margin-left: -20px;\n");
      out.write("         \n");
      out.write("     }\n");
      out.write("     .txt{\n");
      out.write("         font-size: 14px;\n");
      out.write("         color: #0033cc;\n");
      out.write("         font-family: serif\n");
      out.write("     }\n");
      out.write("     .txt1{\n");
      out.write("         color: red;\n");
      out.write("     } \n");
      out.write("     .body2\n");
      out.write("     {\n");
      out.write("      /*border: 1px solid black;*/\n");
      out.write("         height: 20px;\n");
      out.write("         width: 200px;\n");
      out.write("         font-color: red;\n");
      out.write("         margin-top: 20px;\n");
      out.write("         margin-left: 450px;\n");
      out.write("     }\n");
      out.write("     \n");
      out.write(" </style> \n");
      out.write(" \n");
      out.write("   \n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("           \n");
      out.write("  function validate(){\n");
      out.write("      function Confirm(form){\n");
      out.write("alert(\"Records insert successfully!\"); \n");
      out.write("form.submit();\n");
      out.write("}\n");
      out.write("\n");
      out.write("           \n");
      out.write("           var a=document.forms[\"frm\"][\"t1\"].value.trim();\n");
      out.write("           var b=document.forms[\"frm\"][\"c1\"].value.trim();\n");
      out.write("           var c=document.forms[\"frm\"][\"e1\"].value.trim();\n");
      out.write("           var d=document.forms[\"frm\"][\"du1\"].value.trim();\n");
      out.write("           var e=document.forms[\"frm\"][\"d1\"].value.trim();\n");
      out.write("           var f=document.forms[\"frm\"][\"a1\"].value.trim(); \n");
      out.write("           \n");
      out.write("  \n");
      out.write("                   if(a===\"\"&&b===\"\"&&c===\"\"&&d===\"\"&&e===\"\"&&f===\"\"){\n");
      out.write("                                alert(\"Fields must be filled out\");\n");
      out.write("                                return false;\n");
      out.write("                                \n");
      out.write("                            }\n");
      out.write("                            else if(a===\"\")\n");
      out.write("                            {\n");
      out.write("                                // document.getElementById(\"uname\").setCustomValidity(\"please enter suitable username\");\n");
      out.write("                            \n");
      out.write("                               alert(\"Select site must be filled out\");\n");
      out.write("                                  return false;\n");
      out.write("                            }else if(b===\"\")\n");
      out.write("                            {\n");
      out.write("                                // document.getElementById(\"uname\").setCustomValidity(\"please enter suitable username\");\n");
      out.write("                            \n");
      out.write("                               alert(\"City must be filled out\");\n");
      out.write("                                  return false;\n");
      out.write("                            }else if(c===\"\")\n");
      out.write("                            {\n");
      out.write("                                // document.getElementById(\"uname\").setCustomValidity(\"please enter suitable username\");\n");
      out.write("                            \n");
      out.write("                               alert(\"Suitable date must be filled out\");\n");
      out.write("                                  return false;\n");
      out.write("                            }else if(d===\"\")\n");
      out.write("                            {\n");
      out.write("                                // document.getElementById(\"uname\").setCustomValidity(\"please enter suitable username\");\n");
      out.write("                            \n");
      out.write("                               alert(\"Duration must be filled out\");\n");
      out.write("                                  return false;\n");
      out.write("                            }\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            else if(e===\"\")\n");
      out.write("                            {\n");
      out.write("                                // document.getElementById(\"uname\").setCustomValidity(\"please enter suitable username\");\n");
      out.write("                            \n");
      out.write("                               alert(\"Display must be filled out\");\n");
      out.write("                                  return false;\n");
      out.write("                            }else if(f===\"\")\n");
      out.write("                            {\n");
      out.write("                                // document.getElementById(\"uname\").setCustomValidity(\"please enter suitable username\");\n");
      out.write("                            \n");
      out.write("                               alert(\"Agency must be filled out\");\n");
      out.write("                                  return false;\n");
      out.write("                            }\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                \n");
      out.write("                            return true;\n");
      out.write("    }\n");
      out.write("   </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form onsubmit=\"return validate(this)\" method=\"post\" name=\"frm\"> \n");
      out.write("            <form name=\"form\" method=\"post\" action=\"\">\n");
      out.write("            <div class=\"head\">  \n");
      out.write("            <div class=\"txthead\">   \n");
      out.write("                <h>KNP MEDIA </h>\n");
      out.write("            </div>\n");
      out.write("             ");

            String str=(String)session.getAttribute("user");
           
            
      out.write(" \n");
      out.write("            <div class=\"admin\" > Welcome ");
      out.print( str );
      out.write(" \n");
      out.write("            <div class=\"logout\"><a style=\"text-decoration:none; color:white\" href=\"login.jsp\">LOGOUT</a></div>\n");
      out.write("            </div>\n");
      out.write("   </div>\n");
      out.write("         <div class=\"nav\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=\"Mediakanpur.jsp\">Media Kanpur</a>  \n");
      out.write("                </td> \n");
      out.write("                    \n");
      out.write("                  <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=\"Mediapurchase.jsp\">Media purchase</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=Data.jsp>Data</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=AddNewMedia.jsp>Add New Media Site</a>\n");
      out.write("               </td> \n");
      out.write("               <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=\"BookingPannel.jsp\">Booking Panel</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=\"UploadPhoto.jsp\">Upload Photo</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=\"AdminHome.jsp\">Admin Home</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=\"ChangePassword.jsp\">Change Password</a>\n");
      out.write("                </td> \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("               <div class=\"body2\"> \n");
      out.write("                   <table>\n");
      out.write("                       <tr>\n");
      out.write("                           <td style=\"color:red;\" >* Fields must be filled out.</td>\n");
      out.write("                       </tr>\n");
      out.write("                   </table>\n");
      out.write("            <div class=\"body1\">\n");
      out.write("                <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"txt\"> Select Site</td><td class=\"txt1\">*</td>\n");
      out.write("                    <td> <input type=\"text\" name=\"t1\"></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"txt\"> City </td><td class=\"txt1\">* </td>\n");
      out.write("                    <td> <input type=\"text\" name=\"c1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td class=\"txt\"> Exe Date</td><td class=\"txt1\">* </td>\n");
      out.write("                    <td> <input type=\"date\" name=\"e1\"></td>\n");
      out.write("                </tr>\n");
      out.write("               <tr>\n");
      out.write("                    <td class=\"txt\"> Duration </td><td class=\"txt1\">* </td>\n");
      out.write("                    <td> <input type=\"number\" name=\"du1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"txt\"> Display </td><td class=\"txt1\">* </td>\n");
      out.write("                    <td> <input type=\"text\" name=\"d1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"txt\"> Agency</td><td class=\"txt1\">* </td>\n");
      out.write("                    <td> <input type=\"text\" name=\"a1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("               <tr>\n");
      out.write("                            <td class=\"txt\"> D2</td><td class=\"txt1\"></td>\n");
      out.write("                    <td> <input type=\"text\" name=\"d2\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"txt\"> D2 agency</td><td class=\"txt1\"></td>\n");
      out.write("                    <td> <input type=\"text\" name=\"d3\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"txt\"> Upcomming</td><td class=\"txt1\"></td>\n");
      out.write("                    <td> <input type=\"text\" name=\"u1\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"txt\"> U agency</td><td class=\"txt1\"></td>\n");
      out.write("                    <td> <input type=\"text\" name=\"u2\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"txt\"> FOC</td><td class=\"txt1\"></td>\n");
      out.write("                    <td> <input type=\"text\" name=\"u3\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                </table>\n");
      out.write("                </div>\n");
      out.write(" <input type=\"submit\" name=\"bt1\" value=\"SAVE\" style=\"margin-left: 105px;margin-top: 15px; font-size:13px; color: green;\" onClick =\"Confirm(this.form)\">\n");
      out.write("        </form>\n");
      out.write("               </form> \n");
      out.write("\n");
      out.write("          ");

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
            String s5= request.getParameter("d1");
            String s6= request.getParameter("a1");
            String s7= request.getParameter("d2");
            String s8= request.getParameter("d3");
            String s9= request.getParameter("u1");
            String s10= request.getParameter("u2");
            String s11= request.getParameter("u3");
         Connection conn = null; // connection to the database
         
        String message = null;  // message will be sent back to client
       //int auto_id;
       
       if(s1!=null && s2!=null && s3!=null && s4!=null && s5!=null && s6!=null&& s7!=null && s8!=null&& s9!=null && s10!=null&& s11!=null){
	 		 // check if the text box having only blank spaces
	     if(s1!="" && s2!="" && s3!="" && s4!="" && s5!="" && s6!=""&& s7!=""&& s8!=""&& s9!=""&& s10!=""&& s11!="") {
	                 try {
              
	     DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
  String queryString = "insert into booking_pannel values(?,?,?,?,?,?,?,?,?,?,?)";
       PreparedStatement pstatement = conn.prepareStatement(queryString);
      String str1=(String)session.getAttribute("site");
                         
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
                        pstatement.setString(10,s10);
                        pstatement.setString(11,s11);
                        
             int  updateQuery = pstatement.executeUpdate();
         
          
      out.write("\n");
      out.write("\n");
      out.write("              ");

              
            } 
            catch (Exception ex) {
            out.println("Unable to connect"+ex);
   
               }
            finally {

        response.sendRedirect("BookingPannel.jsp");
              conn.close();


            }
	  }
	}
}
}
}
}

      out.write("  \n");
      out.write("       \n");
      out.write("     \n");
      out.write(" </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
