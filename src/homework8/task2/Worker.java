package homework8.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Worker {

    private String firstName;
    private String lastName;
    private String position;
    private Integer yearStarter;

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Worker: "
                + firstName +
                ", " + lastName +
                ", " + position +
                ", " + yearStarter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //LocalDate data = LocalDate.now();
        Worker workers[] = new Worker[5];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker(sc.next(), sc.next(), sc.next(), sc.next());
        }
        Arrays.sort(workers, new NameComparator());
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }
    }

    Worker(String firstName, String lastName, String position, String yearStarter) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        int x = 0;
        try {
            x = Integer.parseInt(yearStarter);
        } catch (NumberFormatException inMisEx) {
            System.out.println("Вы ввели не корректный год");
            System.out.println(inMisEx.getMessage());
        }
        this.yearStarter = x;
    }
}

class NameComparator implements Comparator<Worker> {
    public int compare(Worker workers1, Worker workers2) {
        char ch1 = workers1.getFirstName().charAt(0);
        char ch2 = workers2.getFirstName().charAt(0);
        return ch1 - ch2;
    }
}

/*
Frank
Sinatra
designer
2005
Alex
Filipov
seo
2000
Grom
North
hater
2008
Blum
Poloter
insider
2006
Polak
Zolak
leo
2009

*/