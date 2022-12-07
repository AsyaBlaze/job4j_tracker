package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Atlas of Six", 895);
        Book book2 = new Book("The Six of Crows", 658);
        Book book3 = new Book("Clean code", 456);
        Book book4 = new Book("Sherlock Holmes", 544);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " " + bk.getPages());
        }

        Book trash = books[0];
        books[0] = books[3];
        books[3] = trash;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if ("Clean code".equals(bk.getName())) {
                System.out.println();
                System.out.println(bk.getName() + " " + bk.getPages());
            }
        }
    }
}
