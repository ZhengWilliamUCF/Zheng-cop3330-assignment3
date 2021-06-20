package ex44;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class FormatJSONTest {

    @Test
    void parseJSONToArray() throws FileNotFoundException {
        FormatJSON myApp =new FormatJSON();
        String file = "src/main/java/ex44/exercise44_input.json";
        String expected = "{products=[{name=Widget, price=25.0, quantity=5.0}, {name=Thing, price=15.0, quantity=5.0}, {name=Doodad, price=5.0, quantity=10.0}]}";
        String actual = myApp.parseJSONToArray(file);
        assertEquals(expected, actual);
    }

    @Test
    void SplitJSONInput() {
        FormatJSON myApp = new FormatJSON();
        String[] shelf = new String[3];
        String fixed = "name=Widget,price=25.0,quantity=5.0-,name=Thing,price=15.0,quantity=5.0-,name=Doodad,price=5.0,quantity=10.0--";
        String[] actual = myApp.SplitJSONInput(fixed, shelf);
        assertEquals("name: Widget\n" + "price: 25.0\n" + "quantity: 5.0",actual[0]);
    }

    @Test
    void SplitJSONInputFruits() {
        FormatJSON myApp = new FormatJSON();
        String[] shelf = new String[3];
        String fixed = "name=Apple,price=15.0,quantity=3.0-,name=Pear,price=20.0,quantity=3.0-,name=Kiwi,price=6.0,quantity=23.0--";
        String[] actual = myApp.SplitJSONInput(fixed, shelf);
        assertEquals("name: Apple\n" + "price: 15.0\n" + "quantity: 3.0",actual[0]);
    }

    @Test
    void FormatJSONInput() {
        FormatJSON myApp = new FormatJSON();
        String JSONText = "{products=[{name=Widget, price=25.0, quantity=5.0}, {name=Thing, price=15.0, quantity=5.0}, {name=Doodad, price=5.0, quantity=10.0}]}";
        String actual = myApp.formatJSONInput(JSONText);
        assertEquals("name=Widget,price=25.0,quantity=5.0-,name=Thing,price=15.0,quantity=5.0-,name=Doodad,price=5.0,quantity=10.0--",actual);
    }

    @Test
    void FormatJSONInputFruits() {
        FormatJSON myApp = new FormatJSON();
        String JSONText = "{products=[{name=Apple, price=25.0, quantity=5.0}, {name=Pear, price=15.0, quantity=5.0}, {name=Kiwi, price=5.0, quantity=10.0}]}";
        String actual = myApp.formatJSONInput(JSONText);
        assertEquals("name=Apple,price=25.0,quantity=5.0-,name=Pear,price=15.0,quantity=5.0-,name=Kiwi,price=5.0,quantity=10.0--",actual);
    }
}