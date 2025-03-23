package part1;

import static part1.ConsoleColors.*;

public class CodeColorizer {
    public static String generateClassDef(String className, String nextClass, String method) {
        String coloredClass = """
            %spublic class %s%s %s{
            %s%s}%s
            """.formatted(BLUE, RED, className, BRIGHT_WHITE, nextClass, BRIGHT_WHITE, RESET);
        return coloredClass;
    }

    // Overloaded versions of PUBLIC_CLASS
    public static String generateClassDef(String className) {
        return generateClassDef(className, "", "");
    }

    public static String generateClassDef(String className, String nextClass) {
        return generateClassDef(className, nextClass, "");
    }

    public static String generateMainClass() {
        String coloredMain = """
                \t%spublic static void %smain%s(String[] args) {
                \t\tSystem.out.println("Hello World!");
                \t}%s
                """.formatted(BLUE, RED, BRIGHT_WHITE, RESET);
        return coloredMain;
    }

    public static String generateMethod() { // Next method to create.
        return null;
    }
}

/*
Not finished, would like to create a class where it can continue to
create classes and have the correct colorization.

Used \t on the CLASS_MAIN method to fix the issue for the mean time,
\t\tSystem.out.println("Hello World!"); is also temporary inside the CLASS_MAIN.
 */