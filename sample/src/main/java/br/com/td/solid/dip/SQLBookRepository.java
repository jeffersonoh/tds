package br.com.td.solid.dip;

import java.util.Arrays;
import java.util.List;

public class SQLBookRepository implements BookRepository {

    public List<String> getAllBookNames() {
        return Arrays.asList("Clean Architecture","Domain-Driven Design", "Working Effectively with Legacy Code");
    }

}
