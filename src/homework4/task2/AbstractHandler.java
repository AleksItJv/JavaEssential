package homework4.task2;

public abstract class AbstractHandler {

    abstract void open();

    abstract void create();

    abstract void change();

    abstract void save();

    public void workWithDocs() {

       /* open();
        create();
        change();
        save();*/

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