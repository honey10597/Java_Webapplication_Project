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
public class studentDAO {

    private final String url;
    private final Connection con;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
    }

    public studentDAO() throws SQLException {
        this.url = "jdbc:mysql://localhost:3306/project?user=root&password=123456&useSSL=false";
        this.con = DriverManager.getConnection(this.url);
    }

    public boolean update(String User, String Id, String Name, String Email, String Password, String Confirm_password, String Mobile_no) {
        try {
            String query = "insert into student values(?,?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, User);
            pstmt.setString(2, Id);
            pstmt.setString(3, Name);
            pstmt.setString(4, Email);
            pstmt.setString(5, Password);
            pstmt.setString(6, Confirm_password);
            pstmt.setString(7, Mobile_no);
            int i;
            i = pstmt.executeUpdate();
            if (i > 0) {
                System.out.println("successfuly registered");
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return false;

    }

    public student getStudentData(String Email) throws SQLException {
        student std = new student();
        String st = "SELECT * FROM student WHERE email = ?";
        PreparedStatement psmt = this.con.prepareStatement(st);
        psmt.setString(1,Email);
        
        ResultSet rs = psmt.executeQuery();
        while(rs.next()) {
            std.setUser(rs.getString(1));
            std.setId(rs.getString(2));
            std.setName(rs.getString(3));
            std.setEmail(rs.getString(4));
            std.setPassword(rs.getString(5));
            std.setMobile_no(rs.getString(7));
        }
        return std;
    }

}
