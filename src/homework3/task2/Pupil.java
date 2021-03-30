package homework3.task2;

public class Pupil {

    String firstName = "Class";
    String lastName = "Pupil";

    Pupil(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Pupil(String nameOfPupil) {
        this.firstName = nameOfPupil;
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
        System.out.println(lastName + " " + firstName + " - resting well");
    }

    void academicPerformance() {
        study();
        read();
        write();
        relax();
    }
}
