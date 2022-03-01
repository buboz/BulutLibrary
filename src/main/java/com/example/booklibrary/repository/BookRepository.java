package com.example.booklibrary.repository;

import com.example.booklibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    public Book getBooksByGenre(String bookGenre);

    public Book getBooksByAuthor(String bookAuthor);

    public Book getBookByName(String bookName);

}
