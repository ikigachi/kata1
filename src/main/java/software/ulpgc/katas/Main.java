package software.ulpgc.katas;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Hobbit", 310);

        System.out.println("Title: " + book.title());
        System.out.println("Pages: " + book.pages());
        System.out.println("Long book: " + book.isLong());
    }
}
