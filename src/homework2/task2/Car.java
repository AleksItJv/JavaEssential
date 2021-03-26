package homework2.task2;

public class Car {

    int year;
    String color;

    public Car() {
        check();
    }

    public Car(int year) {
        this.year = year;
        check();
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public void check() {
        if (color == null) {
            color = "unknown";
        }

    }
}
/*
Используя Intelij IDEA создать пакет.
Создать класс Машина с полями год(int), цвет(String).
Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
Создать класс Main в котором создать экземпляры вызывая разные конструкторы.*/