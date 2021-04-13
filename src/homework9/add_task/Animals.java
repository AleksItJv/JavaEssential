package homework9.add_task;


import java.sql.Struct;

public class Animals {

    String name;
    int age;
    Boolean tail;

    Animals(String name, int age, Boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String toString() {
        return "Имя: " + name + ", возраст: " + age + ", хвост: " + tail + "";
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 33 * result + (name == null ? 0 : name.length());
        result = 33 * result + age;
        result = 33 * result + (tail ? 1 : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof Animals) {
            Animals animal = (Animals) obj;
            return hashCode() == animal.hashCode() && name.equals(animal.name) && age == animal.age && tail == animal.tail;
        }
        return false;
    }

}
/*Создать класс Animal с именем String, возрастом int, хвостом Boolean. В классе переопределить метод
toString, что бы вывод был следующим:
«Имя: Васька, возраст: 45, хвост: нет».
В классе Animal переопределить методы equals & hashCode. (edited) */