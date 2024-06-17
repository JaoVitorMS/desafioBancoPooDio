package br.com.joaovitor.bank.accounts;

import java.sql.SQLOutput;

public class PoupanceAccount extends Account {

    public PoupanceAccount ( int accountNumber, double accountBalance, String holderName, int reciveId, AccountManagement accountManagement ) {
        super(accountNumber, accountBalance, holderName, reciveId);
        this.accountManagement = accountManagement;
    }

    @Override
    public void deposit ( double value, int accountNumber ) {
        if (this.getHolderName() == null) {
            System.out.println("Essa conta não existe!");
        } else {
            this.setAccountBalance(getAccountBalance() + value);
            System.out.println("Deposito realizado!");
        }
    }

    @Override
    public void withdraw ( double value, int accountNumber ) {
        if (getHolderName() == null || value > this.getAccountBalance()) {
            System.out.println("Saque não realizado!");
            System.out.println("Conta inexistente ou saldo insuficiente!");
        } else {
            this.setAccountBalance(this.getAccountBalance() - value);
            System.out.println("Saque realizado!");
        }
    }

    AccountManagement accountManagement = new AccountManagement();
    Account destinationAccount = accountManagement.getAccountByReciveId(reciveId);


    @Override
    public void transfer ( double value, int accountNumber, int reciveId ) {
        double transation = 0;
        this.setAccountBalance(this.getAccountBalance() - value);
        transation += value;
        destinationAccount = accountManagement.getAccountByReciveId(reciveId);
        if (destinationAccount != null){
            destinationAccount.setAccountBalance(destinationAccount.getAccountBalance() + transation);
        }
    }
}