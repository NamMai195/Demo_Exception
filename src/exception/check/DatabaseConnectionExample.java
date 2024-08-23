/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception.check;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nammai
 */

public class DatabaseConnectionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase"; // URL cơ sở dữ liệu
        String user = "myuser"; // Tên người dùng
        String password = "mypassword"; // Mật khẩu

        try {
            // Tạo kết nối đến cơ sở dữ liệu
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối thành công!");
            // Thực hiện các hoạt động với cơ sở dữ liệu ở đây

            // Đóng kết nối
            connection.close();
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối cơ sở dữ liệu!");
            System.out.println(e);
        }
    }
}

