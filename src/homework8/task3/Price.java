package homework8.task3;

import homework8.task2.Worker;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Price {
    private String product;
    private String nameShop;
    private int price;

    public String getNameShop() {
        return this.nameShop;
    }

    Price(String product, String nameShop, int price) {
        this.product = product;
        this.nameShop = nameShop;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Price prices[] = new Price[2];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = new Price(sc.next(), sc.next(), sc.nextInt());
        }
        Arrays.sort(prices, new NamesComparator());
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        System.out.println("Введите магазин в котором хотите скупиться");
        String userShop = sc.next();
        for (Price shop : prices) {
            try {
                if (userShop.equalsIgnoreCase(shop.getNameShop())) {
                    System.out.println(shop.product + " : " + shop.price + " uah");
                } else {
                    throw new IOException();
                }
            } catch (IOException ioex) {
                System.out.println("This shop doesn't work");
            }
        }


    }

    @Override
    public String toString() {
        return "Create Shops:" +
                "nameShop - " + nameShop +
                ", product - " + product +
                ", price - " + price;
    }
}

class NamesComparator implements Comparator<Price> {
    public int compare(Price nameShop1, Price nameShop2) {
        char ch1 = nameShop1.getNameShop().charAt(0);
        char ch2 = nameShop2.getNameShop().charAt(0);
        return ch1 - ch2;
    }
}

/*
milk
Moloko
25
sugar
Caxapok
55
*/