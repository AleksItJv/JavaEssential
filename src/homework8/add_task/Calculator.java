package homework8.add_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean whileType = true;
        while (whileType) {

            System.out.println("Для произведения рассчетов введите 2 целых числа");

            if (sc.hasNextInt()) {
                int a = 0;
                int b = 0;
                try {
                    a = sc.nextInt();
                    b = sc.nextInt();
                } catch (InputMismatchException imEx) {
                    System.out.println("Это не целое число!");
                }
                System.out.println("Выберите операцию из списка: ");
                System.out.println("\'+\'" + " сложение");
                System.out.println("\'-\'" + " вычетание");
                System.out.println("\'*\'" + " умножение");
                System.out.println("\'/\'" + " деление");

                String operator = sc.next();
                switch (operator) {

                    case "+": {
                        System.out.println("Сумма чисел = " + new Operations().addition(a, b));
                        break;
                    }

                    case "-": {
                        System.out.println("Вычитание чисел = " + new Operations().subtraction(a, b));
                        break;
                    }

                    case "*": {
                        System.out.println("Умножение чисел = " + new Operations().multiplication(a, b));
                        break;
                    }

                    case "/": {
                        System.out.println("Деление чисел = " + new Operations().division(a, b));
                        break;
                    }

                }
            } else {
                System.out.println("Ошибка! Введите 2 целых числа, начнем с самого начала!");
                whileType = false;
            }
        }
    }

}
