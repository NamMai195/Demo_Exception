/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception.uncheck;

/**
 *
 * @author nammai
 */
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        // Khởi tạo một mảng có 3 phần tử
        int[] array = new int[3];
        
        try {
            // Cố gắng truy cập vào chỉ số ngoài phạm vi hợp lệ của mảng
            int value = array[5]; // Đây sẽ gây ra ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Xử lý ngoại lệ ArrayIndexOutOfBoundsException
            System.out.println("Lỗi: Chỉ số mảng ngoài phạm vi hợp lệ!");
            e.printStackTrace();
        }
    }
}

