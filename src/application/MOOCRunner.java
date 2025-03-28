package application;

import part1.*;

public class MOOCRunner {
    public static void main(String[] args) {
        //Printing.applicationTitle();
        //Printing.boilerplate("Example");
        //Printing.fileStructure();
        //Printing.javaCapitalization();
//        Printing.applicationTitle();
//        Menu.runMenu();
        try {
            RestAPI api = new RestAPI();
            String response = api.createUser("John Doe", "leader");

            System.out.println("API Response:");
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}