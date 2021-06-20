package ex44;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

public class CheckProduct {
    int index;
    //check if product exists
    public void productExists(String[] productArray, App myApp){
        String productName = myApp.userInputProductName();
        // while product not found
        while (!checkArray(productArray, productName)){
            myApp.printNotFound();
            // asks for product name again
            productName = myApp.userInputProductName();
            // checks to see if product exists
            checkArray(productArray, productName);
        }
        // once break out of loop print data
        printProductData(index, productArray);
    }

    //check productArray for product
    public boolean checkArray(String[] productArray, String productName){
        for (int i = 0; i<productArray.length; i++) {
            if (productArray[i].contains(productName)) {
                index = i;
                return true;
            }
        }
        return false;
    }

    // prints the data of product
    public void printProductData(int i, String[] productArray){
        System.out.print(productArray[i]);
    }
}
