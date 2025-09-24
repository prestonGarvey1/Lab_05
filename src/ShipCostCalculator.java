import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ShipCostCalculator {
    public static void main(String[] args) {
        //Create scanner object
        Scanner scan = new Scanner(System.in);

        //Create values
        double itemPrice = 0;
        double taxRate = 0.02;
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
        } else {
            System.out.println("You have entered an incorrect value");
        }


        if (itemPrice > 100) {
            finalTax = itemPrice * taxRate;
            finalPrice = itemPrice + finalTax;
            System.out.println("Your Number is higher than 100, free shipping is not available.");
            System.out.println("Your purchase is $" + finalPrice + " with the added shipping fee.");
        } else {
            finalPrice = itemPrice;
            System.out.println("Your purchase has free shipping!");
            System.out.println("Your purchase is $" + finalPrice + " with free shipping.");
        }

    }
}