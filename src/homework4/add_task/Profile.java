package homework4.add_task;

import homework3.add_task.Printer;
import homework4.add_task.Customer;

import java.util.ArrayList;
import java.util.List;

public class Profile {

    private static int index;
    List<Integer> profileID = new ArrayList<>();
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String postalCode;
    private int customerID;
    private Integer supportSpecID;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public static int getIndex() {
       return index;
    }

    public static int newIndex() {
        return Profile.index += 1;
    }

}
