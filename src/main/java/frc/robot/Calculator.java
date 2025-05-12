package frc.robot;
//Built in lib
import java.util.Scanner;


public class Calculator {
    public void start() {
        //Get user input using scanner.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Java Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        //Takes arithmatic operation input form user
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        //add next number for arthmatic
        double num2 = scanner.nextDouble();

        double result;
        //assesment of arithmatic operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operator!");
                scanner.close();
                return;
        }

        System.out.printf("Result: %.2f %c %.2f = %.2f\n", num1, operator, num2, result);
        scanner.close();
    }
}


