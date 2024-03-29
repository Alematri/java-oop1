package org.javabank;

import java.util.Random;
public class Product {
    private int code; // Codice
    private String name; // Nome
    private String description; // Descrizione
    private double price; // Prezzo
    private double vat; // IVA

    // Costruttore
    public Product(String name, String description, double price, double vat) {
        this.code = generateCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    // Metodo per generare un codice random
    private int generateCode() {
        Random random = new Random();
        return random.nextInt(100000000); // 8 cifre massime
    }

    // Metodo per ottenere il prezzo senza IVA
    public double getBasePrice() {
        return price;
    }

    // Metodo per ottenere il prezzo con IVA
    public double getPriceWithVat() {
        return price * (1 + vat);
    }

    // Metodo per avere il nome esteso, ottenuto concatenando codice-nome: se il codice è inferiore a 8 cifre fa inserito un pad left di 0.
    public String getExtendedName() {
        String codePadded = String.format("%08d", code);
        return codePadded + "-" + name;
    }
}
