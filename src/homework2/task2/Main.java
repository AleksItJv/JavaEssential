package homework2.task2;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car(2011, "yellow");
        Car bugatti = new Car(2001);
        Car volga = new Car("red");
        Car zaz = new Car();

        System.out.printf("First car: %s yaer - %d  color - %s", "Audi", audi.year, audi.color + "\n");
        System.out.printf("Second car: %s yaer - %d  color - %s", "Bugatti", bugatti.year, bugatti.color + "\n");
        System.out.printf("Third car: %s yaer - %d  color - %s", "Volga", volga.year, volga.color + "\n");
        System.out.printf("Forth car: %s yaer - %d  color - %s", "ZAZ", zaz.year, zaz.color + "\n");
    }
}

