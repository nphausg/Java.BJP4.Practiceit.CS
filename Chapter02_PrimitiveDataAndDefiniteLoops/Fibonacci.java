/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */
package Chapter02_PrimitiveDataAndDefiniteLoops;

/**
 * The Fibonacci numbers are a sequence of integers in which the first two
 * elements are 1,
 * and each following element is the sum of the two preceding elements.
 * The mathematical definition of each kth Fibonacci number is the following:
 * F(k):
 * k > 2 : F(k-1) + F(k-2)
 * k <= 2 : 1
 * The first 12 Fibonacci numbers are: 1 1 2 3 5 8 13 21 34 55 89 144
 * Write a piece of code that uses a for loop to compute and print the first 12
 * Fibonacci numbers.
 * (You may include other code, such as declaring variables before the loop, if
 * you like.) *
 */
public class Fibonacci {

    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter2/e3-fibonacci
    public static void fibo12ThSolution1(){
        // Declare an array to store Fibonacci numbers
        int f[] = new int [12+2];
        int i;
        f[0] = 0;
        f[1] = 1;
        System.out.print(f[1] + " ");
        for (i = 2; i <=12; i ++){
            // Add the previous 2 numbers in the series and store it
            f[i] = f[i-1] + f[i-2];
            System.out.print(f[i] + " ");
        }
    }
    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter2/e3-fibonacci
    public static void fibo12ThSolution2(){
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= 144; i  = a + b){
            System.out.print(i + " ");
            a = b;
            b = i;
        }
    }

    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter2/e3-fibonacci
    public static int fibo12ThSolution3(int n){
        // Declare an array to store Fibonacci numbers
        int f[] = new int [n+2];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <=n; i ++ ){
            // Add the previous 2 numbers in the series and store it
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter2/e3-fibonacci
    public static int fibonacciRecursion(int n){
        if(n <= 1)
            return n;
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n -  2);
    }
}
