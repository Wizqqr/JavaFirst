package HomeWork1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double a = scan.nextDouble();

        System.out.println("Введите операцию (+, -, *, /, %, ^):");
        char op = scan.next().charAt(0);

        System.out.println("Введите второе число:");
        double b = scan.nextDouble();

        double result = 0.0;
        boolean validOperation = true;

        Calculator(op, result, a, b, validOperation);
    }

    private static void Calculator(char op, double result, double a, double b, boolean validOperation) {
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("На ноль делить нельзя");
                    validOperation = false;
                }
                break;
            case '%':
                result = a % b;
                break;
            case '^':
                result = Math.pow(a, b);
                break;
            default:
                System.out.println("Некорректный оператор: '" + op + "'");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("Результат: " + result);
        }
    }
}
