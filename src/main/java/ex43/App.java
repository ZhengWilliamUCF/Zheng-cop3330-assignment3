package ex43;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 William Zheng
 */

import java.io.IOException;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        App myApp = new App();
        SkeletonGeneration ad = new SkeletonGeneration();
        String siteName = myApp.userInputSiteName();
        String author = myApp.userInputAuthor();
        String userInputJS = myApp.userInputCreateFolderJS();
        String userInputCSS = myApp.userInputCreateFolderCSS();
        String createdPath = ad.createMainDirectory(siteName);
        String HTMlPath = ad.createHTMLFile(createdPath);
        ad.generateMainDirectory(createdPath);
        ad.writeHTMLFile(author, siteName, HTMlPath);
        ad.createFolderJSYes(userInputJS, siteName, createdPath);
        ad.createFolderCSSYes(userInputCSS, siteName, createdPath);
    }

    public String userInputSiteName(){
        System.out.print("Site name: ");
        return in.nextLine();
    }

    public String userInputAuthor(){
        System.out.print("Author: ");
        return in.nextLine();
    }

    public String userInputCreateFolderJS(){
        System.out.print("Do you want a folder for JavaScript? ");
        return in.nextLine();
    }

    public String userInputCreateFolderCSS(){
        System.out.print("Do you want a folder for CSS? ");
        return in.nextLine();
    }
}
