package homework3.task2;

public class ClassRoom {

    public static void main(String[] args) {
        Pupil badMan = new BadPupil("Fedja", "Stone");
        Pupil goodMan = new GoodPupil("Edward", "Scissorhands");
        Pupil excelentPupil = new ExcelentPupil("Platon");
        Pupil normalPupil = new Pupil("Alisher");
        normalPupil.academicPerformance();
        badMan.academicPerformance();
        goodMan.academicPerformance();
        excelentPupil.academicPerformance();
    }

}
