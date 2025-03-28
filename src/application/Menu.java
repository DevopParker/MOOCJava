package application;

import java.sql.SQLOutput;
import java.util.Scanner;
import part1.*;
import static part1.ConsoleColors.*;

public class Menu {
    public static void runMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            clearConsole();
            displayMenuOptions();
            int choice = getUserChoice(scanner);
            running = processMenuChoice(choice, scanner);
        }

        scanner.close();
    }

    public static void displayMenuOptions() {
        System.out.println("""
                1. Display Java boilerplate
                2. Display File Structure
                3. Display Java Capitalization rules
                4. Display System Reader
                5. Display Number types
                6. Display Bash Script
                0. Exit
                """);
        System.out.print("Enter your choice: ");
    }

    public static int getUserChoice(Scanner scanner) {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static boolean processMenuChoice(int choice, Scanner scanner) {
        clearConsole();
        switch (choice) {
            case 0:
                System.out.println("Exiting program. Goodbye!");
                break;
            case 1:
                Printing.boilerplate("Example"); // Change Example to users choice
                break;
            case 2:
                FileStructureDisplay.displayFileStructure();
                break;
            case 3:
                Printing.javaCapitalizationRules();
                break;
            case 4:
                Printing.scannerValueOf();
                break;
            case 5:
                Printing.numTypes();
                break;
            case 6:
                Printing.bashScript();
                break;
            default:
                System.out.printf("\n%sInvalid choice. Please try again.%s%n\n", RED, RESET);
        }

        if (choice != 0) {
            System.out.print("Press enter to continue...");
            scanner.nextLine();
        } else {
            return false;
        }
        return true;
    }

    public static void clearConsole() {
//        for (int i = 0; i < 50; i++) {
//            System.out.println();
//        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}