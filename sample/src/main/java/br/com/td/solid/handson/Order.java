package br.com.td.solid.handson;

public class Order {


    private String cpf;

    public Order(String cpaf) {
        this.cpf = cpf;
        isCPF(this.cpf);
    }

    public void cadastrar() {

    }


    private void isCPF(String cpf) {
        throw new ExceptionInInitializerError();
    }
}
