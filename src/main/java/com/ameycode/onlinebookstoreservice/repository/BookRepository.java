package com.ameycode.onlinebookstoreservice.repository;

import com.ameycode.onlinebookstoreservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    Book findByIsbn(String isbn);

}
