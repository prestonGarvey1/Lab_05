import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.println("Enter your choice (D, R, or I): ");

        String affiliation = scanner.next().toUpperCase();

        if(affiliation.equals("D")) {
            System.out.println("You are a Donkey.");
        }
        else if (affiliation.equals("R")) {
            System.out.println("You are a Elephant.");
        }
        else if (affiliation.equals("I")) {
            System.out.println("You Are a Independant.");
        }
        else {
            System.out.println("You entered an incorrect value. Please choose D, R, or I.");
        }

    }
}