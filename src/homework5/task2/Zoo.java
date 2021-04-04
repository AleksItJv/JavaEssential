package homework5.task2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
    List<String> animals = new ArrayList<>(8); // почему Capacity не работает?
        //нельзя сразу в конец списка кинуть, выдает ошибку

    animals.add(0, "Cat");
    animals.add(1, "Dog");
    animals.add(2, "Sheep");
    animals.add(0, "Bull");
    animals.add(3, "Fox");
    animals.add(0, "Wolf");
    animals.add(1, "Bear");
    animals.add(0, "Rabbit");
        System.out.println(animals);
    //remove 3-5-7
    animals.remove(2);
    animals.remove(4-1);
    animals.remove(6-2);
        System.out.println(animals);

    }


}
/*Задание 2 Используя Intelij IDEA создать проект, пакет. Создать  класс  Zoo.
  В  классе  создать  список,  в  который  записать  8  животных  через  метод
    add(index, element).  Вывести список в консоль. */