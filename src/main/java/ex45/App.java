package ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        App myApp = new App();
        FileInput ad = new FileInput();
        FileOutput ac = new FileOutput();
        File imported = ad.importFile();
        ArrayList<String> statement = ad.createArrayList();
        ad.scanFile(imported, statement);
        String[] convertedList = ad.convertArrayList(statement);
        ad.searchLine(convertedList);
        String fileName = myApp.userInputFileName();
        String path = ac.getMainDirectory();
        String FilePath = ac.createOutputFile(path, fileName);
        ac.writeToFile(FilePath, convertedList);
    }
    // asks user for the name of file to be created
    public String userInputFileName(){
        System.out.print("Output File Name: ");
        return in.nextLine();
    }
}
