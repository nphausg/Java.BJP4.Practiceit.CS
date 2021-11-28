package Chapter03;
/**
 * Write a method called printSquare that takes in two integer parameters, a min and a max, 
 * and prints the numbers in the range from min to max inclusive in a square pattern. 
 * The square pattern is easier to understand by example than by explanation, 
 * so take a look at the sample method calls and their resulting console output in the table below.
 * Each line of the square consists of a circular sequence of increasing integers between min and max. 
 * Each line prints a different permutation of this sequence. 
 * The first line begins with min, the second line begins with min + 1, and so on.
 * When the sequence in any line reaches max, it wraps around back to min.
 * You may assume the caller of the method will pass a min and
 *  a max parameter such that min is less than or equal to max.
 * ------------------------------------------------------------------------------------
 Call	    printSquare(1, 5);	     printSquare(3, 9);	    printSquare(0, 3);	    printSquare(5, 5);
Output	        12345                   3456789                 0123                      5
                23451                   4567893                 1230
                34512                   5678934                 2301
                45123                   6789345                 3012
                51234                   7893456
                                        8934567
                                        9345678
 * ------------------------------------------------------------------------------------
 */

public class PrintSquare {

    public static void printSquare1(int min, int max){
        if(min == max){
            System.out.println(min + "");
        }
        else{
            for(int i = min; i <= max; i++) {
                for(int j = i; j <= max; j++) {
                    System.out.print(j);
                }
                for(int k = 0; k < i - min; k++) {
                    System.out.print(min + k);
                }
                System.out.println();
            }
        }
    }

    public static void printSquare2(int min, int max){
        int diff = max - min;
        for (int i = 0; i <= diff; i++) {
            for (int j = 0; j <= (diff); j++) {
                System.out.print((j+i)%(diff+1) + min);
            }
            System.out.println("");
        }
    }
}