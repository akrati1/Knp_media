package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import auto.NewClass;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class AddNewMedia_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width= device-width, initial-scale=1.0\">\n");
      out.write("        <title>Add New Media</title>\n");
      out.write(" <link href=\"style2.css\" rel=\"stylesheet\" type=\"text/css\" /> \n");
      out.write(" <style>\n");
      out.write("     .head{\n");
      out.write("             /*border: 1px solid black;*/\n");
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
      out.write("                    margin-left: 110px;\n");
      out.write("                    \n");
      out.write("                    \n");
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
      out.write("       .body1{\n");
      out.write("                 /*border: 1px solid black;*/\n");
      out.write("                    height: 40px;\n");
      out.write("                    width:50px;\n");
      out.write("                    margin-top: 10px;\n");
      out.write("                    margin-left: 55px;\n");
      out.write("                }\n");
      out.write("                 .tb3{\n");
      out.write("                    \n");
      out.write("                     text-align: center;\n");
      out.write("                     font-size: 12px;\n");
      out.write("                  \n");
      out.write("                }\n");
      out.write("                \n");
      out.write(" </style>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("  function validate()\n");
      out.write("  function Confirm(form){\n");
      out.write("alert(\"Records has been Inserted\"); \n");
      out.write("form.submit();\n");
      out.write("}  \n");
      out.write("       var a=document.forms[\"frm\"][\"pform\"].value.trim();\n");
      out.write("       var b=document.forms[\"frm\"][\"city\"].value.trim();\n");
      out.write("       var c=document.forms[\"frm\"][\"media\"].value.trim();\n");
      out.write("       var d=document.forms[\"frm\"][\"size\"].value.trim();\n");
      out.write("       var e=document.forms[\"frm\"][\"locat\"].value.trim();\n");
      out.write("       var f=document.forms[\"frm\"][\"facing\"].value.trim();\n");
      out.write("       var g=document.forms[\"frm\"][\"button1\"].value.trim();\n");
      out.write("        \n");
      out.write("        if(a===\"\"&&b===\"\"&&c===\"\"&&d===\"\"&&e===\"\"&&f===\"\"){\n");
      out.write("             alert(\"All Fields must be filled out.\")\n");
      out.write("             return false;\n");
      out.write("                                \n");
      out.write("                            }\n");
      out.write("                           else if(a===\"\")\n");
      out.write("                            {\n");
      out.write("                               alert(\"Purchase data must be filled out.\");\n");
      out.write("                                  return false;\n");
      out.write("                            }\n");
      out.write("                           else if(b===\"\")\n");
      out.write("                            {\n");
      out.write("                               alert(\"City must be filled out.\");\n");
      out.write("                                  return false;\n");
      out.write("                            }\n");
      out.write("                            else if(c===\"\")\n");
      out.write("                            {\n");
      out.write("                               alert(\"Media must be filled out.\");\n");
      out.write("                                  return false;\n");
      out.write("                            }\n");
      out.write("                            else if(d===\"\")\n");
      out.write("                            {\n");
      out.write("                               alert(\"Size must be filled out.\");\n");
      out.write("                                  return false;\n");
      out.write("                            }\n");
      out.write("                            else if(e===\"\")\n");
      out.write("                            {\n");
      out.write("                               alert(\"Location must be filled out.\");\n");
      out.write("                                  return false;\n");
      out.write("                            }\n");
      out.write("                            else if(f===\"\")\n");
      out.write("                            {\n");
      out.write("                               alert(\"Facing must be filled out.\");\n");
      out.write("                                  return false;\n");
      out.write("                            }\n");
      out.write("                             else if (g===\"SAVE\") {\n");
      out.write("                                 alert(\"Records has been Inserted\");\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("         return true;\n");
      out.write("    }         \n");
      out.write("    } \n");
      out.write("</script>\n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form method=\"post\" name=\"frm\">  \n");
      out.write("            <div class=\"head\">  \n");
      out.write("            <div class=\"txthead\">   \n");
      out.write("                <h>KNP MEDIA </h>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("             ");

            String str=(String)session.getAttribute("user");
           
            
      out.write(" \n");
      out.write("            <div class=\"admin\" > Welcome ");
      out.print( str );
      out.write(" \n");
      out.write("            <div class=\"logout\"><a style=\"text-decoration:none; color:white\" href=\"login.jsp\">LOGOUT</a></div>\n");
      out.write("            </div>\n");
      out.write("   </div>\n");
      out.write("        <div class=\"nav\">\n");
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
      out.write("                \n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"body1\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"tb3\">Purchase From </td>\n");
      out.write("                        <td class=\"tb3\"> City</td>\n");
      out.write("                        <td class=\"tb3\"> Media</td>\n");
      out.write("                        <td class=\"tb3\"> Size</td>\n");
      out.write("                        <td class=\"tb3\"> Location</td>\n");
      out.write("                        <td class=\"tb3\"> Facing</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" name=\"pform\" id=\"pform\"  style=\"width:180px \" ></td>\n");
      out.write("                        <td> <input type=\"text\" name=\"city\" id=\"city\" style=\"width:180px \"></td>\n");
      out.write("                        <td> <input type=\"text\" name=\"media\" id=\"media\" style=\"width:180px \"></td>\n");
      out.write("                        <td> <input type=\"text\" name=\"size\"  id=\"size\" style=\"width:180px \"></td>\n");
      out.write("                        <td> <input type=\"text\" name=\"locat\" id=\"locat\"  style=\"width:180px \"></td>\n");
      out.write("                        <td> <input type=\"text\" name=\"facing\" id=\"facing\" style=\"width:180px \"></td>\n");
      out.write("                    </tr>\n");
      out.write("                         </table>\n");
      out.write("        </div>\n");
      out.write("<input type=\"submit\" name=\"bt1\" value=\"SAVE\" style=\"margin-left:585px;margin-top: 18px; font-size:13px; color: green;\" onClick =\"Confirm(this.form)\">\n");
      out.write("             </form>\n");
      out.write("</form>      \n");
      out.write("             ");

 
                   if(request.getParameter("button1")!=null && request.getParameter("button1")!=""){
                       if(request.getParameter("button1").equals("SAVE")){
                   if(request.getParameter("pform")!=null&&request.getParameter("pform")!=""){
                             String dbURL = "jdbc:mysql://localhost:3306/shn";
                             String dbUser = "root";
                             String dbPass = "123";
            String s1= request.getParameter("pform");
            String s2= request.getParameter("city");
            String s3= request.getParameter("media");
            String s4= request.getParameter("size");
            String s5= request.getParameter("locat");
            String s6= request.getParameter("facing");
         Connection conn = null; // connection to the database
        String message = null;  // message will be sent back to client
       
       
       if(s1!=null && s2!=null && s3!=null && s2!=null && s5!=null && s6!=null){
	 		 // check if the text box having only blank spaces
	     if(s1!="" && s2!="" && s3!="" && s4!="" && s5!="" && s6!="") {
	                 try {
              
	     DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
            
  String queryString = "insert into adddata(pform,city,media,size,location,facing,action)values(?,?,?,?,?,?,?)";
       PreparedStatement pstatement = conn.prepareStatement(queryString);
    //  pstatement.setInt(1, id);
                        pstatement.setString(1, s1);
			  pstatement.setString(2, s2);
			  pstatement.setString(3, s3);
                           pstatement.setString(4, s4);
                            pstatement.setString(5, s5);
                             pstatement.setString(6, s6);
                              pstatement.setString(7,"EDIT");
                             
                  int  updateQuery = pstatement.executeUpdate();
                            if (updateQuery != 0) { 
      out.write("\n");
      out.write("\t           <br>\n");
      out.write("\t           <TABLE>\n");
      out.write("\t\t      <tr><th>Records has been Inserted .</th></tr>\n");
      out.write("                    \n");
      out.write("\t\t   </table>\n");
      out.write("              ");

                  
              }
            } 
            catch (Exception ex) {
            out.println("Unable to connect"+ex);
   
               }
            finally {
response.sendRedirect("AddNewMedia.jsp");
              conn.close();
            }
	  }
	}
}
}}


      out.write("\n");
      out.write("      \n");
      out.write("        </form\n");
      out.write("      </body>\n");
      out.write("      \n");
      out.write("</html>\n");
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
