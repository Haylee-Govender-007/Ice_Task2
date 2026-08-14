/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice_task2_inheritance;

/**
 *
 * @author emeris
 */
public class ScentedCandle extends Candle{
    
 // Additional Field --> Scent
    private String scent;
    
    // Create constructor
    public ScentedCandle(String colour, int height, String scent) {
        super(colour, height);
        this.scent = scent;
    }
    
    // Getter and setter for the scent field

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
    
    // Override the setHeight method
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        
        // Change the price to R3.00 per inch
    }
    
    // Override the display method
    @Override
    public void display() {
       java.text.DecimalFormatSymbols symbols =
                new java.text.DecimalFormatSymbols(java.util.Locale.GERMANY);
        
        java.text.DecimalFormat df =
                new java.text.DecimalFormat("0.00", symbols);
        
        System.out.println("Colour: " + getColour());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Scent: " + scent);
        System.out.println("Price: R" + df.format(getPrice()));
    }
    
}
