/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */
package Chapter08_Classes;
/*
* Returns the "Manhattan distance" between the current Point object and the given other 
* Point object. The Manhattan distance refers to how far apart two places are if the person 
* can only travel straight horizontally or vertically, as though driving on the streets of 
* Manhattan. In our case, the Manhattan distance is the sum of the absolute values of 
* the differences in their coordinates; in other words, the difference in x plus the difference 
* in y between the points. 
*/

public class Point {
    
    private int x;
    private int y;

    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter8/e3-manhattanDistancePoint
    public int manhattanDistance(Point p) {
        int a = this.x - p.x;
        int b = this.y - p.y;
       return Math.abs(a) + Math.abs(b);
    }

}
