package homework4.task2;

public class AbstractHandler {

    void open(){}

    void create(){}

    void change(){}

    void save(){}

    public static void startTask2() {

        AbstractHandler doc = new DOCHandler();
        AbstractHandler txt = new TXTHandler();
        AbstractHandler xml = new XMLHandler();

        System.out.println("Working with word.files - ");
        doc.create();
        doc.change();

        System.out.println("Working with txt.files - ");
        xml.open();
        xml.save();

        System.out.println("Working with xml.miles - ");
        txt.open();
        txt.change();
        txt.save();
    }
}