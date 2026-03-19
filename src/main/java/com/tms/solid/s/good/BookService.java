package com.tms.solid.s.good;

public class BookService {
    public void saveBookToDatabase() {
        // сохранение в БД
    }

    public void saveBookToFile(String filename) {
        // логика сохранения книги в файл
    }

    public boolean saveBook(String filename) {
        saveBookToFile(filename);
        saveBookToDatabase();

        return false;
    }

    public void writeInfoAboutBook(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Pages: " + book.getPages());
    }
}
