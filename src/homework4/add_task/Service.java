package homework4.add_task;

import javax.swing.*;
import java.util.*;

public class Service {

    public static final String COPIWRITING = "Copywriting";
    public static final String REWRITING = "Rewriting";
    public static final String DESIGN = "Design";
    public static final String DEVELOPMENT = "Development";
    public static final String GAME = "Game";

    private int id;
    private String serviceName;
    private boolean isActive;
    private double serviceMonthPrice;
    List<Integer> listCustomersId; //= listOfCustomersId();

    public void addService(int id, String serviceName, boolean isActive, double serviceMonthPrice) {
        this.id = id;
        this.serviceMonthPrice = serviceMonthPrice;
        this.serviceName = serviceName;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getServiceMonthPrice() {
        return serviceMonthPrice;
    }

    public void setServiceMonthPrice(double serviceMonthPrice) {
        this.serviceMonthPrice = serviceMonthPrice;
    }



    /* public List<Integer> listOfCustomersId(){
        Customer cs = new Customer();
        List<Integer> listCustomersId = new ArrayList<>();
        for (int i = 0; i < 10; i++){ //SupportService.countOfCustomers
            listCustomersId.add(cs.getId());  //(Customer.id);
        }
        return listCustomersId;
    }*/


}
