package br.com.td.solid.lsp.aula;

public class SalaryAccount implements Account {

    private String category;

    SalaryAccount() {
        setCategory("Personal");
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
