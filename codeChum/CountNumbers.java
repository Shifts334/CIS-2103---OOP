package codeChum;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        
        scanner.close();
    }
}