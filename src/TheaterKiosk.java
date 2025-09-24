import java.util.Scanner;

public class TheaterKiosk {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your age: ");

        try{
            int age = scan.nextInt();

            if (age >= 21) {
                System.out.println("You get a wristband.");
            }
            //Let the program do nothing and have the IDE handle the error
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer for your age.");
        }
        finally {
            scan.close();
        }
    }
}
