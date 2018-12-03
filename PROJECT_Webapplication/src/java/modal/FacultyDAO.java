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

/**
 *
 * @author Honey
 */
public class FacultyDAO {
    
    private final String url;
    private final Connection con;
   static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
    }

    /**
     *
     * @throws SQLException
     */
    public FacultyDAO() throws SQLException {
        this.url = "jdbc:mysql://localhost:3306/project?user=root&password=123456&useSSL=false";
        this.con = DriverManager.getConnection(this.url);
    }
    public boolean update_f(String User, String Id, String Name, String Email, String Password, String Confirm_password, String Mobile_no)
    {
        try{
            String query = "insert into faculty values(?,?,?,?,?,?,?)";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, User);
            pstmt.setString(2, Id);
            pstmt.setString(3, Name);
            pstmt.setString(4, Email);
            pstmt.setString(5, Password);
            pstmt.setString(6, Confirm_password);
            pstmt.setString(7, Mobile_no);
            int i=pstmt.executeUpdate();
            if(i>0)
            {
                System.out.println("Successfully Registered");
                return true;
            }else{
                return false;
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        
        return false;
        
    }
     
    public Faculty getFacultyData(String Email) throws SQLException
    {
        Faculty ft=new Faculty();
        String q="select * from faculty where email=?";
        PreparedStatement pt=this.con.prepareStatement(q);
        ResultSet rs=pt.executeQuery();
        pt.setString(1,Email);
        while(rs.next())
        {
            ft.setUser_u(rs.getString(1));
            ft.setId_i(rs.getString(2));
            ft.setName_n(rs.getString(3));
            ft.setEmail_e(rs.getString(4));
            ft.setPassword_p(rs.getString(5));
            ft.setMobile_no_m(rs.getString(7));
        }
       return ft;
        
    }

    public boolean update(String Email, String Password, String User) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}