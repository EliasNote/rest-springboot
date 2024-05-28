package com.esand.restspringboot.services;

import com.esand.restspringboot.exceptions.NotFoundException;
import com.esand.restspringboot.model.Book;
import com.esand.restspringboot.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Transactional(readOnly = true)
    public Book findById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Nada achado"));
    }

    @Transactional(readOnly = true)
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    public Book update(Long id, Book book) {
        Book result = findById(id);
        result = book;
        result.setId(id);
        return bookRepository.save(result);
    }
}
