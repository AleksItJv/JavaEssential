package homework6.task2;

public class Vehicle {

    void printWheelColor() {
        Wheel wheel = new Wheel();
        System.out.println("Wheel color - " + wheel.color);

    }

    void printDoorColor() {
        System.out.println("Door color - " + new Door().color);

    }

    private class Wheel {

        private String color = "black";

    }

    private class Door {

        private String color = "white";

    }
}




/*Задание 2
Создать класс Vehicle. В классе Vehicle, создайте внутренние, приватные классы Wheel и Door,
 которые содержат поле color(содержит цвет). Создайте методы printWheelColor, printDoorColor
  y класса Vehicle - выведите цвета в консоль в классе Main.*/