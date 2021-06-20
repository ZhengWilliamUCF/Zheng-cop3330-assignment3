package ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInput {
    // import file
    public File importFile(){
        return new File("src/main/java/ex45/exercise45_input.txt");
    }

    // create array list
    public ArrayList<String> createArrayList(){
        return new ArrayList<>();
    }

    // read file
    public void scanFile(File imported, ArrayList<String> statement) throws FileNotFoundException {
        Scanner in = new Scanner(imported);
        // Read each line in using scanner
        while (in.hasNextLine()){
            String line = in.nextLine();
            // call function addToArrayList
            addToArrayList(line, statement);
        }
        // close scanner
        in.close();
    }

    // add each line to arraylist of strings
    public void addToArrayList(String line, ArrayList<String> nameList){
        nameList.add(line);
    }

    // convert arraylist to arrayOfStrings to be searched
    public String[] convertArrayList(ArrayList<String> statement){
        // Creates array of strings
        String[] convertedList = new String[statement.size()];
        // converts ArrayList to Array of Strings
        return statement.toArray(convertedList);
    }

    // for each line search for "utilize"
    public void searchLine(String[] lines){
        for (int i = 0; i < lines.length; i++){
            if (lines[i].contains("utilize")){
                replaceWord(lines, i);
            }
        }
    }

    // function replace "utilize" with "use"
    public void replaceWord(String[] lines, int line){
        lines[line] = lines[line].replace("utilize", "use");
    }
}
