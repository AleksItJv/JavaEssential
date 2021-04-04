package homework5.add_task;

public class Teacher {

    public static final String BAD = "Скверный";
    public static final String GOOD = "Добрый";
    private String name;
    private int age;
    private String character;

    public Teacher (String name, int age, String character){
        this.character = character;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher: " +
                "" + name +
                ", age: " + age +
                ", character: " + character + " --> ";
    }

    public String getCharacter() {
        return character;
    }
}
