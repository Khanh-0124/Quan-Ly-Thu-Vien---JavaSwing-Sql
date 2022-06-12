/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KHP2T
 */
public class KetNoiSQL {
//    public static String databaseName = "QuanLyThuVien_HKP2T";
//    public static Connection getConnection() {
//    String url = "net.sourceforge.jtds.jdbc.Driver";
//        try {
//            Class.forName(url);
//            String dbUrl = "jdbc:jtds:sqlserver://localhost:1433/" + databaseName;
//            return DriverManager.getConnection(dbUrl,"","");
////          return DriverManager.getConnection(dbUrl,user, pass);
//        } catch (Exception ex) {
//            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
//    public static void main(String[] args) {
//        KetNoiSQL.getConnection();
//    }
	public static Connection getConnection() {
		Connection connection = null;
		try {
		     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		     try {
		    	 String urlString = "jdbc:sqlserver://DESKTOP-Q9CQR0D\\SQLEXPRESS:1433;databaseName=QuanLyThuVien_HKP2T;integratedSecurity=true";
		    	 connection = DriverManager.getConnection(urlString, "sa", "123");
		    	 System.out.println("ket noi thanh cong");
		     } catch (SQLException e) {
		    	 System.out.println("ket noi kg");
		    	 e.printStackTrace();

		     }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//System.out.println("111111");
		//System.out.println(connection);
		return connection;
	}
}
