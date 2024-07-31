package HW_2_9_1;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа КАЛЬКУЛЯТОР");
        System.out.print("Введите первое число: ");
        double operand1 = scanner.nextDouble();
        System.out.print("Введите желаемую операцию ('+', '-', '*', '/') : ");
        char operation = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        double operand2 = scanner.nextDouble();
        switch (operation) {
            case '+':
                System.out.println("Результат: " + operand1 + " + " + operand2 + " = " + Calculator.addition(operand1, operand2));
                break;
            case '-':
                System.out.println("Результат: " + operand1 + " - " + operand2 + " = " + Calculator.subtraction(operand1, operand2));
                break;
            case '*':
                System.out.println("Результат: " + operand1 + " * " + operand2 + " = " + Calculator.multiplication(operand1, operand2));
                break;
            case '/':
                System.out.println("Результат: " + operand1 + " / " + operand2 + " = " + Calculator.division(operand1, operand2));
                break;
            case 's':
                System.exit(0);
            default:
                System.out.println("Некорректный ввод операции!");
        }
    }
    public static double addition(double a, double b) {
        double result = a + b;
        return result;
    }
    public static double subtraction(double a, double b) {
        double result = a - b;
        return result;
    }
    public static double multiplication(double a, double b) {
        double result = a * b;
        return result;
    }
    public static double division(double a, double b) {
        double result = a / b;
        return result;
    }

}
