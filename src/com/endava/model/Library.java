package com.endava.model;

import java.util.ArrayList;

public class Library extends Registry{

    private int name;
    private ArrayList<Book> inventary = new ArrayList<Book>();

    public Library(int id) {
        super(id);
        this.inventary = new ArrayList<Book>();
    }

    public Library(int id, int name, ArrayList<Book> inventary) {
        super(id);
        this.name = name;
        this.inventary = inventary;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setInventary(ArrayList<Book> inventary) {
        this.inventary = inventary;
    }
}
