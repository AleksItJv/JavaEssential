package homework2.add_task;

public class MyArea {

    public static final double PI = 3.14d;

    public static double areaOfCircle(double radius) {
        return PI * Math.pow(radius, 2);
    }
}

/*Используя Intelij IDEA создать пакет.
Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle, который
должен принимать радиус и используя PI посчитать площадь круга.
Создать класс Main, где запустить данный метод.*/