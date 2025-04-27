package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the first numbre: ");
            double number1 = scanner.nextDouble();
            System.out.print("Enter the second numbre: ");
            double number2 = scanner.nextDouble();
            System.out.print("Enter operation(+,-, *,/): ");
            String operation = scanner.next();

            double result = 0;

            switch (operation) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        System.out.println("Division by zero is not allowed!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Unknown operation.");
                    continue;
            }
            
            System.out.println("Result: " + result);

            System.out.println("Do you want to continue? (yes/no): ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
 }
        scanner.close();
    }

}
