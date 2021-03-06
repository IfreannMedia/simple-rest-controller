package com.ifreann.spring.rest.simplerestcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return List.of(new Book(1, "How to Lose Friends and Alienate People", "Dale Carnegie"));
    }
}
