package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Action_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link href=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.1/themes/base/jquery-ui.css\" rel=\"stylesheet\" />\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.1/jquery-ui.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width= device-width, initial-scale=1.0\">\n");
      out.write("        <title>Action page</title>\n");
      out.write(" <link href=\"style2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("                    width: 995px;\n");
      out.write("                    background-color:  #9999ff;\n");
      out.write("                    margin-left: 110px;\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                .admin{\n");
      out.write("                  /*border: 1px solid black;*/\n");
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
      out.write("       .v1{\n");
      out.write("              /*border: 1px solid black;*/\n");
      out.write("               height: 160px;\n");
      out.write("                width: 1160px;\n");
      out.write("                 margin-top:20px;\n");
      out.write("                 margin-left:20px;\n");
      out.write("       }\n");
      out.write(" </style>\n");
      out.write(" <script>\n");
      out.write("     function AddDate(){\n");
      out.write("        \n");
      out.write("       //  var d= new Date();\n");
      out.write("      var com=document.getElementById(\"compd\").value.trim();\n");
      out.write("         var d1=document.getElementById(\"exed\").value.trim();\n");
      out.write("         alert(d1);\n");
      out.write("         var dur1=document.getElementById(\"dur\").value.trim();\n");
      out.write("         alert(dur1);\n");
      out.write("           var i=parseInt(dur1);\n");
      out.write("           alert(i);\n");
      out.write("           com.setDate(d1.getDate()+ i);\n");
      out.write("     }\n");
      out.write(" </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"\">\n");
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
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("           ");
 
        String p1 = "";
        String p2 = "";
        String p3 = "";
        String p4 = "";
        String p5 = "";
        String p6 = "";
        String p7 = "";
         String p8 = "";
        String p9 = "";
        String p10 = "";
        String p11 = "";
         String p12 = "";
    
      out.write("\n");
      out.write("    ");

        try {
            String s12=request.getParameter("id");
            String s1 = request.getParameter("uid");
            String s2 = request.getParameter("pf");
            String s3 = request.getParameter("city");
            String s4 = request.getParameter("foc");
            String s5 = request.getParameter("display");
            String s6 = request.getParameter("agency");
            String s7 = request.getParameter("exedate");
            String s8 = request.getParameter("dur");
            String s9 = request.getParameter("cd");
            String s10 = request.getParameter("d2");
            String s11 = request.getParameter("d2agency");
            String s13 = request.getParameter("d2ed");
            String s14= request.getParameter("d2dur");
            String s15 = request.getParameter("d2cd");
            String s16 = request.getParameter("uc");
            String s17 = request.getParameter("uagency");
            String s18 = request.getParameter("uexe");
            String s19 = request.getParameter("udur");
            String s20 = request.getParameter("ucd");


            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shn", "root", "123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from adddata where uid='"+s12+"' ");
            
            
      out.write("\n");
      out.write("    \n");
      out.write("            ");

                 while (rs.next()) {
                 
                p2 = rs.getString("pform");
                p3 = rs.getString("facing");
                p4 = rs.getString("media");
                p5 = rs.getString("size");
                p6 = rs.getString("location");
                p7 = rs.getString("city");
                p8 = rs.getString("uid");
               
                
      out.write("\n");
      out.write("                ");

                     SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/yyyy");
                     Calendar cal = Calendar.getInstance();
                     cal.add(Calendar.DATE, 20);
                     String d1= sdf.format(cal.getTime()); 
                  
                
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"v1\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">Select Site</td>\n");
      out.write("                        <td class=\"col1\" ><input name=\"disabled\"  value=\"");
out.println(p4);
      out.write('-');
out.println(p5);
      out.write('-');
out.println(p6);
      out.write('-');
out.println(p3);
      out.write('-');
out.println(p2);
      out.write("\" disabled></td>                   \n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">UID</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"text\" name=\"uid\"  value=\"");
out.println(p8); 
      out.write("\"></td>   \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                         <td class=\"col1\" style=\" font-size: 12px;\">Purchase From</td>\n");
      out.write("                         <td class=\"col1\"><input type=\"text\" name=\"pf\" value=\"");
out.println(p2); 
      out.write("\"></td>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">City</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"text\" name=\"city\" value=\"");
out.println(p7); 
      out.write("\"></td>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">Foc</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"text\" name=\"foc\" ></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">Display</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"text\" name=\"display\"></td>                     \n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">Agency</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"text\" name=\"agency\"></td>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\" >Exe Date</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"date\" name=\"exedate\" id=\"exed\"></td>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\" >Duration</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"number\" name=\"dur\"id=\"dur\" ></td>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\" >Comp Date</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"date\" name=\"cd\" id=\"compd\"  onclick=\"AddDate()\" ></td>                      \n");
      out.write("                                                                     \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">D2</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"text\" name=\"d2\"></td>                     \n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">D2 Agency</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"text\" name=\"d2agency\"></td>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\" >D2 Exe Date</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"date\" id=\"d2ed\" name=\"d2ed\"></td>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">D2 Dur.</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"number\" id=\"d2dur\" name=\"d2dur\"></td>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">D2 Comp Date</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"date\" name=\"d2cd\" id=\"d2cd\"></td>                                                                   \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">Upcoming</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"text\" name=\"uc\"></td>                     \n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">U Agency</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"text\" name=\"uagency\"></td>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">U Exe Date</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"date\" name=\"uexe\" id=\"Uexdate\"></td>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">U Dur.</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"number\" name=\"udur\" id=\"udur\"></td>\n");
      out.write("                        <td class=\"col1\" style=\" font-size: 12px;\">U Comp Date</td>\n");
      out.write("                        <td class=\"col1\"><input type=\"date\" name=\"ucd\" id=\"ucompdate\"></td>                                                                     \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("<td><input type=\"submit\" name=\"bt1\" value=\"Save\" style=\"font-size:14px; color: green; margin-top: 10px;\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                      ");
    
            }
           
            rs.close();
            st.close();
            con.close();
        } 
        catch (Exception e) {
out.println(e);
        }
      out.write("\n");
      out.write("        ");

            
    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>        \n");
      out.write("    </body>\n");
      out.write("</form>\n");
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
