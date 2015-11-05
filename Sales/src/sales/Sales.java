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
        //System.out.println("Please enter the sales");
        SalesPerson person1 = new SalesPerson(); //Constructor of SalesPerson method named person using default constructor.
            //A constructor was used so that it would be easier to modify for the week 3 assignment to acount for additional outputs
        person1.calculateSales();
    }//Closes the main statement
    
   
}//Closes the Sales Class
