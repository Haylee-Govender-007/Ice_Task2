/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice_task2;

/**
 *
 * @author emeris
 */
public class Ice_Task2 {

    public static void main(String[] args) {
        
       
        // Rows = agents
        double [][] sales ={ 
            { 800000.0, 1500000.0, 2000000.0} ,
            {700000.0, 1200000.0, 1600000.0}
        };
        
        // Estate agents
        String [] agents = {"Joe Bloggs" , "Jane Doe"} ;
        
        // Columns = January, February, March
        String[] months = {"JAN", "FEB", "MAR"};
        
          // Display heading
        System.out.println("ESTATE AGENTS SALES REPORT");
        
         // Display the months
        System.out.println("\t\t" + months[0] + "\t\t" + months[1] + "\t\t" + months[2]);
        
        System.out.println("--------------------------------------------------------------");

        // Display the sales
        for (int i = 0; i < agents.length; i++) {
            
            System.out.print(agents[i] + "\t");
            
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print("R" + sales[i][j] + "\t");
            }
            
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------");
        
        // Create an array to store the total sales
        double[] totalSales = new double[agents.length];
        
        // Calculate the total sales for each agent
        for (int i = 0; i < sales.length; i++) {
            
            for (int j = 0; j < sales[i].length; j++) {
                totalSales[i] = totalSales[i] + sales[i][j];
            }
        }
        
        // Display the total sales
        System.out.println("\nTOTAL PROPERTY SALES");
        
        for (int i = 0; i < agents.length; i++) {
            System.out.println(agents[i] + ": R" + totalSales[i]);
        }
    }
}
        
    

