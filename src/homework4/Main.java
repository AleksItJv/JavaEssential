package homework4;



import homework4.task2.AbstractHandler;
import homework4.task2.DOCHandler;
import homework4.task2.TXTHandler;
import homework4.task2.XMLHandler;
import homework4.task3.Player;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.startTask2();
        System.out.println("-------------------------------------------------------");
        main.startTask3();
    }

    void startTask2() {
        new DOCHandler().workWithDocs();
        new TXTHandler().workWithDocs();
        new XMLHandler().workWithDocs();

        //AbstractHandler.startTask2();
    }

    void startTask3(){
        Player player = new Player();
        player.play();
        player.pause();
        player.record();
        player.stop();
    }


    //void startAddTask() { Printer printer = new Printer(); }
}