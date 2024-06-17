package br.com.joaovitor.bank;


import br.com.joaovitor.bank.accounts.AccountManagement;
import br.com.joaovitor.bank.accounts.CurrentAccount;
import br.com.joaovitor.bank.accounts.PoupanceAccount;

public class BancoApp {
    public static void main ( String[] args ) {

        AccountManagement accountManagement = new AccountManagement();


        CurrentAccount conta1 = new CurrentAccount(123, 100, "João Vitor", 222, accountManagement);
        accountManagement.addAccount(conta1);
        CurrentAccount conta2 = new CurrentAccount(456, 1000, "Maria", 333, accountManagement);
        accountManagement.addAccount(conta2);
        PoupanceAccount conta3 = new PoupanceAccount(150, 200000, "Guido", 444, accountManagement);
        accountManagement.addAccount(conta3);
        PoupanceAccount conta4 = new PoupanceAccount(113, 30000, "Pou Barney", 555, accountManagement);
        accountManagement.addAccount(conta4);

        System.out.println("------------");
        System.out.println(conta1.getAccountBalance());
        System.out.println(conta2.getAccountBalance());
        System.out.println(conta3.getAccountBalance());
        System.out.println(conta4.getAccountBalance());
        System.out.println("------------");
        conta2.transfer(500, 456, 222);
        System.out.println("------------");
        System.out.println(conta1.getAccountBalance());
        System.out.println(conta2.getAccountBalance());
        System.out.println(conta3.getAccountBalance());
        System.out.println(conta4.getAccountBalance());
        System.out.println("------------");
        conta3.transfer(50000, 150, 222);
        System.out.println("------------");
        System.out.println(conta1.getAccountBalance());
        System.out.println(conta3.getAccountBalance());

        System.out.println("------------");
    }
}