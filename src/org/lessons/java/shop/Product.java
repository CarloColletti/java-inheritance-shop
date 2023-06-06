package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Product {


    //field
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    //constructor
    public Product(){
        code = generateCode();
    }


    public Product(String name, String description, BigDecimal price, BigDecimal iva) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
        code = generateCode();
    }

    //getters
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getIva() {
        return iva;
    }

    //setters


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    //methods

    public BigDecimal getFullPrise(){
        BigDecimal ivaOnPrice = price.multiply(iva);
        return price.add(ivaOnPrice);
    }

    public String getFullName(){
        return code + "-" + name;
    }
    private int generateCode(){
        Random rand = new Random();
        return rand.nextInt( 1000 );
    }
}
