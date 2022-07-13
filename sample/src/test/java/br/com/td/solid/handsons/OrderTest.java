package br.com.td.solid.handsons;

import br.com.td.solid.handson.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderTest {


    @Test
    void deveBloquearUmcadastroComCPFInvalido() {
        Assertions.assertThrows(ExceptionInInitializerError.class, () -> new Order("111.111.111-11"));
    }


}
