package homework8.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Price.main(args);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите магазин в котором хотите скупиться");
        String userShop = sc.nextLine();

    }
}
/*вывод на экран информации о товарах, продающихся в магазине, название которого введено с клавиатуры

     (если такого магазина нет, вывести исключение).*/