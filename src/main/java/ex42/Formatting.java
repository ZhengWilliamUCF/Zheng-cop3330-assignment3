package ex42;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Formatting {
    // scan file for names
    public void scanFile(File imported, ArrayList<String> infoList) throws FileNotFoundException {
        Scanner in = new Scanner(imported);
        // Read each line in using scanner
        while (in.hasNextLine()){
            String line = in.nextLine();
            // call function addToArrayList
            addToArrayList(line, infoList);
        }
        // close scanner
        in.close();
    }

    // creates arraylist
    public ArrayList<String> createArrayList(){
        return new ArrayList<>();
    }

    // add names to ArrayList
    public void addToArrayList(String name, ArrayList<String> nameList){
        nameList.add(name);
    }

    // convert ArrayList to String[] Array
    public String[] convertArrayList(ArrayList<String> infoList){
        // Creates array of strings
        String[] convertedList = new String[infoList.size()];
        // converts ArrayList to Array of Strings
        return infoList.toArray(convertedList);
    }

    public void formatList(String[] convertedList, String format, App myApp){
        // split names into separate strings like in ex40
        for (String output : convertedList) {
            String[] split = output.split("[, ]", 3);
            String lName = split[0];
            String fName = split[1];
            String salary = split[2];
            // calls function to print
            myApp.printDisplay(format, lName, fName, salary);
        }
    }
}