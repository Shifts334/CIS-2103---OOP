/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicwhile;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class squareNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int i = 1;
        while(i<=n){
            int square = i*i;
            System.out.println(square);
            i++;
        }
        
        scanner.close();
    }
    
}
