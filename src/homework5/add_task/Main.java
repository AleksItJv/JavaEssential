package homework5.add_task;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Teacher[] tichs = new Teacher[4];
        tichs[0] = new Teacher("Зоя Сквернова", 86, "Скверный");
        tichs[1] = new Teacher("Алина Строгачева", 46, "Строгий");
        tichs[2] = new Teacher("Любовь Приятная", 26, "Любвиобильный");
        tichs[3] = new Teacher("Вероника Добрынева", 35, "Добрый");

        ArrayList<Teacher> teachers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            teachers.add(tichs[i]);
        }
        for (Teacher tich : teachers) {
            if (tich.getCharacter().equals(Teacher.BAD)) {
                System.out.println(tich + "Не айс учитель!");
            } else if (tich.getCharacter().equals(Teacher.GOOD)) {
                System.out.println(tich + "Зачетный учитель!");
            } else {
                //System.out.println("ХЗ какой учитель");
            }
        }
    }

}
