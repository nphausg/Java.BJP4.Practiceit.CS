/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */

package Chapter05_LogicLoop;
/**
* Write a method dominant that accepts three integers as parameters
* and returns true if any one of the three integers is larger than
* the sum of the other two integers. The integers might be passed
* in any order, so the largest value could be any of the three. If
* no value is larger than the sum of the other two, your method 
* should return false. 
*/
public class Dominant {
    // https://practiceit.cs.washington.edu/problem/view/bjp5/chapter5/e15-dominant
    public static boolean dominant(int a, int b, int c) {
        if (a > b + c) {
            return true;
        } else if (b > a + c) {
            return true;
        } else if (c > a + b) {
            return true;
        } else {
            return false;
        }  
    }

}
