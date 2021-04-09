package homework7.add_task;

public enum Vehicles {
    AUDI(10000), BMW(20000), LAMBA(30000), FERRARI(40000);
    int price;
    String color = " whatever you want";

    Vehicles(int price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        return "Auto - " + super.toString() + " price: " + this.price + " color: " + this.color;
    }
}
