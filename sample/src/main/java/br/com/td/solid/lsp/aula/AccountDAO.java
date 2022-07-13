package br.com.td.solid.lsp.aula;

import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

    public List<Account> getAllAccounts() {
        List<Account> list = new ArrayList<>();
        list.add(new BasicAccount());
        list.add(new SalaryAccount());
        return list;
    }
}