package homework2.task3;

public class Car {

    int year;
    double speed;
    int weight;
    String color;

    public Car() {
        this.year = 2015;
        this.speed = 200;
        this.weight = 1500;
        this.color = "green";    }

    public Car(String color) {
        this.year = 2015;
        this.speed = 200;
        this.weight = 1500;
        this.color = color;
    }

    public Car(int year, String color) {
        this.year = year;
        this.speed = 200;
        this.weight = 1500;
        this.color = color;    }

    public Car(int year, double speed, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = 1500;
        this.color = color;
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
Перегрузить конструкторы.
Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.*/