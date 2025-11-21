package rvt;

public class Book {
    String title;
    int pages;
    int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String name() {
        return this.title;
    }

    public String toString() {
        return this.title + ", "+ this.pages + " pages, " + this.year;
    }
}