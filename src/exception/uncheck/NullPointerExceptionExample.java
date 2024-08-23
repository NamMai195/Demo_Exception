/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception.uncheck;

/**
 *
 * @author nammai
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        // Khai báo một biến tham chiếu đối tượng mà không khởi tạo
        String str = null;

        try {
            // Cố gắng gọi phương thức trên biến tham chiếu null
            int length = str.length(); // Đây sẽ gây ra NullPointerException
        } catch (NullPointerException e) {
            // Xử lý ngoại lệ NullPointerException
            System.out.println("Lỗi: Không thể gọi phương thức trên đối tượng null!");
            System.out.println(e);
        }
//        System.out.println("xin chaoof ");
//        for(int i=0;i<10;i++){
//            System.out.println(i);
//        }
    }
}
