package homework5.task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        ArrayList<Integer> nums = new ArrayList<>(numbers);
        ListIterator<Integer> itererator = nums.listIterator();

        while (itererator.hasNext()) {
            numbers.set(itererator.nextIndex(), numbers.get(itererator.nextIndex()) + 1);
            itererator.next();
        }
        System.out.println(numbers);
    }
}