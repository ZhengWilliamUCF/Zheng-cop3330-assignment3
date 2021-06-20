package ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {

    // gets main directory
    public String getMainDirectory(){
        return "src/main/java/ex45/";
    }

    // creates the file in folder
    public String createOutputFile(String mainPath, String filename) {
        File created = new File(mainPath + filename + ".txt");
        return created.getPath();
    }

    // writes modified arraylist to newly created file
    public void writeToFile(String FilePath, String[] convertedList) throws IOException {
        FileWriter file = new FileWriter(FilePath);
        for (String s : convertedList) {
            file.write(s + "\n");
        }
        file.close();
    }
}
