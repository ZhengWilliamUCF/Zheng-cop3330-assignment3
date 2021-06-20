package ex41;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void importFileTest() {
        App myApp = new App();
        String actual = String.valueOf(myApp.importFile());
        Assertions.assertEquals("src\\main\\java\\ex41\\exercise41_input.txt", actual);
    }
}