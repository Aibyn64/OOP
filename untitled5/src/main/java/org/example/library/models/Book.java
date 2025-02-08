package org.libr.models;

public class Book extends BaseEntity {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(int id, String title, String author, boolean isBorrowed) {
        super(id);
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }
}