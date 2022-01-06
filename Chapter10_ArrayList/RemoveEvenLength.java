/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */
package Chapter10_ArrayList;
/*
* Write a method removeEvenLength that takes an ArrayList of Strings as a
* parameter and that removes all of the strings of even length from the list. 
*/

import java.util.ArrayList;

public class RemoveEvenLength {

    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter10/e3-removeEvenLength
    public static void removeEvenLength(ArrayList<String> array) {

        for (int i = 0; i < array.size(); i++) {
            String word = array.get(i);
            if (word.length() % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
    
    }
    
}
