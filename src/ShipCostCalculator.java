import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ShipCostCalculator {
    public static void main(String[] args) {
        //Create scanner object
        Scanner scan = new Scanner(System.in);

        //Create values
        double itemPrice = 0;
        double taxRate;
        double finalTax;
        double finalPrice;

        if (scan.hasNextDouble()) {
            itemPrice = scan.nextDouble();

            // Check if the value is under 1.
            if (itemPrice > 1) {
                System.out.println("test");
            } else {
                System.out.println("You have entered an incorrect number");
            }
        }
        else{
            System.out.println("You have entered an incorrect value");
        }
        if(itemPrice > 100){
        System.out.println("Your Number is higher than 100, free shipping is not available.");

        }

    }
}
