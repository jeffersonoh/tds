package br.com.td.solid.lsp.aula;

public class BasicAccount implements Account,InvestimentAcount{

    private String category;

    public BasicAccount(){
        setCategory("Investiment");
    }

    protected double balance = 0;

    public void yield() {
        this.balance += (this.balance * 0.15);
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
