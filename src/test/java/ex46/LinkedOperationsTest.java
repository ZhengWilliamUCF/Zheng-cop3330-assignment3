package ex46;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

class LinkedOperationsTest {

    @Test
    void checkHashMapAndIfKeyDoesNotExistAddToHashMapButIfExistsIncreaseTheValue() {
        LinkedHashMap<String, String> testList = new LinkedHashMap<>();
        String word = "test";
        if (testList.containsKey(word)){
            testList.put(word, testList.get(word)+"*");
        }
        else {
            testList.put(word,"*");
        }
        boolean actual = testList.containsKey("test");
        assertTrue(actual);
    }

    @Test
    void checkHashMapAndIfKeyDoesNotExistAddToHashMapButCheckTheValueFalse() {
        LinkedHashMap<String, String> testList = new LinkedHashMap<>();
        String word = "test";
        if (testList.containsKey(word)){
            testList.put(word, testList.get(word)+"*");
        }
        else {
            testList.put(word,"*");
        }
        boolean actual = testList.containsValue("**");
        assertFalse(actual);
    }
    @Test
    void checkHashMapAndIfKeyDoesNotExistAddToHashMapButCheckTheValueTrue() {
        LinkedHashMap<String, String> testList = new LinkedHashMap<>();
        testList.put("test","*");
        String word = "test";
        if (testList.containsKey(word)){
            testList.put(word, testList.get(word)+"*");
        }
        else {
            testList.put(word,"*");
        }
        boolean actual = testList.containsValue("**");
        assertTrue(actual);
    }

    @Test
    void removeFromListAndMakeSureTheyDoNotExist() {
        LinkedHashMap<String, String> testList = new LinkedHashMap<>();
        testList.put("test1", "******");
        testList.put("test2", "***");
        testList.put("test3", "*********");
        testList.put("test4", "****");
        testList.remove("test1");
        boolean actual = testList.containsKey("test1");
        assertFalse(actual);
    }

    @Test
    void addToOrderedListExists() {
        LinkedHashMap<String, String> orderedTestList = new LinkedHashMap<>();
        orderedTestList.put("test", "******");
        boolean actual = orderedTestList.containsKey("test");
        assertTrue(actual);
    }

    @Test
    void addToOrderedListDoNotExist() {
        LinkedHashMap<String, String> orderedTestList = new LinkedHashMap<>();
        orderedTestList.put("test", "******");
        boolean actual = orderedTestList.containsKey("test1");
        assertFalse(actual);
    }

    @Test
    void isEmptyListTrue() {
        LinkedHashMap<String, String> orderedTestList = new LinkedHashMap<>();
        boolean actual = orderedTestList.isEmpty();
        assertTrue(actual);
    }

    @Test
    void isEmptyListFalse() {
        LinkedHashMap<String, String> orderedTestList = new LinkedHashMap<>();
        orderedTestList.put("test", "**********");
        boolean actual = orderedTestList.isEmpty();
        assertFalse(actual);
    }

    @Test
    void isEmptyListFalse2() {
        LinkedHashMap<String, String> orderedTestList = new LinkedHashMap<>();
        orderedTestList.put("test", "**********");
        orderedTestList.put("test2", "*****");
        boolean actual = orderedTestList.isEmpty();
        assertFalse(actual);
    }
}