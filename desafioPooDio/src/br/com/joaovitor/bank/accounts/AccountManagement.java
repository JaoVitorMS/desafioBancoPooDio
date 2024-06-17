package br.com.joaovitor.bank.accounts;

import java.util.HashMap;
import java.util.Map;

public class AccountManagement {
    private Map<Integer, Account> accounts = new HashMap<>();

    public void addAccount( Account account ) {
        accounts.put(account.getReciveId(), account);
    }
    public Account getAccountByReciveId( int reciveId ) {
        return accounts.get(reciveId);
    }
}
