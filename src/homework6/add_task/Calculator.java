package homework6.add_task;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean whileType = true;
        while (whileType) {

            System.out.println("Для произведения рассчетов введите 2 целых числа или дробных(через запятую): ");

            if (sc.hasNextDouble()) {
                double a = sc.nextDouble();
                double b = sc.nextDouble();

                System.out.println("Выберите операцию из списка: ");
                System.out.println("\'+\'" + " сложение");
                System.out.println("\'-\'" + " вычетание");
                System.out.println("\'*\'" + " умножение");
                System.out.println("\'/\'" + " деление");
                System.out.println("\'%\'" + " остаток от целого деления");
                System.out.println("\'min\'" + " минимальное из чисел");
                System.out.println("\'max\'" + " максимальное из чисел");
                System.out.println("\'pov\'" + " возведение в степень");

                String operator = sc.next();
                switch (operator) {

                    case "+": {
                        System.out.println("Сумма чисел = " + new BaseOperators().addition(a, b));
                        break;
                    }

                    case "-": {
                        System.out.println("Вычитание чисел = " + new BaseOperators().subtraction(a, b));
                        break;
                    }

                    case "*": {
                        System.out.println("Умножение чисел = " + new BaseOperators().multiplication(a, b));
                        break;
                    }

                    case "/": {
                        System.out.println("Деление чисел = " + new BaseOperators().division(a, b));
                        break;
                    }

                    case "%": {
                        System.out.println("Остаток от деления чисел = " + new BaseOperators.AdditionalOperators().remainderIntDivision(a, b));
                        break;
                    }

                    case "min": {
                        System.out.println("Минимальное из чисел = " + new BaseOperators.AdditionalOperators().minOfTwoNumbers(a, b));
                        break;
                    }

                    case "max": {
                        System.out.println("Максимальное из чисел = " + new BaseOperators.AdditionalOperators().maxOfTwoNumbers(a, b));
                        break;
                    }

                    case "pov": {
                        System.out.println("Возведение в степень чисел = " + new BaseOperators.AdditionalOperators().exponentiation(a, b));
                        break;
                    }
                }
            } else {
                System.out.println("Введите 2 числа, начнем с самого начала!");
                whileType = false;
            }
        }
    }

    private static class BaseOperators {

        double addition(double firstNumber, double secondNumber) {
            return firstNumber + secondNumber;
        }

        double subtraction(double firstNumber, double secondNumber) {
            return firstNumber - secondNumber;
        }

        double multiplication(double firstNumber, double secondNumber) {
            return firstNumber * secondNumber;
        }

        double division(double firstNumber, double secondNumber) {
            return firstNumber / secondNumber;
        }

        private static class AdditionalOperators {

            double remainderIntDivision(double firstNumber, double secondNumber) {
                return firstNumber % secondNumber;
            }

            double minOfTwoNumbers(double firstNumber, double secondNumber) {
                return Math.min(firstNumber, secondNumber);
            }

            double maxOfTwoNumbers(double firstNumber, double secondNumber) {
                return Math.max(firstNumber, secondNumber);
            }

            double exponentiation(double firstNumber, double secondNumber) {
                return Math.pow(firstNumber, secondNumber);
            }
        }
    }
}
