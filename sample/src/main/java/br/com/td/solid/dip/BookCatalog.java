package br.com.td.solid.dip;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookCatalog {

   private BookRepository bookRepository;

    BookCatalog(){
    }

    BookCatalog(BookRepository bookRepository){
      this.bookRepository = bookRepository;
    }

    public void listAllBooks() {
        List<String> allBookNames = bookRepository.getAllBookNames();
    }

}
