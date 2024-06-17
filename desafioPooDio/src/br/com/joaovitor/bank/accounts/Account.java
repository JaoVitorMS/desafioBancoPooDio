package br.com.joaovitor.bank.accounts;

import br.com.joaovitor.bank.interfaces.Transations;

public abstract class Account implements Transations{
    private int accountNumber;
    private double accountBalance;
    private String holderName;
    public static String AGENCY_POUPANCE = "Poupance";
    public static String AGENCY_CURRENT = "Current";
    public int reciveId;

    public Account ( int accountNumber, double accountBalance, String holderName, int reciveId) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.holderName = holderName;
        this.reciveId = reciveId;
    }

    public int getReciveId () {
        return reciveId;
    }

    public void setReciveId ( int reciveId ) {
        this.reciveId = reciveId;
    }

    public static String getAgencyCurrent () {
        return AGENCY_CURRENT;
    }

    public static void setAgencyCurrent ( String agencyCurrent ) {
        AGENCY_CURRENT = agencyCurrent;
    }

    public static String getAgencyPoupance () {
        return AGENCY_POUPANCE;
    }

    public static void setAgencyPoupance ( String agencyPoupance ) {
        AGENCY_POUPANCE = agencyPoupance;
    }

    public String getHolderName () {
        return holderName;
    }

    public void setHolderName ( String holderName ) {
        this.holderName = holderName;
    }

    public double getAccountBalance () {
        return accountBalance;
    }

    public void setAccountBalance ( double accountBalance ) {
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber ( int accountNumber ) {
        this.accountNumber = accountNumber;
    }

    public void indentifyTransfer(int destinationAccount){
        this.reciveId = destinationAccount;
    }
    //implementing the methods from the interface
   public abstract void deposit ( double value, int accountNumber);
   public abstract void withdraw ( double value, int accountNumber);
   public abstract void transfer ( double value, int accountNumber, int destinationAccount);

}
