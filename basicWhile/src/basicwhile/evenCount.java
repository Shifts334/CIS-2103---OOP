/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicwhile;
import java.util.Scanner;

public class evenCount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        int i = 0;
        while (n > 0) {
            n = n / 10; // Divide n by 10 to remove the last digit
            i++; // Increment the digit count
        }
        
        System.out.print("Number of digits: " + i);
        scanner.close();
    }
}

