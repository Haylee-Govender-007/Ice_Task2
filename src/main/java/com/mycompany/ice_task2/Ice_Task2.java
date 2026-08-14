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
        System.out.printf("%-20s %15s %15s %15s%n",
                "", months[0], months[1], months[2]);

        System.out.println("--------------------------------------------------------------");

        // Display sales for each agent
        for (int i = 0; i < agents.length; i++) {

            System.out.printf("%-20s", agents[i]);

            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf(" R %12.2f", sales[i][j]);
            }

       
    }
}
        
    

