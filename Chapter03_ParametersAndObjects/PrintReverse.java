/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */

package Chapter03_ParametersAndObjects;

public class PrintReverse {
    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter3/e19-printReverse
    public static void printReverse(String str){
        for (int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
