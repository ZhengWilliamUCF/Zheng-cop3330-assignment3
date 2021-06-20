package ex41;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Names {
    // scan file for names
    public void scanFile(File imported, ArrayList<String> nameList) throws FileNotFoundException {
        Scanner in = new Scanner(imported);
        // Read each line in using scanner
        while (in.hasNextLine()){
            String line = in.nextLine();
            // call function addToArrayList
            addToArrayList(line, nameList);
        }
        // close scanner
        in.close();
    }

    public ArrayList<String> createArrayList(){
        return new ArrayList<>();
    }

    // add names to ArrayList
    public void addToArrayList(String name, ArrayList<String> nameList){
        nameList.add(name);
    }

    // convert ArrayList to String[] Array
    public String[] convertArrayList(ArrayList<String> nameList){
        // Creates array of strings
        String[] convertedList = new String[nameList.size()];
        // converts ArrayList to Array of Strings
        return nameList.toArray(convertedList);
    }

    // sort String[] by first names
    public void sortConvertedArrayList(String[] convertedList){
        Arrays.sort(convertedList);
    }

    public int getListSize(String[] convertedList){
        return convertedList.length;
    }
}
