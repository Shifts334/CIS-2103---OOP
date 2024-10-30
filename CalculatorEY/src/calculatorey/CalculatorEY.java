/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorey;
import IO.CLI;
import MathOP.ArithmeticOP;
/**
 *
 * @author user
 */
public class CalculatorEY {
    
    public static void main(String[] args) {
        CalculatorEY f = new CalculatorEY();
        f.addNumbers();
    }
    
    public void addNumbers(){
        CLI cli = new CLI();
        System.out.print("Input the first operand: ");
        double firstNum = cli.getInt();
        System.out.print("Input the second operand: ");
        double secondNum = cli.getInt();
        ArithmeticOP calculate = new ArithmeticOP();
        double result = calculate.add(firstNum, secondNum);
        cli.printThis(result);
    }
}
