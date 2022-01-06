/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */
package Chapter14_StacksAndQueus;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
* Write a method removeMin that accepts a Stack of integers as a parameter
* and removes and returns the smallest value from the stack.
*/

// https://practiceit.cs.washington.edu/problem/view/bjp4/chapter14/e19-removeMin
public class RemoveMin {
    

    public static int removeMin(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        int min = s.peek();
        
        while (!s.isEmpty()) {
            int num = s.pop();
            q.add(num);
            
            if (min > num) {
                min = num;
            }
        }
        
        while (!q.isEmpty()) {
            int num = q.remove();
            
            if (num != min) {
                s.push(num);
            }
        }
        
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        
        return min;
    }
}
