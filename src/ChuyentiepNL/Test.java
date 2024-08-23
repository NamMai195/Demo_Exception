/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuyentiepNL;

import ChuyentiepNL.CustomException;

/**
 *
 * @author nammai
 */


public class Test {
    public void methodA() throws CustomException {
        // Ném ngoại lệ ra ngoài
        throw new CustomException("Lỗi trong methodA");
    }

    public void methodB() {
        try {
            methodA();  // Gọi phương thức có thể ném ngoại lệ
        } catch (CustomException e) {
            // Xử lý ngoại lệ tại đây
            System.out.println("Ngoại lệ bị bắt ở methodB: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.methodB();  // Phương thức main gọi methodB
    }
}

