package homework4.add_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SupportService {

    public static void main(String[] args) {

/*        List<Integer> integers = new ArrayList<>(10);        // ВОПРОС
        for (int i = 0; i < integers.size(); i++) {                  // Почему мне выдает ошибку, типа integers.size()
            integers.add(i);                                         // будет всегда false.. initialCapacity не работает?
            System.out.println(integers);
        }*/

        Customer[] customer = new Customer[13];
        for (int i = 0; i < customer.length; i++) {
            customer[i] = new Customer();
        }

        SupportSpecialist[] supSpec = new SupportSpecialist[5];
        for (int i = 0; i < supSpec.length; i++) {
            supSpec[i] = new SupportSpecialist();
        }

        customer[0].addCustomer(1, "First", "qwerty", "Alex", "lastName", "first@gmail.com", "0990011000", "Kyev", "06660");
        customer[1].addCustomer(2, "Second", "123", "Brut", "lastName", "second@gmail.com", "0990011000", "Kyev", "06660");
        customer[2].addCustomer(3, "Third", "123", "Clio", "lastName", "second@gmail.com", "0990011000", "Kyev", "06660");
        customer[3].addCustomer(4, "Forth", "123", "Dark", "lastName", "second@gmail.com", "0990011000", "Kyev", "06660");
        customer[4].addCustomer(5, "Fifth", "123", "Elf", "lastName", "second@gmail.com", "0990011000", "Kyev", "06660");
        customer[5].addCustomer(6, "Sixth", "123", "Fuk", "lastName", "second@gmail.com", "0990011000", "Kyev", "06660");

        supSpec[0].addSupportSpecialist(1, "Support1", "qwe", "Nix1", "Yeld", "sup@gmail.com", "03");
        supSpec[1].addSupportSpecialist(2, "Support2", "qwe", "Nix2", "Yeld", "sup@gmail.com", "03");

        customer[6].addCustomer(7, "Seventh", "123", "Gogy", "lastName", "second@gmail.com", "0990011000", "Kyev", "06660");
        customer[7].addCustomer(8, "Eighth", "123", "Imap", "lastName", "second@gmail.com", "0990011000", "Kyev", "06660");
        customer[8].addCustomer(9, "Ninth", "123", "Lucas", "lastName", "second@gmail.com", "0990011000", "Kyev", "06660");
        customer[9].addCustomer(10, "Tenth", "123", "Xman", "lastName", "second@gmail.com", "0990011000", "Kyev", "06660");

        supSpec[2].addSupportSpecialist(3, "Support3", "qwe", "Nix3", "Yeld", "sup@gmail.com", "03");
        supSpec[3].addSupportSpecialist(4, "Support4", "qwe", "Nix4", "Yeld", "sup@gmail.com", "03");
        supSpec[4].addSupportSpecialist(5, "Support5", "qwe", "Nix5", "Yeld", "sup@gmail.com", "03");
        customer[10].addCustomer(11, "11-th", "123");
        customer[11].addCustomer(12, "12-th", "123");
        customer[12].addCustomer(13, "13-th", "123");
        //System.out.println(supSpec[0].profileID);

        Service[] service = new Service[5];
        for (int i = 0; i < supSpec.length; i++) {
            service[i] = new Service();
        }
/*        Service service1 = new Service();
        Service service2 = new Service();
        Service service3 = new Service();
        Service service4 = new Service();
        Service service5 = new Service();*/
        service[0].addService(101, Service.COPIWRITING, true, 500);
        service[1].addService(102, Service.REWRITING, true, 200);
        service[2].addService(103, Service.DESIGN, false, 1000);
        service[3].addService(104, Service.DEVELOPMENT, true, 1500);
        service[4].addService(105, Service.GAME, true, 2000);

        Ticket[] tickets = new Ticket[10];
        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = new Ticket();
        }

        tickets[0].addTicket(10001, service[2], "design all", service[2], 5);
        tickets[1].addTicket(10002, service[1], "rewriting", service[1], 2);
        tickets[2].addTicket(10003, service[3], "development", service[3], 3);
        tickets[3].addTicket(10004, service[0], "copiwriting", service[0], 8);
        tickets[4].addTicket(10005, service[4], "game", service[4], 4);
        tickets[5].addTicket(10006, service[2], "design", service[2], 9);
        tickets[6].addTicket(10007, service[1], "rewriting", service[1], 10);
        tickets[7].addTicket(10008, service[3], "development", service[3], 1);
        tickets[8].addTicket(10009, service[0], "copiwriting", service[0], 6);
        tickets[9].addTicket(10010, service[4], "game pro", service[4], 7);
/*        System.out.println(ticket1);
        System.out.println(ticket1.getId());
        System.out.println(ticket1.getServiceName());
        System.out.println(ticket1.isActive());
        System.out.println(ticket1.getProblemDescription());
        System.out.println(ticket1.getCustomerId());*/
        Scanner sc = new Scanner(System.in);
        String stroka = sc.nextLine();
        switch (stroka) {
            case "#fetch_all_customers": {
                for (Customer cust : customer){
                    if (cust.getProfileId() != null) {
                        System.out.println("Customer: " + cust.getUsername() + " " + cust.getFirstName() + " " + cust.getLastName() + " остальные данные " + ": номер профиля - " + cust.getProfileId());
                    }
                }
                break;
            }
            case "#fetch_all_tikets": {
                    for (Ticket ticket : tickets){
                        System.out.print("Ticket: " + "№ " + ticket.getId() + ", " + ticket.getServiceName() + ", " + ticket.getProblemDescription() + ",  " + ticket.isActive() + ": номер профиля - " + ticket.getCustomerId()+ " -->> ");
                        for (Customer cust : customer) {
                            if (ticket.getCustomerId() == cust.getId()){
                                System.out.println(" user:" + cust.getUsername() + ", name:" + cust.getFirstName());
                            }
                        }
                    }
                break;
            }
            case "#fetch_all_specialists": { // выводит список всех тех сотрудников с профилями и тикетами
                for (SupportSpecialist sups : supSpec){
                    System.out.println("Support Speciolist: " + "№ " + sups.id + ", " + sups.username + ", " + sups.getFirstName() + ",  " + sups.getLastName());
                    /*for (Customer cust : customer) {
                        if (ticket.getCustomerId() == cust.getId()){
                            System.out.println(" user:" + cust.getUsername() + ", name:" + cust.getFirstName());
                        }
                    }*/
                }

                break;
            }

            default: {
                System.out.println("Is't not command");
                break;
            }
        }
/*        if(stroka.equalsIgnoreCase("#fetch_all_customers")){
            for (Customer cust : customer){
                if (cust.getProfileId() != null) {
                    System.out.println("Customer: " + cust.getUsername() + " " + cust.getFirstName() + " " + cust.getLastName() + " остальные данные " + ": номер профиля - " + cust.getProfileId());
                }
            }
        }*/

/*        if(stroka.equalsIgnoreCase("tickets")){
            for (Ticket ticket : tickets){
                    System.out.print("Ticket: " + "№ " + ticket.getId() + ", " + ticket.getServiceName() + ", " + ticket.getProblemDescription() + ",  " + ticket.isActive() + ": номер профиля - " + ticket.getCustomerId()+ " -->> ");
                    for (Customer cust : customer) {
                        if (ticket.getCustomerId() == cust.getId()){
                            System.out.println(" user:" + cust.getUsername() + ", name:" + cust.getFirstName());
                        }
                    }
            }
        }*/





    }

}

/*        List<Integer> listCustomersId = new ArrayList<>();
        Customer[] customer = new Customer[10];
        for (int i = 0; i < customer.length; i++) {
            customer[i] = new Customer();
            customer[i].setId(i + 1);
            customer[i].setUsername("new " + (i + 1));
            listCustomersId.add(customer[i].getId());

        }
        for (int i = 0; i < 10; i++){
            customer[i].setId(i);
            System.out.println(customer[i]);
        }

        for (int i = 0; i < 10; i++){
            customer[i].setUsername("new 1" + i);
            System.out.println(customer[i]);
        }

        for (Customer cust : customer) {
            System.out.println(cust);
        }
        Service service = new Service();
        System.out.println(listCustomersId);*/
