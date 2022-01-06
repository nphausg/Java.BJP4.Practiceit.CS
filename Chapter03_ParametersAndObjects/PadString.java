/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */
package Chapter03_ParametersAndObjects;
/**
 * Write a method padString that accepts two parameters: a String 
 * and an integer representing a length. 
 * The method should pad the parameter string with spaces until its length is the given length.
 * For example, padString("hello", 8) should return "   hello". (This sort of method is useful when trying to print output that lines up horizontally.)
 * If the string's length is already at least as long as the length parameter, your method should return the original string. For example, 
 * padString("congratulations", 10) would return "congratulations".
 */
public class PadString {
    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter3/e17-padString
    public static String padString(String str, int length){
        int diff = str.length() - length;
        if(diff >= 0)
            return str;
        String pad = "";
        for(int i = 0; i < Math.abs(diff); i++){
            pad += " ";
        }
        return pad + str;
    }
}
