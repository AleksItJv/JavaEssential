package homework1.task3;

public class Book {

    Author author = new Author();
    Content content = new Content();
    Title tittle = new Title();

    public static void main(String[] args) {
        Book book = new Book();
        book.show();

    }

    public void show() {
        author.show();
        tittle.show();
        content.show();

    }
}
