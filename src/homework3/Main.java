package homework3;

import homework3.add_task.Printer;
import homework3.task2.ClassRoom;
import homework3.task3.Vehicle;
import homework3.task4.DocumentWorker;
import homework3.task4.ProDocumentWorker;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.startTask2();
        main.startTask3();
        main.startTask4();
        main.startAddTask();
    }

    void startTask3() { Vehicle ven = new Vehicle(); }

    void startTask2() { ClassRoom room = new ClassRoom(); }

    void startTask4() { DocumentWorker doc = new ProDocumentWorker(); }

    void startAddTask() { Printer printer = new Printer(); }
}
/*


Задание 4
Создайте класс DocumentWorker.
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
экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.
Задание 5
Зайдите на сайт Oracle.
Используя поисковые механизмы Oracle, найдите самостоятельно описание темы по каждому примеру,
который был рассмотрен на уроке, так, как это представлено ниже, в разделе «Рекомендуемые ресурсы»,
описания данного урока. Сохраните ссылки и дайте им короткое описание.
Дополнительное задание
Создайте класс Printer.
В теле класса создайте метод void print(String value), который выводит на экран значение аргумента.
Реализуйте возможность того, чтобы в случае наследования от данного класса других классов, и вызове
соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов,
выводились разными цветами.
Обязательно используйте приведение типов.*/
