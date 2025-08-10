package com.library.domain;

import com.library.domain.enums.ReadingStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;

public class BookTest {
    private Book validBook;

    @BeforeEach
    void setUp(){
        validBook = new Book("Clean code", "Robert C. Martin", "978-0-13-235088-4");
    }

    @Test
    void shouldCreateValidBook(){
        assert(validBook.getTitle()).equals("Clean Code");
    }




}
