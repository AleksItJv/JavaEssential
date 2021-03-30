package homework3.task2;

public class GoodPupil extends Pupil {

    public GoodPupil(String nameOfPupil) {
        super(nameOfPupil);
    }

    public GoodPupil(String firstName, String lastName) {
        super(firstName, lastName);
    }

    void study() {
        System.out.println(lastName + " " + firstName + " - is a good student");
    }

    void read() {
        System.out.println(lastName + " " + firstName + " - reads well");
    }

    void write() {
        System.out.println(lastName + " " + firstName + " - writes well");
    }

    void relax() {
        System.out.println(lastName + " " + firstName + " - resting badly");
    }
}
