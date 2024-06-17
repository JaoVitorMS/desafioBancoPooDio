package br.com.joaovitor.bank.accounts;

import java.util.Map;
import java.util.HashMap;

public class CurrentAccount extends Account {
    public CurrentAccount ( int accountNumber, double accountBalance, String holderName, int reciveId, AccountManagement accountManagement ) {
        super(accountNumber, accountBalance, holderName, reciveId);
        this.accountManagement = accountManagement;
    }

    @Override
    public void deposit ( double value, int accountNumber ) {
        this.setAccountBalance(this.getAccountBalance() + value);
        if (this.getHolderName() == null) {
            System.out.println("Conta não encontrada");
        } else {
            System.out.println("Depósito realizado com sucesso");
        }
    }

    @Override
    public void withdraw ( double value, int accountNumber ) {
        this.setAccountBalance(this.getAccountBalance() - value);
        if (this.getHolderName() == null || this.getAccountBalance() <= 0) {
            System.out.println("Conta não encontrada ou saldo insuficiente");
        } else {
            System.out.println("Saque realizado com sucesso");
        }
    }

    AccountManagement accountManagement = new AccountManagement();
    Account destinationAccount = accountManagement.getAccountByReciveId(reciveId);

    @Override
public void transfer ( double value, int accountNumber, int reciveId) {
    double transation = 0;
    this.setAccountBalance(this.getAccountBalance() - value);
    transation += value;
    destinationAccount = accountManagement.getAccountByReciveId(reciveId);
    if (destinationAccount != null){
        destinationAccount.setAccountBalance(destinationAccount.getAccountBalance() + transation);
    }
}
}



