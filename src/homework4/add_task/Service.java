package homework4.add_task;
import javax.swing.*;
import java.util.*;

public class Service {

    SupportService sup = new SupportService();

    Integer id;
    String serviceName;
    boolean isActive;
    double serviceMonthPrice;
    List<Integer> listCustomersId; //= listOfCustomersId();


   /* public List<Integer> listOfCustomersId(){
        Customer cs = new Customer();
        List<Integer> listCustomersId = new ArrayList<>();
        for (int i = 0; i < 10; i++){ //SupportService.countOfCustomers
            listCustomersId.add(cs.getId());  //(Customer.id);
        }
        return listCustomersId;
    }*/



}
