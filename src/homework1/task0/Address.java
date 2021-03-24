package homework1.task0;

public class Address {
    private String index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public static void main(String[] args) {
        Address address = new Address("01001", "Ukraine", "Kiev", "Bohatirska", 30, 39);
        System.out.println("Post address: " + address.index + ", " + address.country + ", " + address.city + ", " + address.street + ", " + address.house + ", " + address.apartment);

    }

    public Address(String index, String country, String city, String street, int house, int apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
}
