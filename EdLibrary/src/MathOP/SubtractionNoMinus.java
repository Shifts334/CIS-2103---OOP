/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MathOP;

/**
 *
 * @author user
 */
public class SubtractionNoMinus {
    
    public static int subtract(int a, int b) {
        int complement = ~b;
        int negativeB = add(complement, 1);
        return add(a, negativeB);
    }
    
    private static int add(int x, int y) {
        while (y != 0) {
            int carry = x & y;

            x = x ^ y;

            y = carry << 1;
        }
        return x;
    }
}
