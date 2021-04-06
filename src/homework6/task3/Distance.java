package homework6.task3;

import java.util.Scanner;

public class Distance {

    double distance;

    public static void main(String[] args) {
        new Distance().print();

    }

    Scanner sc = new Scanner(System.in);
    double vvod;

    void print() {
        System.out.println("Конвертируем метры в сантиметры - введите - 1");
        System.out.println("Конвертируем метры в километры - введите - 2");
        System.out.println("Конвертируем метры в мили - введите - 3");
        System.out.println("Конвертируем километры в мили - введите - 4");
        System.out.println("Нет подходящего варианта введите что-нибудь для выхода!");

        switch (sc.next()) {
            case "1": {
                System.out.println("Введите колличество метров: ");
                try {
                    if (sc.hasNextDouble()) {
                        vvod = sc.nextDouble();
                        System.out.printf("%.2f", Converter.convertMeterToSantimeter(vvod));
                        System.out.println(" Сантиметров");

                    } else {
                        throw new Exception("Введно не число. Или число через точку");
                    }
                } catch (Exception e) {
                    System.out.println("Введите число! Если дробное, используйте запятую!");
                }
            }
            break;
            case "2": {
                System.out.println("Введите колличество метров: ");
                try {
                    if (sc.hasNextDouble()) {
                        vvod = sc.nextDouble();
                        System.out.printf("%.2f", Converter.convertMeterToKilometer(vvod));
                        System.out.println(" Километров");

                    } else {
                        throw new Exception("Введно не число. Или число через точку");
                    }
                } catch (Exception e) {
                    System.out.println("Введите число! Если дробное, используйте запятую!");
                }
            }
            break;
            case "3": {
                System.out.println("Введите колличество метров: ");
                try {
                    if (sc.hasNextDouble()) {
                        vvod = sc.nextDouble();
                        System.out.printf("%.2f", Converter.convertMeterToMile(vvod));
                        System.out.println(" Миль");

                    } else {
                        throw new Exception("Введно не число. Или число через точку");
                    }
                } catch (Exception e) {
                    System.out.println("Введите число! Если дробное, используйте запятую!");
                }
            }
            break;
            case "4": {
                System.out.println("Введите колличество километров: ");
                try {
                    if (sc.hasNextDouble()) {
                        vvod = sc.nextDouble();
                        System.out.printf("%.2f", Converter.convertKilometerToMile(vvod));
                        System.out.println(" Миль");

                    } else {
                        throw new Exception("Введно не число. Или число через точку");
                    }
                } catch (Exception e) {
                    System.out.println("Введите число! Если дробное, используйте запятую!");
                }
            }
            break;
            default: {
                System.out.println("Вы ввели что-то не то, как и полагается) Выход из программы");
            }
        }
    }

    static class Converter {

        static double convertMeterToKilometer(double metrov) {
            return metrov / 1000;
        }

        static double convertMeterToSantimeter(double metrov) {
            return metrov * 1000;
        }

        static double convertKilometerToMile(double kilometrov) {
            return kilometrov * 0.621371;
        }

        static double convertMeterToMile(double metrov) {
            return metrov / 1000 * 0.621371;
        }


    }
}

/*Создать класс Distance с полем distance типа double и методом print.
В классе Distance, создайте вложенный класс Converter со статическими методами,
 которые будут конвертировать расстояние в разные единицы измерения (к примеру,
  из метров в километры, из километров в мили, и так далее).
 */
