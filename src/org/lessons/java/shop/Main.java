package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Product p = new Product();

        // raccolta dati
        System.out.println("Nome: ");
        String name = scan.nextLine();
        System.out.println("Descrizione: ");
        String description = scan.nextLine();
        System.out.println("Prezzo: ");
        String priceString = scan.nextLine();  // farlo da
        BigDecimal price = new BigDecimal(priceString); // non compresso
        System.out.println("Iva: ");
        BigDecimal iva = new BigDecimal(scan.nextLine()); //compresso

        // assegnazione dei dati
        p.setName(name);
        p.setDescription(description);
        p.setPrice(price);
        p.setIva(iva);


        // show
        System.out.println("Nome prodotto: " + p.getFullName());
        System.out.println("Descrizione: " + p.getDescription());
        System.out.println("Prezzo: " + p.getFullPrise());
        System.out.println("Iva: " + p.getIva());

        scan.close();
    }
}
