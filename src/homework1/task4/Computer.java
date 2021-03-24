package homework1.task4;

public class Computer {

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++){
            computers[i] = new Computer();
        }
        for (Computer comp: computers){
            System.out.println(comp);
        }
    }
    
}
