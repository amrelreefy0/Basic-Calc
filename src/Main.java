import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1 , n2;

        System.out.printf("Please enter the first number: ");
        try {
             n1=input.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Invalid input");
            return;
        }
        System.out.printf("Please enter the operator: ");
        String operation=input.next();


        System.out.printf("Please enter the second number: ");
        try {
             n2=input.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Invalid input");
            return;
        }


          Calculator calculator = new Calculator();
          try {
              double result = calculator.calculate(n1, n2, operation);
              System.out.println(n1+" "+operation+" "+n2+" = "+result);
          }
          catch (ArithmeticException e) {
              System.out.println("Error:"+e.getMessage());
          }
          catch (IllegalArgumentException e) {
              System.out.println("Error:"+e.getMessage());
          }

    }
}