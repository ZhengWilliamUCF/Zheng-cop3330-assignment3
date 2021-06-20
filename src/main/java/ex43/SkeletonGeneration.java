package ex43;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SkeletonGeneration {
    // checks if should create JS folder based on input
    public void createFolderJSYes(String userInputJS, String siteName, String mainPath) throws IOException {
        if (checkYes(userInputJS)){
            createJSFolder(mainPath);
        }
    }

    // checks if should create CSS folder based on input
    public void createFolderCSSYes(String userInputCSS, String siteName, String mainPath) throws IOException {
        if (checkYes(userInputCSS)){
            createCSSFolder(mainPath);
        }
    }

    // creates JS folder
    public void createJSFolder(String mainPath) throws IOException {
        String directoryPath = directoryPathJS(mainPath);
        printOutput(directoryPath+"/");
        Files.createDirectories(Paths.get(directoryPath));
    }

    // creates CSS folder
    public void createCSSFolder(String mainPath) throws IOException {
        String directoryPath = directoryPathCSS(mainPath);
        printOutput(directoryPath+"/");
        Files.createDirectories(Paths.get(directoryPath));
    }

    // checks if userInput is "yes" or "y"
    public boolean checkYes(String userInput){
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    // concatenates Strings for JS directory
    public String directoryPathJS(String mainPath){
        return (mainPath + "/js");
    }

    // concatenates Strings for CSS directory
    public String directoryPathCSS(String mainPath){
        return (mainPath + "/css");
    }

    // create the main directory
    public String createMainDirectory(String siteName) throws IOException {
        Files.createDirectories(Paths.get("src/main/java/ex43/website/" + siteName));
        return "src/main/java/ex43/website/"+siteName;
    }

    // creates the html file and return directory
    public String createHTMLFile(String mainPath) {
        File created = new File(mainPath + "/index.html");
        //notifyFileCreationFailure(created);
        return created.getPath();
    }

    // check if file created success
    public boolean fileCreateSuccess(File created) throws IOException {
        return created.createNewFile();
    }

    // tell user if fail
    public void notifyFileCreationFailure(File created) throws IOException {
        if (!fileCreateSuccess(created)){
            System.out.print("Creation of index file failed.\n");
        }
    }

    // writes the HTML file in format
    public void writeHTMLFile(String author, String siteName, String HTMLPath) throws IOException {
        FileWriter HTML = new FileWriter(HTMLPath);
        HTML.write("<!DOCTYPE html>\n");
        HTML.write("<html>\n");
        HTML.write("\t<head>\n");
        HTML.write("\t\t<meta author=\"" + author + "\">\n");
        HTML.write("\t\t<title>" + siteName + "</title>\n");
        HTML.write("\t</head>\n");
        HTML.write("<html>");
        HTML.close();
        printOutput(HTMLPath);
    }

    public void generateMainDirectory(String mainPath){
        printOutput(mainPath);
    }

    // tells user what folder they created
    public void printOutput(String Path){
        Path = Path.replace("\\","/");
        Path = Path.replace("src/main/java/ex43/", "");
        System.out.println("Created ." + Path);
    }
}
