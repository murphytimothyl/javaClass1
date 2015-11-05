/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

import java.util.Scanner;

/**
 * Week 3 Individual Sales project
 * @author Tim Murphy
 * program will calculate the total annual compensation of a salesperson at 10%
 * of their total sales. If they exceed the sales target the commission percentage
 * will increase by 1.25%
 * if they fail to meet the target a display will show them what they are missing out on
 */
 public class SalesPerson {
        private double fixedSalery = 30_000.00, commPercent = 0.08, salesTarget = 400_000.00, targetPercent = 0.80; // initializes the fixed salery and commission percentage. Marked as private to protect data
        private double totalAnnualSales, totalAnnualComp, commission; //creates fields that will be used for calculations
        private double targetGoal = salesTarget * targetPercent;//Calculates the target goal of 80% of the sales target
        
        Scanner input = new Scanner(System.in); //constructs new scanner object named input to capture the input of the user
        
        public  SalesPerson() {//Creation of sales person object
            //String personName = name;
            System.out.println("Please enter the salespersons annual sales" );//Prompts ser to enter the annual sales
          
            totalAnnualSales = input.nextDouble();//assigns the next double input by the user to the totalAnnualSales field
        }
            public void calculateSales() {
            
            if(totalAnnualSales >= targetGoal && totalAnnualSales <= salesTarget){
                commission = totalAnnualSales * commPercent;
                totalAnnualComp = fixedSalery + commission;
                System.out.printf("The total annual salery is: $%.2f", totalAnnualComp);//Prints out the annual salery formatted as a float with two decimal positions.
            } else if (totalAnnualSales < targetGoal) {
                for(double i = fixedSalery; i <= fixedSalery + (fixedSalery /2); i += 5000){
                    commission = i * commPercent;
                    totalAnnualComp = fixedSalery + commission;
                    System.out.printf("$%.2f\t$%.2f\n", i, totalAnnualComp);
                            //println(salesTarget + "\t" + totalAnnualComp);
                }//closes for loop
            } else {
                double accelCommission = commPercent * 1.25;//Calculates the updated commission if the sales person exceeds the sales target. It is not needed outside of this scope and will not be written to memory unless needed
                if(totalAnnualSales > salesTarget) {
                    commission = totalAnnualSales * accelCommission;
                    totalAnnualComp = fixedSalery + commission;
                    System.out.printf("The total annual salery is: $%.2f", totalAnnualComp);
                }//closes if statement
            }//closes else 
            
        }//Closes the sales person method
    }//Closes the SalesPerson class


