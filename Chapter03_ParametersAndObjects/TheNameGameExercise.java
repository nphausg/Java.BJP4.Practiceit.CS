/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */
package Chapter03_ParametersAndObjects;

import java.util.Scanner;

/**
 * Write a complete program called "TheNameGame", where the user inputs a first and last name and a song in the following format is printed about their first,
 * then last, name. Use a method to avoid redundancy.
 * What is your name? Fifty Cent
 * Fifty Fifty, bo-Bifty
 * Banana-fana fo-Fifty
 * Fee-fi-mo-Mifty
 * FIFTY!
 * Cent Cent, bo-Bent
 * Banana-fana fo-Fent
 * Fee-fi-mo-Ment
 * CENT!
 */
public class TheNameGameExercise {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String first = sc.next();
        String last = sc.next();
        inputName(first);
        System.out.println("");
        inputName(last);
        sc.close();
    }

    public static void inputName (String name) {
        System.out.println(name + " " + name + ", bo-" + name.replace(name.charAt(0), 'B'));;
        System.out.println("Banana-fana fo-" + name.replace(name.charAt(0), 'F'));
        System.out.println("Fee-fi-mo-" + name.replace(name.charAt(0), 'M'));
        System.out.println(name.toUpperCase() + "!");
    }

}