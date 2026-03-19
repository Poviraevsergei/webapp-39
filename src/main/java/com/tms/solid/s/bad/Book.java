package com.tms.solid.s.bad;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void writeInfoAboutBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    public boolean saveBook(String filename) {
        // сохранение в БД
        // логика сохранения книги в файл

        return false;
    }
}
