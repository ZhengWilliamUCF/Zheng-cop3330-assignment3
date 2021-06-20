package ex41;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws IOException {
        App myApp = new App();
        Names ad = new Names();
        File imported = myApp.importFile();
        ArrayList<String> nameList = ad.createArrayList();
        ad.scanFile(imported, nameList);
        String[] convertedList = ad.convertArrayList(nameList);
        ad.sortConvertedArrayList(convertedList);
        int nameNumber = ad.getListSize(convertedList);
        myApp.outputFile(convertedList, nameNumber);
    }

    // import file to be read
    public File importFile(){
        return new File("src/main/java/ex41/exercise41_input.txt");
    }

    // writes each index of arraylist to new file
    public void outputFile(String[] convertedList, int nameNumber) throws IOException {
        // Sets the output file
        FileWriter output = new FileWriter("src/main/java/ex41/exercise41_output.txt");
        // Print out num of names
        output.write("Total of " + nameNumber + "names\n-----------------");
        // Prints out each name in separate line
        for (String line : convertedList) {
            output.write("\n" + line);
        }
        // close file writer
        output.close();
    }
}
