package codeChum;
import java.util.Scanner;
public class squareNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int i = 1;
        while(i<=n){
            int square = n*n;
            System.out.println(square);
            i++;
        }
        
        scanner.close();
    }
}


