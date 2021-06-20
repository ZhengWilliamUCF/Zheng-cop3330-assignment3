package ex44;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 William Zheng
 */

import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        App myApp = new App();
        CheckProduct ad = new CheckProduct();
        FormatJSON ac = new FormatJSON();
        String file = myApp.importInitialFilePath();
        String JSONText = ac.parseJSONToArray(file);
        String[] productArrayInitial = ac.createProductArray();
        String fixed = ac.formatJSONInput(JSONText);
        String[] productArrayFormatted = ac.SplitJSONInput(fixed, productArrayInitial);
        ad.productExists(productArrayFormatted, myApp);
    }

    public String importInitialFilePath(){
        return "src/main/java/ex44/exercise44_input.json";
    }

    // user inputs product name
    public String userInputProductName(){
        System.out.println("What is the product name? ");
        String name = in.nextLine();
        while (name.matches(".*\\d.*")) {
            System.out.println("That is not a valid input.");
            name = in.nextLine();
        }
        return name;
    }

    // prints not found
    public void printNotFound(){
        System.out.println("Sorry, that product was not found in our inventory.");
    }
}
