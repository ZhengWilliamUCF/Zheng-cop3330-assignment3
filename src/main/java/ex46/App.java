package ex46;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class App {
    //static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        App myApp = new App();
        LinkedOperations ad = new LinkedOperations();
        File importedFile = myApp.importFile();
        LinkedHashMap<String, String> AnimalList = new LinkedHashMap<>();
        LinkedHashMap<String, String> OrderedAnimalList = new LinkedHashMap<>();
        myApp.readFile(importedFile, AnimalList, ad);
        ad.loopSortingUntilEmpty(AnimalList, OrderedAnimalList);
        String format = myApp.createFormat();
        myApp.printOutput(OrderedAnimalList, format);
    }

    // import file
    public File importFile(){
        return new File("src/main/java/ex46/exercise46_input.txt");
    }

    // read word separately
    public void readFile(File imported, LinkedHashMap<String, String> AnimalList, LinkedOperations ad) throws FileNotFoundException {
        Scanner in = new Scanner(new File(String.valueOf(imported)));

        while (in.hasNext()) {
            String word = in.next();
            ad.checkHashMap(word, AnimalList);
        }
    }

    // creates format for printing out information
    public String createFormat(){
        return "%-9s%-2s%-9s%n";
    }

    // prints out keys in format
    public void printOutput(LinkedHashMap<String, String> OrderedAnimalList, String format){
        Set<String> Animals = OrderedAnimalList.keySet();

        for (String key : Animals) {
            System.out.printf(format, key, ":", OrderedAnimalList.get(key), "\n");
        }
    }
}
