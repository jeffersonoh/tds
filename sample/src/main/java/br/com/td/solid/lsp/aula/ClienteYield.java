package br.com.td.solid.lsp.aula;

import java.util.List;

public class ClienteYield {


    public void calculateYield() {
        List<Account> accountList = new AccountDAO().getAllAccounts();
        for (Account account : accountList) {
            if (account instanceof InvestimentAcount){
                BasicAccount basicAccount = (BasicAccount) account;
                basicAccount.yield();
            }

        }
    }
}
