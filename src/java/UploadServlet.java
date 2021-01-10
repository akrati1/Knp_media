import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
 
@WebServlet("/UploadServlet")
@MultipartConfig(maxFileSize =2017721523)   
public class UploadServlet extends HttpServlet{
     
    // database connection settings
    private String dbURL = "jdbc:mysql://localhost:3306/shn";
    private String dbUser = "root";
    private String dbPass = "123";
     
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    InputStream inputStream = null; 
          String s1= request.getParameter("pform");
            String s2= request.getParameter("city");
            String s3= request.getParameter("media");
            String s4= request.getParameter("size");
            String s5= request.getParameter("locat");
            String s6= request.getParameter("facing");
        // input stream of the upload file
         
        //obtains the upload file part in this multipart request
        Part filePart = request.getPart("cimage");
        if (filePart != null) {
            //prints out some information for debugging
           //System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            //obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
         
        Connection conn = null; //connection to the database
        String message = null;  //message will be sent back to client
         
        try {

            //connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(dbURL,dbUser,dbPass);
 
            //constructs SQL statement
           
  String queryString = "insert into merg(pform,city,media,size,location,facing,image)values(?,?,?,?,?,?,?)";
       PreparedStatement pstatement = conn.prepareStatement(queryString);
          //statement.setString(1, firstName);
           //statement.setString(2, lastName);
             
            if (inputStream != null) {
                 pstatement.setString(1, s1);
			  pstatement.setString(2, s2);
			  pstatement.setString(3, s3);
                           pstatement.setString(4, s4);
                            pstatement.setString(5, s5);
                             pstatement.setString(6, s6);
                             
                //fetches input stream of the upload file for the blob column
                pstatement.setBlob(7, inputStream);
                                        
            }
 
            //sends the statement to the database server
            int row = pstatement.executeUpdate();
            if (row > 0) {
                message = "File uploaded and saved into database";
            }
        } catch (SQLException ex) {
            message = "ERROR:"+ ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn!= null) {
                //closes the database connection
                try{
                    conn.close();
                            response.sendRedirect("AddNewMedia.jsp");
                   }
                catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
              
           
        }
    }
}
