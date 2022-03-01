package com.example.booklibrary.model;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;

    @Column
    private String name;
    @Column
    private String author;
    @Column
    private String genre;

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String bookName) {
        this.name = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String bookAuthor) {
        this.author = bookAuthor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String bookGenre) {
        this.genre = bookGenre;
    }
}
