/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Error;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nammai
 */
public class OutOfMemoryExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        try {
            while (true) {
                numbers.add(100000000);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError caught!");
            System.out.println(e);
        }
    }
}
