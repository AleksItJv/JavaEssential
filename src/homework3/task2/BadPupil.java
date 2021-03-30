package homework3.task2;

public class BadPupil extends Pupil {

    BadPupil(String nameOfPupil) {
        super(nameOfPupil);
    }

    public BadPupil(String firstName, String lastName) {
        super(firstName, lastName);
    }

    void study() {
        System.out.println(lastName + " " + firstName + " - is a bad student");
    }

    void read() {
        System.out.println(lastName + " " + firstName + " - reads bedly");
    }

    void write() {
        System.out.println(lastName + " " + firstName + " - writes badly");
    }

    void relax() {
        System.out.println(lastName + " " + firstName + " - resting well");
    }
}
