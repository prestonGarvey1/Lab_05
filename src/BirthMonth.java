import java.util.Scanner;

public class BirthMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your birth month (1-12): ");

        try {
            int month = scanner.nextInt();

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("You entered an incorrect month value: You must enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
