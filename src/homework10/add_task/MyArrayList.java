package homework10.add_task;

import java.util.Arrays;

public class MyArrayList<E> {

    private int size = 0;
    private int capacity = 10;
    private E[] arrayData = (E[]) new Object[capacity];

    //private E[] array = (E[]) Array.newInstance(MyArrayList.class, capacity);

    public static void main(String[] args) {

        MyArrayList myList = new MyArrayList<>();
        myList.addElement("one");
        myList.addElement("two");
        myList.addElement("three");
        myList.addElement("four");
        myList.addElement("five");
        System.out.println(myList);
        System.out.println(myList.getElement(1));
        //myList.setElement(1, "newEl");
        System.out.println(myList.indexOfFirstElement("two"));
        System.out.println(myList.indexOfLastElement("asd"));
        System.out.println(myList);
        //myList.clear();
        System.out.println(myList);
        System.out.println(myList.isEmpty());
        myList.addForIndex(5, "blabla");
        System.out.println(myList);
        myList.trimToSize();
        System.out.println(myList);
        System.out.println(Arrays.toString(myList.toArray()));



    }

    void addElement(E element) {

        if (size == capacity) {
            growArr();
        }
        arrayData[size++] = element;
    }

    E getElement(int index) {

        return (E) arrayData[index];
    }

    void setElement(int index, E element) {

        if (index < 0 && index > size) {
            throw new ArrayIndexOutOfBoundsException("incorrect index number");
        }
        arrayData[index] = element;
    }

    int indexOfFirstElement(E element) {

        int index = 0;
        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] != null && arrayData[i].equals(element)) {
                index = i;
                break;
            }
        }
        return index;
    }

    int indexOfLastElement(E element) {

        int index = 0;
        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] != null && arrayData[i].equals(element)) {
                index = i;
            }
        }
        return index;
    }

    int getSize() {
        return size;
    }

    void clear() {
        for (int i = 0; i < size; i++) {
            arrayData[i] = null;
        }
    }

    boolean isEmpty() {

        boolean bl;
        int count = 0;
        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] != null) {
                count++;
            }
        }
        return bl = (count == 0) ? true : false;
    }

    /* --------------------------------------------------------*/

    void addForIndex(int index, E element) {
        if (index > size){
            throw new ArrayIndexOutOfBoundsException("incorrect index");
        }
        E[] newArray = (E[]) new Object[arrayData.length + 2];
        System.arraycopy(arrayData, 0, newArray, 0, arrayData.length - (arrayData.length - index));
        System.arraycopy(arrayData, index, newArray, index + 1, arrayData.length - index);
        arrayData = newArray;
        arrayData[index] = element;
        size++;


    }

    E[] toArray(){
        Object[] arr = arrayData;
        return (E[]) arr;
    }

    void trimToSize(){
        if(arrayData.length > size && size > 0){
            E[] arr = Arrays.copyOf(arrayData, size);
            arrayData = arr;
        }
    }

    void listIterator(){
        //осталось
    }


    void growArr() {

        E[] newArrayData = (E[]) new Object[capacity *= 1.62];
        newArrayData = Arrays.copyOf(arrayData, newArrayData.length);
        arrayData = newArrayData;
    }

    @Override
    public String toString() {
        return "MyArrayList: " + Arrays.toString(arrayData);
    }
}
