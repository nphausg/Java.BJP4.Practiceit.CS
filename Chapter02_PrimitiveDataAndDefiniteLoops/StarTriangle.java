/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */

package Chapter02_PrimitiveDataAndDefiniteLoops;

public class StarTriangle {
    /* https://practiceit.cs.washington.edu/problem/view/bjp4/chapter2/e5-starTriangle
        *
        **
        ***
        ****
        *****
     */
    public static void starTriangle(int n){
        for(int i = 1; i <= n; i++){
            for (int j = i; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
