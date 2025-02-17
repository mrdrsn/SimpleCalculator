/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;

/**
 *
 * @author nsoko
 */
public class CalculatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator calc = new Calculator();
        try {
            System.out.println("5.0 / 0.0 = " + calc.divide(5.0, 0.0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
