import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter Operator + , - , * , / , % : ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter Second Number: ");
        int number2 = scanner.nextInt();

        if (operator=='+')
        {
            System.out.println(number1 + " + " + number2 + " = "+(number1+number2));
        }
        else if(operator=='-')
        {
            System.out.println(number1 + " - " + number2 + " = "+(number1-number2));
        }
        else if (operator=='*')
        {
            System.out.println(number1 + " x " + number2 + " = "+number1*number2);
        }
        else if (operator=='/')
        {
            if (number2 == 0) {
                System.out.println("Error: Division by zero is not allowed");
            } else {
                System.out.println(number1 + " / " + number2 + " = " + number1/number2);
            }
        }

        else if (operator == '%')
        {
            if (number2 == 0) {
                System.out.println("Error: Modulus by zero is not allowed");
            } else {
                System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
            }
        } else {
            System.out.println("Invalid operator");
        }

        scanner.close();


        System.out.println("Thank you for using this calculator!");
        System.out.println("Check out more projects on my profile...");

    }
}