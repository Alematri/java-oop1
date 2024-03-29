package org.ex2;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto nella nostra banca!");
        System.out.print("Inserisci il tuo nome: ");
        String userName = scanner.nextLine();

        Account account = new Account(userName);

        boolean continueFlag = true;
        while (continueFlag) {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Versare una somma");
            System.out.println("2. Prelevare una somma");
            System.out.println("3. Informazioni sul conto");
            System.out.println("4. Uscire");

            System.out.print("Scelta: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Inserisci la somma da versare: ");
                    double depositedAmount = scanner.nextDouble();
                    account.deposit(depositedAmount);
                    break;
                case 2:
                    System.out.print("Inserisci la somma da prelevare: ");
                    double withdrawnAmount = scanner.nextDouble();
                    boolean withdrawalResult = account.withdraw(withdrawnAmount);
                    account.printWithdrawMessage(withdrawalResult, withdrawnAmount);
                    break;
                case 3:
                    account.info();
                    break;
                case 4:
                    System.out.println("Grazie per aver usato i nostri servizi.");
                    continueFlag = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
    }
}