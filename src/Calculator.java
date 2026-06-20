public class Calculator {
    public double calculate(double a, double b , String op) {
        if (op.equals("+")) {
            return a + b;
        }
        else if (op.equals("-")) {
            return a - b;
        }
        else if (op.equals("*")) {
            return a * b;
        }
        else if (op.equals("/")) {
            if (b == 0){
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        }
        else {
            throw new IllegalArgumentException("Invalid operator.");
        }
    }
}
