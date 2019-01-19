package com.endava.model;

public class Book extends Registry{

    private String name;
    private long ISBN;
    private Author author;

    public Book(int id, String name, long ISBN, Author author) {
        super(id);
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
    }

    public Book(int id) {
        super(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
