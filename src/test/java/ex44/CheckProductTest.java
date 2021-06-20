package ex44;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckProductTest {

    @Test
    void checkArrayMixed() {
        CheckProduct myApp =new CheckProduct();
        String item = "Apple";
        boolean actual = myApp.checkArray(testProductArray(), item);
        assertEquals(true, actual);
    }

    @Test
    void checkArrayLowercase() {
        CheckProduct myApp =new CheckProduct();
        String item = "apple";
        boolean actual = myApp.checkArray(testProductArray(), item);
        assertEquals(false, actual);
    }

    @Test
    void checkArrayUppercase() {
        CheckProduct myApp =new CheckProduct();
        String item = "APPLE";
        boolean actual = myApp.checkArray(testProductArray(), item);
        assertEquals(false, actual);
    }

    public String[] testProductArray(){
        String[] productArrayTest = new String[3];
        productArrayTest[0] = "name: Apple\n" + "price: 15.0\n" + "quantity: 5.0";
        productArrayTest[1] = "name: Kiwi\n" + "price: 12.0\n" + "quantity: 73.0";
        productArrayTest[2] = "name: Pear\n" + "price: 13.0\n" + "quantity: 6.0";
        return productArrayTest;
    }
}