package part1;

import static part1.ConsoleColors.*;
import java.util.List;

public class FileStructureDisplay {

    // Main method to display the entire file structure
    public static void displayFileStructure() {
        System.out.println(BLUE + "Project File Structure:" + RESET);
        System.out.println(buildFileStructure());
    }

    // Builds the complete file structure string
    private static String buildFileStructure() {
        StringBuilder sb = new StringBuilder();

        // Root directory
        sb.append("src/\n");

        // Application package
        sb.append("├── application/\n");
        sb.append("│   └── " + GREEN + "MOOCRunner.java" + RESET + "  (contains the single main method)\n");

        // Part1 package
        sb.append("├── part1/\n");
        addFilesToPackage(sb, "part1", new String[]{
                "Printing.java",
                "CodeColorizer.java",
                "ConsoleColors.java",
                "Conditionals.java",
                "Loops.java"
        });

        // Part2 package
        sb.append("├── part2/\n");
        addFilesToPackage(sb, "part2", new String[]{
                "Methods.java",
                "Patterns.java",
                "AdvancedLoops.java",
                "Debugging.java"
        });

        // Part3 package (final folder uses └── instead of ├──)
        sb.append("└── part3/\n");
        addFilesToPackage(sb, "part3", new String[]{
                "Lists.java",
                "Arrays.java",
                "Strings.java"
        });

        return sb.toString();
    }

    // Helper method to add files to a package with proper formatting
    private static void addFilesToPackage(StringBuilder sb, String packageName, String[] files) {
        for (int i = 0; i < files.length; i++) {
            boolean isLast = (i == files.length - 1);
            String prefix = isLast ? "│   └── " : "│   ├── ";
            sb.append(prefix + YELLOW + files[i] + RESET + "\n");
        }
    }

    // Overloaded method that can take a custom color for files
    private static void addFilesToPackage(StringBuilder sb, String packageName, String[] files, String fileColor) {
        for (int i = 0; i < files.length; i++) {
            boolean isLast = (i == files.length - 1);
            String prefix = isLast ? "│   └── " : "│   ├── ";
            sb.append(prefix + fileColor + files[i] + RESET + "\n");
        }
    }

    public static void printTable(List<String[]> rows) {
        if (rows.isEmpty()) return;

        int columns = rows.getFirst().length;
        int[] maxWidths = new int[columns];

        // Find the max width of each column
        for (String[] row : rows) {
            for (int i = 0; i < columns; i++) {
                if (row[i] != null && row[i].length() > maxWidths[i]) {
                    maxWidths[i] = row[i].length();
                }
            }
        }

        // Print each row with dynamic formatting
        for (String[] row : rows) {
            for (int i = 0; i < columns; i++) {
                int width = maxWidths[i] + 4; // +2 Add padding
                System.out.printf("%-" + width + "s", row[i]);
            }
            System.out.println();
        }
    }
}