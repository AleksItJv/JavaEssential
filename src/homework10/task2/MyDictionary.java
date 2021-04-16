package homework10.task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyDictionary<TKey, TValue> implements IDictionary<TKey, TValue> {

    int capacity = 5;
    private Box<TKey, TValue>[] array = (Box<TKey, TValue>[]) Array.newInstance(Box.class, capacity);
    private int size = 0;

    public static void main(String[] args) {

        //добавление элементов в массив
        MyDictionary myDictionary = new MyDictionary();
        try {
            myDictionary.addElements("first", "element1");
            myDictionary.addElements("second", "element2");
            myDictionary.addElements("third", "element3");
            myDictionary.addElements("forth", "element3");
            myDictionary.addElements("fifth", "element3");
            myDictionary.addElements("six", "element3");
        } catch (NullPointerException nullPointerEx) {
            System.out.println("Catch bag - This is key already existed ");
        }
        try { //вывод value по индексу
            System.out.println(myDictionary.valueOf(1));
            System.out.println(myDictionary.valueOf(2));
            System.out.println(myDictionary.valueOf(3));
        } catch (NullPointerException ex) {
            System.out.println("Catch bag - NullPointerException ");
        }

        //проверка количества пар элементов
        System.out.println(myDictionary.countPair());

        //вывод значений
        for (Box arr : myDictionary.array) {
            System.out.println(arr);
        }
    }

    @Override
    public void addElements(TKey key, TValue value) {
        var box = new Box<>(key, value);
        if (size == array.length) {
            arrayGrow();
        }
        for (int i = 0; i < size; i++) {
            if (array[i].getKey().hashCode() == box.getKey().hashCode()) {
                throw new NullPointerException("This is element existed !!!!!");
            }
        }
        array[size++] = box;

    }

    @Override
    public TValue valueOf(int i) {
        if (i < 0 && i >= array.length) {
            throw new ArrayIndexOutOfBoundsException("incorrect index o_O");
        }
        if (i >= size) {
            throw new NullPointerException("incorrect index O_o");
        }

        return array[i].getValue();
    }

    @Override
    public int countPair() {
        return size;
    }

    @Override
    public String toString() {
        return "MyDictionary{" +
                "capacity=" + capacity +
                ", array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    void arrayGrow() {
        Box<TKey, TValue>[] newArr = (Box<TKey, TValue>[]) Array.newInstance(Box.class, (capacity *= 1.62));
        newArr = Arrays.copyOf(array, newArr.length);
        array = newArr;
    }

}


