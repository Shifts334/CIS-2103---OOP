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
public class evenNum {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int i = 1;
        while(i<=n){
            if(i%2 == 0){
                System.out.println(i);
                i++;
            }else{
                i++;
            }
        }
        scanner.close();
    }
}
