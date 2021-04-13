package homework9.add_task;

public class Main {
    public static void main(String[] args) {

        Animals vaska = new Animals("Васька", 45, false);
        Animals lion = new Animals("Loin", 25, true);
        Animals vik = new Animals("Vik", 35, true);
        Animals brother = new Animals("Васька", 45, false);

        System.out.println(vaska);
        System.out.println(lion);
        System.out.println(vik);
        System.out.println(brother);

        System.out.println(vaska.equals(lion));
        System.out.println(vaska.equals(vik));
        System.out.println(vaska.equals(brother));

        System.out.println(vaska.hashCode());
        System.out.println(lion.hashCode());
        System.out.println(vik.hashCode());
        System.out.println(brother.hashCode());

    }
}
