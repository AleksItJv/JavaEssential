package homework3.task4;

import java.util.Scanner;

public class DocumentWorker {

    public static void main(String[] args) {

        Scanner inKey = new Scanner(System.in);
        String anyKey = inKey.nextLine();
        // ключ будет pro and exp
        if (anyKey.equalsIgnoreCase("pro")) {
            DocumentWorker pro = new ProDocumentWorker();
            pro.openDocument();
            pro.editDocument();
            pro.saveDocument();
        } else if (anyKey.equalsIgnoreCase("exp")) {
            DocumentWorker exp = new ExpertDocumentWorker();
            exp.openDocument();
            exp.editDocument();
            exp.saveDocument();
        } else {
            DocumentWorker doc = new DocumentWorker();
            doc.openDocument();
            doc.editDocument();
            doc.saveDocument();
        }
    }

    void openDocument() {
        System.out.println("Документ открыт");
    }

    void editDocument() {
        System.out.println("Редактирование документа доступно в версии Про");
    }

    void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");
    }
}

/*Создайте класс DocumentWorker.
В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт",
"Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
Создайте производный класс ProDocumentWorker.
Переопределите соответствующие методы, при переопределении методов выводите следующие строки:
"Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах
доступно в версии Эксперт".
Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран
"Документ сохранен в новом формате".
В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается
экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться
экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.*/