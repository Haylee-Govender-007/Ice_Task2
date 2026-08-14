/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice_task2_inheritance;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class DemoCandles {

    public static void main(String[] args) {
        
// Create Scanner object
        Scanner kb = new Scanner(System.in);
        
        // Create variables for the regular candle
        String colour;
        int height;
        
        // Create a Candle object
        System.out.println("**************REGULAR CANDLE**************");
        
        System.out.print("Enter candle colour: ");
        colour = kb.nextLine();
        
        System.out.print("Enter candle height in inches: ");
        height = kb.nextInt();
        
        Candle candle = new Candle(colour, height);
        
        // Clear keyboard buffer
        kb.nextLine();
        
        // Create variables for the scented candle
        String scentedColour;
        int scentedHeight;
        String scent;
        
        // Create a ScentedCandle object
        System.out.println("\n**************SCENTED CANDLE**************");
        
        System.out.print("Enter candle colour: ");
        scentedColour = kb.nextLine();
        
        System.out.print("Enter candle height in inches: ");
        scentedHeight = kb.nextInt();
        
        // Clear keyboard buffer
        kb.nextLine();
        
        // Display available scents
        System.out.println("\nAvailable scents:");
        System.out.println("1. Gardenia");
        System.out.println("2. Vanilla");
        System.out.println("3. Lavender");
        System.out.println("4. Cinnamon");
        
        System.out.print("Enter the scent: ");
        int scentChoice = kb.nextInt();
        
        // Select the scent
        switch (scentChoice) {
            case 1:
                scent = "Gardenia";
                break;
                
            case 2:
                scent = "Vanilla";
                break;
                
            case 3:
                scent = "Lavender";
                break;
                
            case 4:
                scent = "Cinnamon";
                break;
                
            default:
                scent = "Gardenia";
                break;
        }
        
        // Create ScentedCandle object
        ScentedCandle scentedCandle =
                new ScentedCandle(scentedColour, scentedHeight, scent);
        
        // Display candle details
        System.out.println("\n**************CANDLE DETAILS**************");
        
        System.out.println("\n**************Regular Candle**************");
        candle.display();
        
        System.out.println("\n**************Scented Candle**************");
        scentedCandle.display();
    }
}
