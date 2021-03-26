package homework2.task4;

public class Car {

    int year;
    double speed;
    int weight;
    String color;

    public Car() {
        this(2020, 200d, 1500, "Black");
    }

    public Car(String color) {
        this(2020, 200d, 1500, color);

    }

    public Car(int year, String color) {
        this(year, 200d, 1500, color);
    }

    public Car(int year, double speed, String color) {
        this(year, speed, 1500, color);
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}

/*Используя Intelij IDEA создать пакет.
(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
Перегрузить конструкторы вызывая конструктор из конструктора.
Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.*/