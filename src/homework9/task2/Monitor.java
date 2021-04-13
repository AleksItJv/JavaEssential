package homework9.task2;

import java.util.Objects;

public class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public String toString() {
        return "Monitor: " + "manufaktura - " + getManufacturer() +
                ", price - " + getPrice() +
                ", serial number - " + getSerialNumber() +
                ", resolution X - " + resolutionX +
                ", resolution Y - " + resolutionY;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (object instanceof Monitor) {
            Monitor mn = (Monitor) object;
            return hashCode() == object.hashCode() && getPrice() == mn.getPrice() && getManufacturer().equals(mn.getManufacturer()) && resolutionX == mn.resolutionX && resolutionY == mn.resolutionY && getSerialNumber().equals(mn.getSerialNumber());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 3;
        result = 13 * result + (getManufacturer() == null ? 0 : getManufacturer().length());
        result = 13 * result + (int) Math.ceil(getPrice()); //Float.floatToIntBits(price);
        result = 13 * result + (getSerialNumber() == null ? 0 : getSerialNumber().length());
        result = 13 * result + resolutionX;
        result = 13 * result + resolutionY;
        return result;
    }

}
