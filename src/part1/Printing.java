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

    public static void scannerValueOf() {
        System.out.println("""
                // Making the scanner available in the program
                import java.util.Scanner;
                
                // Creating the scanner
                Scanner reader = new Scanner(System.in);
        
                // Examples of reading different types of user input
                String text = reader.nextLine();
                int number = Integer.valueOf(reader.nextLine());
                double numberWithDecimals = Double.valueOf(reader.nextLine()); also called "Floating-point numbers"
                boolean trueOrFalse = Boolean.valueOf(reader.nextLine());
                """);
    }

    public static void numTypes() {
        System.out.println("""
                Prime number: a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1. (eg. 2, 3, 5, 7, 11)
                Odd number: a whole number that cannot be evenly divided by 2, leaving a remainder of 1.
                Even number: a whole number that is divisible by 2 without leaving a remainder.
                Rational number: any number that can be expressed as a fraction (or ratio) of two integers, where the denominator is not zero.
                                 In other words, it is a number that can be written in the form of a/b, where a and b are integers and b is not
                                 equal to zero. Rational numbers can also be expressed as terminating or repeating decimals
                Irrational number: a real number that cannot be expressed as a simple fraction (a ratio of two integers) and its decimal representation is
                                  non-terminating and non-repeating (eg. √2, π, and e, Numbers resulting from division by zero)
                                  You can identify an irrational number by recognizing that it cannot be expressed as a fraction (p/q)
                                  with integers p and q, and its decimal representation is non-repeating and non-terminating
                """);
    }
}