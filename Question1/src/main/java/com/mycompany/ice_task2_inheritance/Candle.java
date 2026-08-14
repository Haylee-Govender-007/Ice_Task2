/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice_task2_inheritance;

/**
 *
 * @author emeris
 */
public class Candle {
    
    // Data fields
    private String colour;
    private double height;
    private double price;

    // Constructor
    public Candle(String colour, double height) {
        this.colour = colour;
        setHeight(height);
    }
    
    

    // Getters and Setters
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.price = height * 2.00; 
    }

    public double getPrice() {
        return price;
    }

    // Create a display method
    public void display() {
        System.out.println("Colour: " + colour);
        System.out.println("Height: " + height + " inches");
        System.out.println("Price: R" + price);
    }
    
}
