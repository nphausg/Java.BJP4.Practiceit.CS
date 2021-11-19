package Chapter03;

import java.util.Scanner;

/**
 * Write a static method named longestName that reads names typed by the user and prints the longest name 
 * (the name that contains the most characters) in the format shown below.
 * Your method should accept a console Scanner and an integer n as parameters and should then prompt for n names.
 * The longest name should be printed with its first letter capitalized and all subsequent letters in lowercase,
 * regardless of the capitalization the user used when typing in the name.
 * If there is a tie for longest between two or more names, use the tied name that was typed earliest.
 * Also print a message saying that there was a tie, as in the right log below.
 * It's possible that some shorter names will tie in length, such as DANE and Erik in the left log below; but don't print a message unless the tie is between the longest names.
 * You may assume that n is at least 1, that each name is at least 1 character long,
 * and that the user will type single-word names consisting of only letters.
 * The following table shows two sample calls and their output (user input in blue):
 */
public class LongestName {
    
    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter4/e11-longestName
    public static void longestName(Scanner console, int numOfNames) {
    System.out.print("name #1? ");
    String name = console.next();
    boolean tie = false;
    int maxLength = name.length();
    String longestName = name.toLowerCase();
    
    for (int i = 2; i <= numOfNames; i++) {
        System.out.printf("name #%d? ", i);
        name = console.next();
        if (name.length() > maxLength) {
            maxLength = name.length();
            longestName = name.toLowerCase();
            tie = false;
        } else if (name.length() == maxLength){
            tie = true;
        }
    }
    
    longestName = longestName.substring(0,1).toUpperCase() + longestName.substring(1);
    System.out.println(longestName + "'s name is longest");
    
    if (tie == true) {
        System.out.println("(There was a tie!)");
    }
}
}
