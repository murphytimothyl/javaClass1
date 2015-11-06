package sales;
import java.util.Scanner;
/**
 * Week 2 Individual Sales project
 * @author Tim Murphy
 * program will calculate the total annual compensation of a salesperson at 10%
 * of their total sales
 */
public class Sales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalesPerson person1 = new SalesPerson(); //Constructor of SalesPerson method named person using default constructor.
            //A constructor was used so that it would be easier to modify for the week 3 assignment to acount for additional outputs
    }//Closes the main statement
    
    public static class SalesPerson {
        private double fixedSalery = 30_000.00, commPercent = 0.08; // initializes the fixed sallery and commission percentage. Marked as private to protect data
        private double totalAnnualSales, totalAnnualComp, commission; //creates fields that will be used for calculations
        Scanner input = new Scanner(System.in); //constructs new scanner object named input to capture the input of the user
        public  SalesPerson() {//Creation of sales person object
            System.out.println("Please enter the salespersons annual sales: ");//Prompts ser to enter the annual sales
            totalAnnualSales = input.nextDouble();//assigns the next double input by the user to the totalAnnualSales field
            commission = totalAnnualSales * commPercent;//calculatees the ammount of the commsion based on the annual sales input by the user multipled times the commision percentage
            totalAnnualComp = fixedSalery + commission;//Adds the commission to the fixed salery
            System.out.printf("The total annual salery is: $%.2f", totalAnnualComp);//Prints out the annual salery formatted as a float with two decimal positions.
        }//Closes the sales person method
    }//Closes the SalesPerson class
}//Closes the Sales Class
