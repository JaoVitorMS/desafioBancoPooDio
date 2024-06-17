package br.com.joaovitor.bank.interfaces;

public interface Transations {

    /*
    * @param value
    * @return void
     */
    private void deposit ( double value, int accountNumber ) {}
    private void withdraw ( double value, int accountNumber ) {}
    private void transfer ( double value, int accountNumber, int destinationAccount ) {}
}
