package com.endava.model;

import java.util.Date;

public class Author extends Registry{
    private String name;
    private Date birthDate;

    public Author(int id) {
        super(id);
    }

    public Author(int id, String name, Date birthDate) {
        super(id);
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
