package ex46;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedOperations {
    // if word is not in arraylist
    public void checkHashMap(String word, LinkedHashMap<String, String> AnimalList){
        // add to array list
        if (AnimalList.containsKey(word)){
            //System.out.println("Already in AnimalList");
            AnimalList.put(word, AnimalList.get(word)+"*");
        }
        else {
            // else add a "*"
            AnimalList.put(word,"*");
        }
    }

    // iterate through map and print values
    public void orderMaps(LinkedHashMap<String, String> AnimalList, java.util.LinkedHashMap<String, String> OrderedAnimalList){
        Set<String> Animals = AnimalList.keySet();
        int longest = 0;
        String AnimalKey = "";
        String AnimalName = "";

        for (String key : Animals) {
            // check if value of key is the longest
            if (AnimalList.get(key).length() > longest) {
                longest = AnimalList.get(key).length();
                AnimalKey = AnimalList.get(key);
                AnimalName = key;
            }
        }
        RemoveFromAnimalList(AnimalList, OrderedAnimalList, AnimalKey, AnimalName);
    }

    // if longest, remove from Animal list
    public void RemoveFromAnimalList(LinkedHashMap<String, String> AnimalList, LinkedHashMap<String, String> OrderedAnimalList, String AnimalKey, String AnimalName){
        AnimalList.remove(AnimalName);
        AddToOrderedAnimalList(OrderedAnimalList, AnimalKey, AnimalName);
    }
    // and add to LinkedHashMap OrderedAnimalList
    public void AddToOrderedAnimalList(LinkedHashMap<String, String> OrderedAnimalList, String AnimalKey, String AnimalName){
        OrderedAnimalList.put(AnimalName, AnimalKey);
    }

    // check if initial AnimalList is empty
    public boolean isEmptyList(LinkedHashMap<String, String> AnimalList){
        return AnimalList.isEmpty();
    }

    // loops function until AnimalList is empty
    public void loopSortingUntilEmpty(LinkedHashMap<String, String> AnimalList, LinkedHashMap<String, String> OrderedAnimalList){
        while (!isEmptyList(AnimalList)){
            orderMaps(AnimalList, OrderedAnimalList);
        }
    }
}
