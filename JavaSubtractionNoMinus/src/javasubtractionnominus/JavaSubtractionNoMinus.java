/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javasubtractionnominus;
import IO.CLI;
import MathOP.SubtractionNoMinus;
/**
 *
 * @author user
 */
public class JavaSubtractionNoMinus {
  
    public static void main(String[] args) {
        CLI input = new CLI();
        System.out.println("Enter First digit: ");
        int a = input.getInt();
        System.out.println("Enter Second digit: ");
        int b = input.getInt();

        int result = SubtractionNoMinus.subtract(a, b);

        // Print the result
        System.out.println("Subtraction Result: " + result);
    }
}
