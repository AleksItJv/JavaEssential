package homework1.task2;

import java.util.Scanner;

public class Rectangle {
    private double side1;
    private double side2;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner number = new Scanner(System.in);
        System.out.println("Enter sides (for example: **,**)");
        rectangle.side1 = number.nextDouble();
        rectangle.side2 = number.nextDouble();
        System.out.println("Area of a rectangle: " + rectangle.areaCalculator(rectangle.side1, rectangle.side2));
        System.out.println("Perimeter of the rectangle: " + rectangle.perimeterCalculator(rectangle.side1, rectangle.side2));
    }

    double areaCalculator(double side1, double side2) {        //вычисляем площадь прямоугольника
        return side1 * side2;
    }

    double perimeterCalculator(double side1, double side2) {   //вычисляем периметр прямоугольника
        return 2 * (side1 + side2);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
}
