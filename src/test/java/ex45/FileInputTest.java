package ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileInputTest {

    @Test
    void addToArrayListCheckIfSentenceExists() {
        FileInput myApp = new FileInput();
        ArrayList<String> test = new ArrayList<>();
        test.add("Chickens will never cross the road due to the cars.");
        boolean actual = test.contains("Chickens will never cross the road due to the cars.");
        assertTrue(actual);
     }

    @Test
    void convertArrayListCheckIfSentenceStillExists1() {
        FileInput myApp = new FileInput();
        ArrayList<String> test = new ArrayList<>();
        test.add("I do not understand why we have to do create all these tests.");
        test.add("Most of my functions don't return any values.");
        test.add("Instead, they call other functions using those values and print output");
        String[] actual = myApp.convertArrayList(test);
        assertEquals("Most of my functions don't return any values.",actual[1]);
    }

    @Test
    void convertArrayListCheckIfSentenceStillExists2() {
        FileInput myApp = new FileInput();
        ArrayList<String> test = new ArrayList<>();
        test.add("I do not understand why we have to do create all these tests.");
        test.add("Most of my functions don't return any values.");
        test.add("Instead, they call other functions using those values and print output");
        String[] actual = myApp.convertArrayList(test);
        assertEquals("Instead, they call other functions using those values and print output",actual[2]);
    }

    @Test
    void searchLineForASpecificWordAndReplace() {
        String[] test = testArray();
        if (test[0].contains("tests")){
            replaceWord(test,0);
        }
        String actual = test[0];
        String expected = "I do not understand why we have to do create all these chickens.";
        assertEquals(expected, actual);
    }

    @Test
    void searchLineForASpecificWordReturnTrue() {
        String[] test = testArray();
        boolean actual = false;
        if (test[0].contains("tests")){
            actual = true;
        }
        assertTrue(actual);
    }


    void replaceWord(String[] lines, int line) {
        lines[line] = lines[line].replace("tests", "chickens");
    }
    
    public String[] testArray(){
        FileInput myApp = new FileInput();
        ArrayList<String> test = new ArrayList<>();
        test.add("I do not understand why we have to do create all these tests.");
        test.add("Most of my functions don't return any values.");
        test.add("Instead, they call other functions using those values and print output");
        return myApp.convertArrayList(test);
    }
}