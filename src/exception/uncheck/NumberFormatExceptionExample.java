/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception.uncheck;

/**
 *
 * @author nammai
 */
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String invalidNumber = "123abc"; // Chuỗi không phải là định dạng số hợp lệ

        try {
            // Cố gắng chuyển đổi chuỗi không hợp lệ thành số nguyên
            int number = Integer.parseInt(invalidNumber); // Đây sẽ gây ra NumberFormatException
            System.out.println("Số nguyên: " + number);
        } catch (NumberFormatException e) {
            // Xử lý khi chuỗi không thể chuyển đổi thành số
            System.out.println("Lỗi: Chuỗi không thể chuyển đổi thành số!");
            e.printStackTrace();
        }
    }
}
