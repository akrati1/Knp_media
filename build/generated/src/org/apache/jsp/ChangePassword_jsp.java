package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class ChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width= device-width, initial-scale=1.0 \">\n");
      out.write("        <title>Change password</title>\n");
      out.write(" <link href=\"style2.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write(" <style>\n");
      out.write("     .head{\n");
      out.write("              /*border: 1px solid black;*/\n");
      out.write("               height: 70px;\n");
      out.write("                width: 1220px;\n");
      out.write("                 margin-left: 3px;\n");
      out.write("                 background-image: url(\"backpic.jpg\");   \n");
      out.write("                \n");
      out.write("       }\n");
      out.write("       \n");
      out.write("      .nav{\n");
      out.write("                   width: 995px;\n");
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
      out.write("     .body1{\n");
      out.write("         /*border: 1px solid black;*/\n");
      out.write("         height:133px;\n");
      out.write("         width:140px;\n");
      out.write("         float:left;\n");
      out.write("         margin-top:15px;\n");
      out.write("         margin-left: 35px;\n");
      out.write("         background-image: url(\"cp3.jpg\");\n");
      out.write("     }\n");
      out.write("      .body2{\n");
      out.write("         /*border: 1px solid black;*/\n");
      out.write("         height:30px;\n");
      out.write("         width:210px;\n");
      out.write("         margin-left:550px;\n");
      out.write("         margin-top:50px;\n");
      out.write("         \n");
      out.write("     }\n");
      out.write("     .body3{\n");
      out.write("         /*border: 1px solid black;*/\n");
      out.write("         height:130px;\n");
      out.write("         width:430px;\n");
      out.write("         float:left;\n");
      out.write("         margin-left:250px;\n");
      out.write("         margin-top:5px;\n");
      out.write("         \n");
      out.write("     }\n");
      out.write(" </style>\n");
      out.write("    <script>\n");
      out.write("      function validate(){\n");
      out.write("        \n");
      out.write("           var a=document.forms[\"frm\"][\"curpass\"].value.trim();\n");
      out.write("            var b=document.forms[\"frm\"][\"np\"].value.trim();\n");
      out.write("            var c=document.forms[\"frm\"][\"cp\"].value.trim();\n");
      out.write("                 \n");
      out.write("   \n");
      out.write("\n");
      out.write("                             if(a==\"\" && b==\"\" &&c==\"\")\n");
      out.write("                            {\n");
      out.write("                                alert(\"All Fields must be filled out\");\n");
      out.write("                                return false;\n");
      out.write("                                \n");
      out.write("                            }\n");
      out.write("                            else if(a==\"\")\n");
      out.write("                            {\n");
      out.write("                                // document.getElementById(\"uname\").setCustomValidity(\"please enter suitable username\");\n");
      out.write("                            \n");
      out.write("                               alert(\"current password must be filled out\");\n");
      out.write("                                  return false;\n");
      out.write("                            }\n");
      out.write("                            \n");
      out.write("                              else if(b==\"\")\n");
      out.write("                             {\n");
      out.write("                              \n");
      out.write("                                //document.getElementById(\"pass\").setCustomValidity(\"please enter suitable password\");\n");
      out.write("                                alert(\"New  Password must be filled out\");\n");
      out.write("                               return false;\n");
      out.write("                            }\n");
      out.write("                              else if(c==\"\")\n");
      out.write("                             {\n");
      out.write("                              \n");
      out.write("                                //document.getElementById(\"pass\").setCustomValidity(\"please enter suitable password\");\n");
      out.write("                                alert(\" Reenter new Password must be filled out\");\n");
      out.write("                               return false;\n");
      out.write("                            }\n");
      out.write("                            return true;\n");
      out.write("             \n");
      out.write("      }\n");
      out.write(" </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"ChangePassword.jsp\" name=\"frm\" onsubmit=\"return validate(this)\">\n");
      out.write("        \n");
      out.write("        <div class=\"head\">  \n");
      out.write("            <div class=\"txthead\">   \n");
      out.write("                KNP MEDIA \n");
      out.write("            </div>\n");
      out.write("             ");

            String str=(String)session.getAttribute("user");
        
      out.write("\n");
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
      out.write("                </td>                  \n");
      out.write("                </tr>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"body1\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"body2\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> <h3 style=\"color: teal; margin-top:-20px;\">Change Your Password</h3></td></tr></table>\n");
      out.write("     </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"body3\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"color: black;font-size:13px;\">Current Password</td>\n");
      out.write("                    <td><input type=\"password\" style=\"width:300px;\" name=\"curpass\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"color: black;font-size:13px;\">New Password</td>\n");
      out.write("                    <td><input type=\"password\" style=\"width:300px;\" name=\"np\"></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"color: black;font-size:13px;\">Confirm Password</td>\n");
      out.write("                    <td><input type=\"password\" style=\"width: 300px;\" name=\"cp\"></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr> \n");
      out.write("                    <td></td>\n");
      out.write("                    <td style=\"padding-top: 10px; padding-left: 10px;\">\n");
      out.write("                        <input type=\"submit\" name=\"Cpass\" value=\"Change Password\" style=\"font-size:12px; color: green;\">\n");
      out.write("                      <input type=\"reset\" name=\"rst\" value=\"Reset\" style=\"font-size:12px; color: midnightblue;\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("         ");

              
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
        
                 
      out.write("\n");
      out.write("  \n");
      out.write("    </body>\n");
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
