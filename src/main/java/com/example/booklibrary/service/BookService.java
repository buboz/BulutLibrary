package com.example.booklibrary.service;

import com.example.booklibrary.model.Book;

import java.util.List;

public interface BookService {

    public Book saveBook(Book book);

    public List<Book> getAllBooks();

    Book getBooksByGenre(String bookGenre);

    Book getBooksByAuthor(String bookAuthor);

    Book getBookByName(String bookName);


}
