import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        int number1, number2, result;

        System.out.println("Enter first number");
        number1 = scanner.nextInt();

        System.out.println("Enter second number");
        number2 = scanner.nextInt();

        System.out.println("Choose an operator: +, -, *, or /");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

            }
        }
