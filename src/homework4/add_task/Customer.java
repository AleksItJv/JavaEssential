package homework4.add_task;

import java.util.*;

public class Customer extends Profile implements AddNewCustomer{


    private Integer id;
    private String username = "";
    private String password = "";
    private Integer profileID;
    //List<Integer> serviceId = new ArrayList<>();
    //List<Integer> tiketId = new ArrayList<>();

    @Override
    public void addCustomer(int id, String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, String postalCode) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.profileID = Profile.newIndex();
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setAddress(address);
        this.setPostalCode(postalCode);
    }

    public void addCustomer(int id, String username, String password) {
        this.username = username;
        this.password = password;
        this.id = id;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getProfileId() {
        return profileID;
    }

    public void setProfileId(Integer profileId) {
        this.profileID = profileID;
    }


    public void thisIsMetodHide(){

    }

}


/*public List<Integer> listOfCustomersId(){
        Customer cs = new Customer();
        List<Integer> listCustomersId = new ArrayList<>();
        for (int i = 0; i < 10; i++){ //SupportService.countOfCustomers
            listCustomersId.add(cs.id);  //(Customer.id);
        }
        return listCustomersId;
    }*/