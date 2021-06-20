package ex42;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import ex41.Names;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FormattingTest {

    @Test
    void createEmptyArrayList() {
        Names myApp = new Names();
        ArrayList<String> test = new ArrayList<>();
        ArrayList<String> actual =  myApp.createArrayList();
        assertEquals(test, actual);
    }

    @Test
    void addToArrayListTestThenCheckIfContainsValue1(){
        ArrayList<String> test = new ArrayList<>();
        test.add("testcase1");
        Boolean actual = test.contains("testcase1");
        assertEquals(true, actual);
    }

    @Test
    void addToArrayListTestThenCheckIfContainsValue2(){
        ArrayList<String> test = new ArrayList<>();
        test.add("testcase2");
        Boolean actual = test.contains("testcase1");
        assertEquals(false, actual);
    }

    @Test
    void addToArrayListTestThenCheckIfContainsValueUpperCase(){
        ArrayList<String> test = new ArrayList<>();
        test.add("TESTCASE3");
        Boolean actual = test.contains("testcase3");
        assertEquals(false, actual);
    }

    @Test
    void convertArrayList(){
        Names myApp = new Names();
        ArrayList<String> food = new ArrayList<>();
        food.add("Chicken");
        food.add("Cow");
        food.add("Baby");
        String[] converted = myApp.convertArrayList(food);
        List<String> check = Arrays.asList(converted);
        boolean actual1 = check.contains("Chicken");
        boolean actual2 = check.contains("Cow");
        boolean actual3 = check.contains("Baby");
        assertEquals(true, actual1);
        assertEquals(true, actual2);
        assertEquals(true, actual3);
    }

    @Test
    void FormatListSplitTestingComma() {
        String output = "Zheng,William,1000";
        String[] split = output.split("[, ]", 3);
        String lName = split[0];
        String fName = split[1];
        String salary = split[2];
        String actual = lName + fName + salary;
        Assertions.assertEquals("ZhengWilliam1000", actual);
    }

    @Test
    void FormatListSplitTestingSpace() {
        String output = "Zheng William 1000";
        String[] split = output.split("[, ]", 3);
        String lName = split[0];
        String fName = split[1];
        String salary = split[2];
        String actual = lName + fName + salary;
        Assertions.assertEquals("ZhengWilliam1000", actual);
    }
}