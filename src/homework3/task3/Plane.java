package homework3.task3;

public class Plane extends Vehicle {
    double height;
    int countOfPassangers;

    @Override
    public String toString() {
        return "Plane: " +
                "Height = " + height +
                ", Count Of Passangers = " + countOfPassangers +
                ", Cost = " + cost +
                ", Speed = " + speed +
                ", Year = " + year +
                "";
    }
}
