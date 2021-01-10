package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width= device-width, initial-scale=1.0 \">\n");
      out.write("        <title>AdminHome page</title>\n");
      out.write(" <link href=\"style2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write(" <style>\n");
      out.write("     .head{\n");
      out.write("              // border: 1px solid black;\n");
      out.write("               height: 70px;\n");
      out.write("                width: 1220px;\n");
      out.write("                 margin-left: 3px;\n");
      out.write("                 background-image: url(\"backpic.jpg\");   \n");
      out.write("                \n");
      out.write("       }\n");
      out.write("       \n");
      out.write("      .nav{\n");
      out.write("                    width: 1220px;\n");
      out.write("                    background-color:  #9999ff;\n");
      out.write("                    margin-left: 3px;\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                .admin{\n");
      out.write("                   //border:1px solid beige;\n");
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
      out.write("                   //border: 1px solid red;\n");
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
      out.write("                .body1{\n");
      out.write("                  //border: 1px solid black;\n");
      out.write("                    height: 40px;\n");
      out.write("                    width:200px;\n");
      out.write("                    margin-top: -90px;\n");
      out.write("                }\n");
      out.write("                .body2{\n");
      out.write("                   //border: 1px solid black;\n");
      out.write("                    height: 35px;\n");
      out.write("                    width: 180px;\n");
      out.write("                    //background: background;\n");
      out.write("                    margin-top: -10px;\n");
      out.write("                }\n");
      out.write("                .body3{\n");
      out.write("                   border: 1px solid black;\n");
      out.write("                    height: 33px;\n");
      out.write("                    width: 1220px;\n");
      out.write("                    background: #cccccc;\n");
      out.write("                    margin-top: -18px;\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                .col2{\n");
      out.write("            //   border-right:  1px solid #dddddd;\n");
      out.write("                   text-align: left;\n");
      out.write("                    height: 20px;\n");
      out.write("                    width: 750px;\n");
      out.write("                    text-align: center;\n");
      out.write("                    background:#cccccc; \n");
      out.write("                    font-size: 11px\n");
      out.write("                }\n");
      out.write("                .sel{\n");
      out.write("                // border: 1px solid black;\n");
      out.write("                  height: 130px;\n");
      out.write("                     width: 1218px;\n");
      out.write("                     margin-left: -1%;\n");
      out.write("                     margin-top: 15px;\n");
      out.write("                \n");
      out.write("                 .col1{\n");
      out.write("                    \n");
      out.write("                     text-align: center;\n");
      out.write("                     font-size: 12px;\n");
      out.write("                  \n");
      out.write("                }\n");
      out.write(" </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"head\">  \n");
      out.write("            <div class=\"txthead\">   \n");
      out.write("                KNP MEDIA \n");
      out.write("            </div>\n");
      out.write("             ");

            String str=(String)session.getAttribute("myuser");
        
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
      out.write("                </td> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sel\">\n");
      out.write("                <table class=\"tb1\" align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                   <td class=\"col1\">From</td>\n");
      out.write("                   <td class=\"col1\">To</td>                \n");
      out.write("                   <td class=\"col1\">Location </td>\n");
      out.write("                   <td class=\"col1\">Media</td>\n");
      out.write("                   <td class=\"col1\">City</td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                   <td class=\"col1\" ><input type=\"text\" name=\"pf\"></td>\n");
      out.write("                   <td class=\"col1\" ><input type=\"text\" name=\"to\"></td>\n");
      out.write("                   <td class=\"col1\"><input type=\"text\" name=\"location\"></td>\n");
      out.write("                    <td class=\"col1\">                 \n");
      out.write("                        <select>\n");
      out.write("                            <option value=\"select1\" style=\"font-size: 11px;\">Select</option>\n");
      out.write("                           <option value=\"board1\" style=\"font-size: 11px;\"> BillBoard</option>\n");
      out.write("                              <option value=\"cantti\" style=\"font-size: 11px;\"> Cantilever</option>\n");
      out.write("                             <option value=\"Divider\" style=\"font-size: 11px;\"> Divider Boards</option>\n");
      out.write("                                <option value=\"front\" style=\"font-size: 11px;\"> Front Facade</option>\n");
      out.write("                              <option value=\"gantry\" style=\"font-size: 11px;\"> Gantry</option>\n");
      out.write("                                <option value=\"hording\" style=\"font-size: 11px;\"> Hoarding</option>\n");
      out.write("                               <option value=\"pencil\" style=\"font-size: 11px;\"> Pencilpole</option>\n");
      out.write("                               <option value=\"pole\" style=\"font-size: 11px;\"> Pole Kiosk</option>\n");
      out.write("                             <option value=\"unipole\" style=\"font-size: 11px;\"> Unipole</option>\n");
      out.write("                        </select>\n");
      out.write("                        </td>\n");
      out.write("                         <td class=\"col1\">                 \n");
      out.write("                        <select>\n");
      out.write("                            <option value=\"select1\" style=\"font-size: 11px;\">Select</option>\n");
      out.write("                           <option value=\"knp\" style=\"font-size: 11px;\"> Kanpur</option>\n");
      out.write("                              <option value=\"gkh\" style=\"font-size: 11px;\">Gorakhpur</option>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"col1\"><input type=\"submit\" name=\"Search\" value=\"Search\" style=\"font-size:13px; color: green;\"></td>\n");
      out.write("                        \n");
      out.write("                   </tr>\n");
      out.write("                   </table>\n");
      out.write("                   </div>\n");
      out.write("                   \n");
      out.write("         \n");
      out.write("     <div class=\"body1\">\n");
      out.write("         <h3 style=\"color: teal; font-size: 20px;\">Our Media Sheet</h3>\n");
      out.write("     </div>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("     <div class=\"body3\">\n");
      out.write("         <table>\n");
      out.write("             <tr>\n");
      out.write("                 <td class=\"col2\"><input type=\"checkbox\" name=\"check\" ></td>\n");
      out.write("                 <td class=\"col2\">MID</td>\n");
      out.write("                 <td class=\"col2\">Purchase From</td>\n");
      out.write("                  <td class=\"col2\">Media</td>\n");
      out.write("                 <td class=\"col2\">Size</td>\n");
      out.write("                 <td class=\"col2\">Location</td>\n");
      out.write("                 <td class=\"col2\">Facing </td>\n");
      out.write("                 <td class=\"col2\">Display</td>\n");
      out.write("                 <td class=\"col2\">Agency</td>\n");
      out.write("                 <td class=\"col2\">Exe Date</td>\n");
      out.write("                  <td class=\"col2\">Dur</td>\n");
      out.write("                 <td class=\"col2\">Comp date</td>                \n");
      out.write("                 <td class=\"col2\">D2</td>\n");
      out.write("                 <td class=\"col2\">D2 Agency</td>\n");
      out.write("                 <td class=\"col2\">D2 Exe Date</td>\n");
      out.write("                <td class=\"col2\">D2 Dur</td>\n");
      out.write("                <td class=\"col2\">Comp Date</td>\n");
      out.write("                <td class=\"col2\">Upcomming</td>\n");
      out.write("                 <td class=\"col2\">U Agency</td>\n");
      out.write("                <td class=\"col2\">U Dur</td>\n");
      out.write("                <td class=\"col2\">Comp Date</td>\n");
      out.write("                <td class=\"col2\">Aval Date</td>\n");
      out.write("                <td class=\"col2\">Image</td>\n");
      out.write("                <td class=\"col2\"> Action</td> \n");
      out.write("             </tr>\n");
      out.write("         </table>\n");
      out.write("     </div>\n");
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
