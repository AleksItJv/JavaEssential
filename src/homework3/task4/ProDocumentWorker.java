package homework3.task4;

public class ProDocumentWorker extends DocumentWorker {

    void editDocument() {
        System.out.println("Документ отредактирован");
    }

    void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах " +
                "доступно в версии Эксперт");
    }
}
