package ex41;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NamesTest {

    @Test
    void createEmptyArrayList() {
        Names myApp = new Names();
        ArrayList<String> test = new ArrayList<>();
        ArrayList<String> actual =  myApp.createArrayList();
        assertEquals(test, actual);
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
    void getListSizeTest1() {
        Names myApp = new Names();
        String[] testArray = createTestArray1();
        int actual = myApp.getListSize(testArray);
        assertEquals(3, actual);
    }

    String[] createTestArray1(){
       return new String[3];
    }

    @Test
    void getListSizeTest2() {
        Names myApp = new Names();
        String[] testArray = createTestArray2();
        int actual = myApp.getListSize(testArray);
        assertEquals(1, actual);
    }

    String[] createTestArray2(){
        return new String[1];
    }

    @Test
    void getListSizeTest3() {
        Names myApp = new Names();
        String[] testArray = createTestArray3();
        int actual = myApp.getListSize(testArray);
        assertEquals(12, actual);
    }

    String[] createTestArray3(){
        return new String[12];
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
}