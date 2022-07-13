package br.com.td.solid.lsp;

import br.com.td.solid.lsp.aula.ClienteYield;
import org.junit.jupiter.api.Test;

class ClienteYieldTest {

    @Test
    void calculateYield() {
     ClienteYield client = new ClienteYield();
     client.calculateYield();
    }
}