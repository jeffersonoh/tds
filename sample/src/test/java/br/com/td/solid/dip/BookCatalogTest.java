package br.com.td.solid.dip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookCatalogTest {

    @Test
    void listAllBooks() {

        BookCatalog bookCatalog = new BookCatalog( new SQLBookRepository());

        listAllBooks();


    }
}