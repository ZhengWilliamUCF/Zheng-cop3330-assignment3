package ex46;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void importFile() {
        App myApp = new App();
        String actual = String.valueOf(myApp.importFile());
        assertEquals("src\\main\\java\\ex46\\exercise46_input.txt", actual);
    }

    @Test
    void readFileFirstWordCorrectYes() throws FileNotFoundException {
        File imported = new File("src/main/java/ex46/exercise46_input.txt");
        Scanner in = new Scanner(new File(String.valueOf(imported)));
        String actual = "";
        if (in.hasNextLine()) {
            actual = in.next();
        }
        assertEquals("badger", actual);
    }

    @Test
    void readFileFirstWordCorrectNo() throws FileNotFoundException {
        File imported = new File("src/main/java/ex46/exercise46_input.txt");
        Scanner in = new Scanner(new File(String.valueOf(imported)));
        String actual = "";
        if (in.hasNextLine()) {
            actual = in.next();
        }
        assertEquals("mushroom", actual);
    }

    @Test
    void createFormatYes() {
        App myApp = new App();
        String actual = myApp.createFormat();
        assertEquals("%-9s%-2s%-9s%n", actual);
    }
}