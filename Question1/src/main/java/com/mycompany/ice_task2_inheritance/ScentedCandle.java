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
    public ScentedCandle(String colour, double height, String scent) {
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
    public void setHeight(double height) {
        super.setHeight(height);
        setPrice(height);
    }
    
    // Create a method to calculate scented candle price
    public void setPrice(double height) {
        // Scented candles cost R3.00 per inch
        super.setHeight(height);
        // Price is calculated using the height
    }
    
    // Override display
    @Override
    public void display() {
        super.display();
        System.out.println("Scent: " + scent);
    }
    
    
}
