package homework4.add_task;

import java.util.ArrayList;
import java.util.List;

public class SupportService {


    //static Integer countOfCustomers = 10;

    public static void main(String[] args) {

        List<Integer> listCustomersId = new ArrayList<>();
        Customer[] customer = new Customer[10];
        for (int i = 0; i < customer.length; i++) {
            customer[i] = new Customer();
            customer[i].setId(i + 1);
            customer[i].setUsername("new " + (i + 1));
            listCustomersId.add(customer[i].getId());

        }
        /*for (int i = 0; i < 10; i++){
            customer[i].setId(i);
            System.out.println(customer[i]);
        }

        for (int i = 0; i < 10; i++){
            customer[i].setUsername("new 1" + i);
            System.out.println(customer[i]);
        }*/

        for (Customer cust : customer) {
            System.out.println(cust);
        }
        Service service = new Service();
        System.out.println(listCustomersId);


    }



}
