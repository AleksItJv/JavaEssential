package homework3.task3;


import java.util.List;

public class Vehicle {

    double cost;
    double speed;
    int year;

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle plane = new Plane();
        Vehicle ship = new Ship();
        System.out.println(car);
        System.out.println(plane);
        System.out.println(ship);
    }
}
/*Задание 3
Создать класс Vehicle.
В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
выпуска).
Создайте 3 производных класса Plane, Саг и Ship.
Для класса Plane должна быть определена высота и количество пассажиров.
Для класса Ship – количество пассажиров и порт приписки.
Написать программу, которая выводит на экран информацию о каждом средстве передвижения.*/