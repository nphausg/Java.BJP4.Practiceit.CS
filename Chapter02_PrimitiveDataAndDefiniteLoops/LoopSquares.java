package Chapter02_PrimitiveDataAndDefiniteLoops;
/**
 * Write a for loop that produces the following output:
 * 1 4 9 16 25 36 49 64 81 100 
 * For added challenge, try to modify your code so that it does not need to use the * multiplication operator.
 * (It can be done! Hint: Look at the differences between adjacent numbers.)
 */
public class LoopSquares {

    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter2/e2-loopSquares
    public static void loopSquares(int n){
        for (int i = 0; i <= n; i++){
            System.out.print((int)Math.pow(i, 2) + " ");
        }
    }

}