package Chapter10_ArrayList;

import java.util.ArrayList;

/**
 * Write a method doubleList that takes an ArrayList of Strings as a parameter and that replaces every string with two of that string.
 * For example, if the list stores the values {"how", "are", "you?"} before the method is called,
 * it should store the values {"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.
 * 
 */
public class DoubleList {

    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter10/e4-doubleList
    public static void doubleList(ArrayList<String> array) {
        
        int oldSize = array.size();
    
        for (int i = 0; i < oldSize; i++) {
            String word = array.get(2 * i);
            array.add(2 * i + 1, word);
        }
    
    }
}
