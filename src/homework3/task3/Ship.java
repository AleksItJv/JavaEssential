package homework3.task3;

public class Ship extends Vehicle {

    int countOfPassangers;
    String portAddress;

    @Override
    public String toString() {
        return "Ship: " +
                "Count Of Passangers = " + countOfPassangers +
                ", Port Address = " + portAddress +
                ", Cost = " + cost +
                ", Speed = " + speed +
                ", Year = " + year +
                "";
    }
}
