import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ShipCostCalculator {
    public static void main(String[] args) {
        //Create scanner object
        Scanner scan = new Scanner(System.in);

        //Create values
        double itemPrice;
        double taxRate;
        double finalTax;
        double finalPrice;

        while (true) {
            System.out.println("Please enter the price of your item.");
            if (scan.hasNextDouble()) {
                itemPrice = scan.nextDouble();

            // Check if the value is under 1.
                if (itemPrice > 1) {
                    System.out.println("test");
                }
                else {
                 System.out.println("You have entered an incorrect number");
                }
            }
            else{
                System.out.println("You have entered an incorrect value");
            }
            if(itemPrice > 100){

        }
    }
}