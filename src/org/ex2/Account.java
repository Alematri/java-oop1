package org.ex2;

import java.util.Random;

class Account {
    private int accountNumber;
    private String ownerName;
    private double balance;

    // Costruttore
    public Account(String ownerName) {
        this.accountNumber = generateAccountNumber();
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    // Metodo 1 Genarare n° Conto random
    private int generateAccountNumber() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }

    // Metodo 2 Versamento
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Versamento effettuato. Il saldo attuale è: " + balance);
    }

    // Metodo 3 Prelievo
    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) { // Controllo che ci siano fondi sufficienti
            balance -= amount;
            System.out.println("Prelievo effettuato. Il saldo attuale è: " + balance);
        } else if (amount <= 0) {
            System.out.println("Inserire un importo valido."); // Controllo che l'importo selezionato sia positivospi
        } else {
            System.out.println("Saldo insufficiente.");
        }
    }

    // Metodo 4 Ottenere info
    public void info() {
        System.out.println("Nome intestatario: " + ownerName);
        System.out.println("Numero Conto: " + accountNumber);
        System.out.println("Saldo: " + balance);
    }

    // Metodo 5 Ottenere Saldo
    public double getBalance() {
        return balance;
    }
}