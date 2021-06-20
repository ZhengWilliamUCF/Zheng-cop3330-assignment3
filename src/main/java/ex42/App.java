package ex42;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        App myApp = new App();
        Formatting ad = new Formatting();
        File imported = myApp.importFile();
        ArrayList<String> infoList = ad.createArrayList();
        ad.scanFile(imported, infoList);
        String[] convertedList = ad.convertArrayList(infoList);
        String format = myApp.createFormat();
        myApp.displayOutput(ad, convertedList, format, myApp);
    }

    // import file to be read
    public File importFile(){
        return new File("src/main/java/ex42/exercise42_input.txt");
    }

    // creates format for printing out information
    public String createFormat(){
        return "%-9s %-9s %-9s%n";
    }

    public void displayOutput(Formatting ad,String[] convertedList, String format, App myApp){
        System.out.printf(format, "Last", "First", "Salary");
        System.out.print("--------------------------\n");
        ad.formatList(convertedList, format, myApp);
    }
    public void printDisplay(String format, String lName, String fName, String salary){
        System.out.printf(format, lName, fName, salary);
    }
}
