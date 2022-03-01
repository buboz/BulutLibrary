package com.example.booklibrary.controller;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public String add(@RequestBody Book book){
        bookService.saveBook(book);
        return "New Book added";
    }

    @GetMapping("/books/all")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/genre/{genre}")
    public Book getBooksByGenre(@PathVariable("genre") String bookGenre){
        return bookService.getBooksByGenre(bookGenre);
    }

    @GetMapping("/books/author/{author}")
    public Book getBooksByAuthor(@PathVariable("author") String bookAuthor){
        return bookService.getBooksByAuthor(bookAuthor);
    }

    @GetMapping("/books/name/{name}")
    public Book getBookByName(@PathVariable("name") String bookName){
        return bookService.getBookByName(bookName);
    }

}
