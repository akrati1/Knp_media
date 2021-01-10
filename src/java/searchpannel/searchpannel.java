
package searchpannel;

import dbconn.Connections;
import static dbconn.Connections.disconnect;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class searchpannel {
    private String srchtext;
    public ArrayList<String> users=new ArrayList<String>();
    public String getSrchtext() {
        return srchtext;
    }

    public void setSrchtext(String srchtext) {
        this.srchtext = srchtext;
    }

    public ArrayList<String> getUsers() 
    {
        ArrayList<String> al=new ArrayList<String>();
        try{
        Statement st=Connections.connect();
        ResultSet rs=st.executeQuery("select select_site from booking_pannel where select_site like '%"+srchtext+"%'");
        while(rs.next()){
            al.add(rs.getString(1));
        }
        rs.close();
        disconnect();
        this.users=al;
        }catch(Exception e)
        {}
        return users;
    }

    public void setUsers(ArrayList<String> users) {
        this.users = users;
    }
    
    
}

    

