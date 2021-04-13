package homework9.task2;

import java.util.Objects;

public class Device {

    private String manufacturer;
    private float price;
    private String serialNumber;

    Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " +
                "manufacturer - " + manufacturer +
                ", price - " + price +
                ", serialNumber - " + serialNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (object instanceof Device) {
            Device dv = (Device) object;
            return hashCode() == object.hashCode() && getPrice() == dv.getPrice() && getManufacturer().equals(dv.getManufacturer()) &&  getSerialNumber().equals(dv.getSerialNumber());
        }
        return false;
    }

    @Override
    public int hashCode(){
        int result = 3;
        result = 13 * result + (manufacturer == null ? 0 : manufacturer.length());
        result = 13 * result + (int) Math.ceil(price); //Float.floatToIntBits(price);
        result = 13 * result + (serialNumber == null ? 0 : serialNumber.length());
        return result;
    }

}

