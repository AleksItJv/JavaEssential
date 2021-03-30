package homework3.task2;

public class ExcelentPupil extends Pupil {

    public ExcelentPupil(String nameOfPupil) {
        super(nameOfPupil);
    }

    public ExcelentPupil(String firstName, String lastName) {
        super(firstName, lastName);
    }

    void study() {
        System.out.println(lastName + " " + firstName + " - is a great student");
    }

    void read() {
        System.out.println(lastName + " " + firstName + " - read is good");
    }

    void write() {
        System.out.println(lastName + " " + firstName + " - write is excelent");
    }

    void relax() {
        System.out.println(lastName + " " + firstName + " - relax is good");
    }
}
