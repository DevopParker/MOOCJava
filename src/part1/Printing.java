package part1;

import static part1.ConsoleColors.*;
import static part1.FileStructureDisplay.*;

public class Printing {

    public static void boilerplate(String name) {
        System.out.println("\nThis is the boilerplate code needed to run a Java program:\n");
        System.out.println(CodeColorizer.generateClassDef(name, CodeColorizer.generateMainClass()));
    }

    public static void applicationTitle() {
        String appTitle = """
                %s======================
                =  %sJava MOOC Runner  %s=
                ======================%s
                """.formatted(BLUE, GREEN, BLUE, RESET);
        System.out.println(appTitle);
        System.out.println("Hello World, this is Part 1 of the MOOC fi Java course.\n");
    }

    public static void javaCapitalizationRules() {
        System.out.println("""
                \nJava Capitalization Rules:
                --------------------------
                Class:      PascalCase
                Interface:  PascalCase
                Method:     camelCase
                Variable:   camelCase
                Constant:   SCREAMING_SNAKE_CASE
                Package:    all lowercase with dots as separators (ex: java.util.*)
                Enums:      SCREAMING_CASE
                --------------------------
                """);
    }

    public static void SystemReader() {
        System.out.println("""
                // Making the scanner available in the program
                import java.util.Scanner;
                
                // Creating the scanner
                Scanner reader = new Scanner(System.in);
        
                // Examples of reading different types of user input
                String text = reader.nextLine();
                int number = Integer.valueOf(reader.nextLine());
                double numberWithDecimals = Double.valueOf(reader.nextLine());
                boolean trueOrFalse = Boolean.valueOf(reader.nextLine());
                """);
    }
}