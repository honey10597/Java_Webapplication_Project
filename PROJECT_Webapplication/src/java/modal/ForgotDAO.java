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
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Honey
 */
public class ForgotDAO {
     private final String url;
    private final Connection con;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
    }

    public ForgotDAO() throws SQLException {
        this.url = "jdbc:mysql://localhost:3306/project?user=root&password=123456&useSSL=false";
        this.con = DriverManager.getConnection(this.url);
    }
    public boolean update(String Email,String Password,String User) throws ClassNotFoundException
    {
       if(User.equals("Student"))
       {
        try{
            
            String query="select * from student where email=? and user=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, Email);
            pstmt.setString(2, User);
            pstmt.setString(3 ,Password);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next())
	   {
	      String q = "UPDATE student SET password = ? WHERE email = ?";
       	      PreparedStatement pstmt2 = con.prepareStatement(q);
	      pstmt2.setString(1, Password);	
	      if(pstmt2.executeUpdate() > 0)
	      {
                  return true;
              } 
              else
              {
                  return false;
              }
           }
            else
                return false;            
            
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
       }
        return false;
    }
}
