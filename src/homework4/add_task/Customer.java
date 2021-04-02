package homework4.add_task;

import java.util.*;

public class Customer{


    private Integer id;
    private String username = "";
    String password = "";
    Integer profileId = 0;
    List<Integer> serviceId = new ArrayList<>();
    List<Integer> tiketId = new ArrayList<>();

    public List<Integer> listOfCustomersId(){
        Customer cs = new Customer();
        List<Integer> listCustomersId = new ArrayList<>();
        for (int i = 0; i < 10; i++){ //SupportService.countOfCustomers
            listCustomersId.add(cs.id);  //(Customer.id);
        }
        return listCustomersId;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profileId=" + profileId +
                ", serviceId=" + serviceId +
                ", tiketId=" + tiketId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
