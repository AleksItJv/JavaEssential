package homework3.task3;

public class Car extends Vehicle {
    @Override
    public String toString() {
        return "Car: " +
                "cost = " + cost +
                ", speed = " + speed +
                ", year = " + year +
                "";
    }
}
