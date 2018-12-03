
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Honey
 */
public class adminDAO {
    String name,user;
    public boolean validate(String Email,String Password,String User)
    {
        String url="jdbc:mysql://localhost:3306/project?user=root&password=123456&useSSL=false";
       if(User.equals("Student"))
       {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url);
            String query="select * from student where email=? AND password=? AND user=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, Email);
            pstmt.setString(2,Password);
            pstmt.setString(3,User);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
                name = rs.getString(3);
                return true;
            }
            else
            {
                return false;
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       }
       else if(User.equals("Faculty"))
       {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url);
            String query="select * from Faculty where email=? AND password=? AND user=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, Email);
            pstmt.setString(2,Password);
            pstmt.setString(3,User);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
                name = rs.getString(3);
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       }
       
        return false;       
    }
    
        public String getName()
        {
            return name;
        }

    /**
     *
     * @return
     */
    public String getUser()
        {
            return user;
        }

    //To change body of generated methods, choose Tools | Templates.
    }
    

