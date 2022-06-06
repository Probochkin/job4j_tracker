package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
 Book book1 = new Book("Война и Мир", 308);
 Book book2 = new Book("1984", 523);
 Book book3 = new Book("Темная башня", 500);
 Book book4 = new Book("Clean code", 300);
 Book[] books = new Book[4];
 books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
       for (int index = 0; index < books.length; index++) {
           System.out.println(books[index].getName() + "-" + books[index].getPageCounts());
       }
        System.out.println("Поменяем местами 1 и 4 книгу.");
       Book temp = books[0];
       books[0] = books[3];
       books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + "-" + books[index].getPageCounts());
        }
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName() == "Clean code") {
                System.out.println(books[index].getName() + "-" + books[index].getPageCounts());
            }
        }
    }
}
