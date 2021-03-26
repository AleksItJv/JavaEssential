package homework2.task4;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car();
        Car bugatti = new Car("Red");
        Car volga = new Car(1998, "White");
        Car zaz = new Car(2003, 175, 1450, "Blue");

        System.out.printf("%s: yaer - %d; speed - %.2f; weigth - %d;  color - %s", "Audi", audi.year, audi.speed, audi.weight, audi.color + "\n");
        System.out.printf("%s:  yaer - %d; speed - %.2f; weigth - %d;  color - %s", "Bugatti", bugatti.year, bugatti.speed, bugatti.weight, bugatti.color + "\n");
        System.out.printf("%s: yaer - %d; speed - %.2f; weigth - %d;  color - %s", "Volga", volga.year, volga.speed, volga.weight, volga.color + "\n");
        System.out.printf("%s: yaer - %d; speed - %.2f; weigth - %d;  color - %s", "ZAZ", zaz.year, zaz.speed, zaz.weight, zaz.color + "\n");

    }
}
