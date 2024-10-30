/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;
import java.util.*;
/**
 *
 * @author user
 */
public class CLI {
    Scanner s = new Scanner(System.in);
    
    public int getInt(){
        return s.nextInt();
    }
    
    public double getDouble(){
        return s.nextDouble();
    }
    
    public String getString(){
        return s.nextLine();
    }
    
    public void printThis(double x){
        System.out.println(x);
    }
}
