package ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileOutputTest {

    @Test
    void getMainDirectorySame() {
        FileOutput myApp = new FileOutput();
        String actual = myApp.getMainDirectory();
        assertEquals("src/main/java/ex45/", actual);
    }

    @Test
    void createOutputFileFromMainPathAndFilename() {
        FileOutput myApp = new FileOutput();
        String path = "src/main/java/ex45/";
        String fileName = "bruh";
        String actual = myApp.createOutputFile(path, fileName);
        assertEquals("src\\main\\java\\ex45\\bruh.txt", actual);
    }

    @Test
    void createOutputFileFromMainPathAndFilenameAndNumbers() {
        FileOutput myApp = new FileOutput();
        String path = "src/main/java/ex45/";
        String fileName = "bruh234910418418410414018410414";
        String actual = myApp.createOutputFile(path, fileName);
        assertEquals("src\\main\\java\\ex45\\bruh234910418418410414018410414.txt", actual);
    }

    @Test
    void createOutputFileFromMainPathAndFilenameAndUppercase() {
        FileOutput myApp = new FileOutput();
        String path = "src/main/java/ex45/";
        String fileName = "BRUHHHHHH";
        String actual = myApp.createOutputFile(path, fileName);
        assertEquals("src\\main\\java\\ex45\\BRUHHHHHH.txt", actual);
    }
}