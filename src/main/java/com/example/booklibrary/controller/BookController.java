package com.example.booklibrary.controller;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
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

    @GetMapping("/books/bookGenre/{bookGenre}")
    public Book getBooksByGenre(@PathVariable("bookGenre") String bookGenre){
        return bookService.getBooksByGenre(bookGenre);
    }

    @GetMapping("/books/bookAuthor/{bookAuthor}")
    public Book getBooksByAuthor(@PathVariable("bookAuthor") String bookAuthor){
        return bookService.getBooksByAuthor(bookAuthor);
    }

    @GetMapping("/books/bookName/{bookName}")
    public Book getBookByName(@PathVariable("bookName") String bookName){
        return bookService.getBookByName(bookName);
    }

}
