package homework9.task2;

public class Main {
    public static void main(String[] args) {

        // дописано 3 таск во второй
        Device dv = new Device("Git", 100f, "#505");
        // task2 System.out.printf("%s, %.2f, %s \n", dv.getManufacturer(), dv.getPrice(), dv.getSerialNumber());
        System.out.println(dv);

        Monitor monitor = new Monitor("LG", 500f, "#333", 800, 600);
        // task2 System.out.printf("%s, %.2f, %s, %d, %d \n", monitor.getManufacturer(), monitor.getPrice(), monitor.getSerialNumber(), monitor.getResolutionX(), monitor.getResolutionY());
        System.out.println(monitor);

        EthernetAdapter ea = new EthernetAdapter("Next", 200.2f, "#650", 100, "20-89-84-41-4A-7C");
        // task2 System.out.printf("Ethernet Adapter: %s, %.2f uah, id %s, speed %d, mac %s \n", ea.getManufacturer(), ea.getPrice(), ea.getSerialNumber(), ea.getSpeed(), ea.getMac());
        System.out.println(ea);

        /* TASK--->>>>4 */

        Device device1 = new Device("GigaGit", 100f, "#705");
        Monitor monik1 = new Monitor("Samsung", 1000f, "#301", 1024, 800);
        Monitor monik2 = new Monitor("Samsung", 1000f, "#301", 1024, 800);
        EthernetAdapter ea1 = new EthernetAdapter("Next", 200f, "#650", 100, "20-89-84-41-4A-7C");
        EthernetAdapter ea2 = new EthernetAdapter("Next", 200f, "#650", 100, "20-89-84-41-4A-7C");

        System.out.println("\n Task 4 - equals");
        System.out.println(device1.equals(monik1)); //false
        System.out.println(device1.equals(ea2));    //false
        System.out.println(monik1.equals(monik2));  //true
        System.out.println(monik1.equals(ea1));     //false
        System.out.println(ea1.equals(ea2));        //true

        System.out.println("\n Task 4 - hashCode");
        System.out.println(device1.hashCode());
        System.out.println(monik1.hashCode());
        System.out.println(monik2.hashCode());
        System.out.println(ea1.hashCode());
        System.out.println(ea2.hashCode());

    }
}
