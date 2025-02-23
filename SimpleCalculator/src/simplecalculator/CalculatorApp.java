package simplecalculator;


public class CalculatorApp {

    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1.9, 1.2));
        System.out.println(calc.subtract(1.9, 1.2));

        
        try {
            System.out.println("5.0 / 0.0 = " + calc.divide(5.0, 0.0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
