package ex42;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void importFileReturnCorrectPath() {
        App myApp = new App();
        String actual = String.valueOf(myApp.importFile());
        Assertions.assertEquals("src\\main\\java\\ex42\\exercise42_input.txt", actual);
    }

    @Test
    void createFormatReturnCorrectString() {
        App myApp = new App();
        String actual = myApp.createFormat();
        Assertions.assertEquals("%-9s %-9s %-9s%n", actual);
    }

    @Test
    void printDisplayTestUsingCorrectFormat() {
        String format = "%-9s %-9s %-9s";
        String lname = "Zheng";
        String fname = "William";
        String salary = "1000";
        String actual = String.format(format, lname, fname, salary);
        Assertions.assertEquals("Zheng     William   1000     ", actual);
    }
}