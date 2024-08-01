package HW_2_9_2;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Операнд 1: ");
        double operand1 = scanner.nextDouble();
        while (true) {
            System.out.print("Выбери действие ('+', '-', '*', '/', 'C'- сброс, 's'- выход) -> ");
            char action = scanner.next().charAt(0);
            if (action == 's') {
                System.out.println("Программа завершила свою работу.");
                System.exit(0);
            } else if (action == 'C') {
                operand1 = 0;
            } else {
                System.out.print("Операнд 2: ");
                double operand2 = scanner.nextDouble();
                switch (action) {
                    case '+':
                        operand1 += operand2;
                        break;
                    case '-':
                        operand1 -= operand2;
                        break;
                    case '*':
                        operand1 *= operand2;
                        break;
                    case '/':
                       if (operand2 != 0) {
                            operand1 /= operand2;
                            break;
                        } else {
                            System.out.println("На ноль делить нельзя!");
                        }
                    default:
                        System.out.println("Ошибка при вводе данных!");
                        break;
                }
            }
            System.out.println("Результат = " + operand1);
        }
    }
}
