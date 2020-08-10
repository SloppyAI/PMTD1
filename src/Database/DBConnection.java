/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FPTSHOP
 */
public class DBConnection {
    private static String DB_URL = "jdbc:sqlserver://localhost;"
            + "databaseName=QL_TuyenDung;";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "21122000";    
    static Connection conn = null;

    public static void ConnectSql() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Lỗi 01 " );
        } catch (SQLException ex) {
            System.out.println("Lỗi kết nối SQL");
        }
    }
    
    //Hàm thực hiện câu lệnh select
    public static ResultSet GetData(String cauTruyVan){
        try {
            ConnectSql();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(cauTruyVan);
            
            return rs;
           
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dữ liệu");
            return null;
        }
    }
    //Hàm thực hiện 3 lệnh insert update delete
    public static int ExecuteQueryUpdate(String sql){
        try {
             ConnectSql();
        // tạo 1 statement
        Statement stm = conn.createStatement();
       
        return stm.executeUpdate(sql);
        } catch (SQLException ex) {
        System.out.println("lỗi sql." + ex.getMessage());
        return -1 ;
    }
    
   }  




}
