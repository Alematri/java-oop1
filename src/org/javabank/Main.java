package org.javabank;

public class Main {
    public static void main(String[] args) {
        // Creazione di due prodotti
        Product product1 = new Product("Prodotto 1", "Descrizione del prodotto 1", 100.50, 0.22);
        Product product2 = new Product("Prodotto 2", "Descrizione del prodotto 2", 117.33, 0.04);

        // Test dei metodi della classe Product
        System.out.println("Prodotto n°1:");
        System.out.println("Codice prodotto: " + product1.getExtendedName());
        System.out.println("Prezzo senza IVA: " + product1.getBasePrice());
        System.out.println("Prezzo con IVA: " + product1.getPriceWithVat());

        System.out.println("\nProdotto n°2:");
        System.out.println("Codice prodotto: " + product2.getExtendedName());
        System.out.println("Prezzo senza IVA: " + product2.getBasePrice());
        System.out.println("Prezzo con IVA: " + product2.getPriceWithVat());
    }
}