package com.example.booklibrary.service;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBooksByGenre(String bookGenre) {
        return bookRepository.getBooksByGenre(bookGenre);
    }

    @Override
    public Book getBooksByAuthor(String bookAuthor) {
        return bookRepository.getBooksByAuthor(bookAuthor);
    }

    @Override
    public Book getBookByName(String bookName) {
        return bookRepository.getBookByName(bookName);
    }
}
