package homework10.task3;

import java.io.IOException;
import java.util.Arrays;

public class Between {

    public static void main(String[] args) {

        Between bt = new Between();
        System.out.println(Arrays.toString(bt.integersBetween(1, 4)));
    }

    int[] integersBetween(int a, int b) {
        try {
            if (a > b) {
                throw new IOException();
            }
        } catch (IOException ex){
            System.out.println("Число \'a\', больше чем \'b\', не верно по условию");
        }
        int[] arr = new int[0];
        try {
            arr = new int[b - a + 1];
            for (int i = 0; i < b - a + 1; i++) {
                arr[i] = a + i;
            }

        } catch (NegativeArraySizeException ex){
            System.out.println("Не верный ввод переменных");
        }
        return arr;
    }
}
/*
Complete the function that takes two integers (a, b, where a < b) and return
an array of all integers between the input parameters, including them.
For example:
a = 1
b = 4
--> [1, 2, 3, 4]
*/
