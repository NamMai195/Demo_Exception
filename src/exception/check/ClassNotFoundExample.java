/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception.check;

/**
 *
 * @author nammai
 */
public class ClassNotFoundExample {
    public static void main(String[] args) {
        try {
            // Cố gắng tải lớp "com.example.NonExistentClass"
            Class<?> clazz = Class.forName("com.example.NonExistentClass");
            System.out.println("Lớp được tìm thấy: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            // Xử lý khi lớp không tồn tại
            System.out.println("Lỗi: Lớp không tồn tại!");
            e.printStackTrace();
        }
    }
}

