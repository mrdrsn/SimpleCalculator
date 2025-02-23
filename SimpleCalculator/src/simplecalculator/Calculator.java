package simplecalculator;

public class Calculator {
    
    public static double add(double a, double b){
        return a + b;
    }
    
    public static double subtract(double a, double b){
        return a - b;
    }

     public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T a, U b) {
        double denominator = b.doubleValue();
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a.doubleValue() / denominator;
    }
}
