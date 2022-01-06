/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */
package Chapter03_ParametersAndObjects;

public class Vertical {

    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter3/e18-vertical
    public static void printVertical(String str){
        for (int i = 0; i < str.length() - 1; i++){
            System.out.println(str.charAt(i));
        }
    }

}
