package ex44;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import com.google.gson.Gson;
import java.io.*;

public class FormatJSON {
    // parses json file to array
    public String parseJSONToArray(String file) throws FileNotFoundException {
        // Initiates JSOn parser
        Gson gson = new Gson();
        Reader reader = new BufferedReader(new FileReader(file));
        Object object = gson.fromJson(reader, Object.class);
        return String.valueOf(object);
    }

    // formats text and sets them in "shelves"
    public String formatJSONInput(String JSONText){
        String fixed = JSONText.replace("{", "");
        fixed = fixed.replace("products=", "");
        fixed = fixed.replace("[", "");
        fixed = fixed.replace("]", "");
        fixed = fixed.replace("}", "-");
        fixed = fixed.replace(" ", "");
        return fixed;
    }

    public String[] SplitJSONInput(String fixed, String[] shelf){
        String[] split = fixed.split("-", 3);
        shelf[0] = split[0];
        shelf[1] = split[1];
        shelf[2] = split[2];

        // Fixes each product line
        shelf[0] = shelf[0].replace("=",": ");
        shelf[0] = shelf[0].replace(",","\n");

        // Fixes product 2 line
        shelf[1] = shelf[1].replaceFirst(",", "");
        shelf[1] = shelf[1].replace("=",": ");
        shelf[1] = shelf[1].replace(",","\n");

        //Fixes product 3 line
        shelf[2] = shelf[2].replaceFirst(",", "");
        shelf[2] = shelf[2].replace("=",": ");
        shelf[2] = shelf[2].replace(",","\n");
        shelf[2] = shelf[2].replace("-","");

        return shelf;
    }

    // create product array
    public String[] createProductArray(){
        return new String[3];
    }
}
