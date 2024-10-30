/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicwhile;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class digitSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        while (n > 0) {
            sum += n % 10; 
            n=n/10;
        }
        
        System.out.print("Number of digits: " + sum);
        scanner.close();
    }
}
