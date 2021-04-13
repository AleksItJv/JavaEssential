package homework9.task2;

public class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "Monitor: " + "manufaktura - " + getManufacturer() +
                ", price - " + getPrice() +
                ", serial number - " + getSerialNumber() +
                ", speed - " + speed +
                ", mac - " + mac;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (object instanceof EthernetAdapter) {
            EthernetAdapter ea = (EthernetAdapter) object;
            return hashCode() == object.hashCode() && getPrice() == ea.getPrice() && getManufacturer().equals(ea.getManufacturer()) && speed == ea.speed && mac.equals(ea.mac) && getSerialNumber().equals(ea.getSerialNumber());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 3;
        result = 13 * result + (getManufacturer() == null ? 0 : getManufacturer().length());
        result = 13 * result + (int) Math.ceil(getPrice()); //Float.floatToIntBits(price);
        result = 13 * result + (getSerialNumber() == null ? 0 : getSerialNumber().length());
        result = 13 * result + speed;
        result = 13 * result + (mac == null ? 0 : mac.length());
        ;
        return result;
    }
}
