package Chapter07_Arrays;

/**
 * Write a method called median that accepts an array of integers as its argument and returns the median of the numbers in the array.
 * The median is the number that will appear in the middle if you arrange the elements in order.
 * Assume that the array is of odd size (so that one sole element constitutes the median) and that the numbers in the array are between 0 and 99 inclusive.
 * For example, the median of {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} is 5, and the median of {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27} is 25.
 * (Hint: You may wish to look at the Tally program from earlier in this chapter for ideas.)
 * ----------------------------------------------------------------
 * Mean of an array = (sum of all elements) / (number of elements)
 * Median of a sorted array of size n is defined as the middle element when n is odd and average of middle two elements when n is even.
 * Since the array is not sorted here, we sort the array first, then apply above formula.
 * ----------------------------------------------------------------
 */

 /**
  * 1. Median is joined by the mean and the mode to create a grouping called measures of central tendency.
  * 2. Median is an important measure (compared to mean) for distorted data, because median is not so easily distorted. For example, median of {1, 2, 2, 5, 100) is 2 and mean is 22.
  * 3. If user add a constant to every value, the mean and median increase by the same constant.
  * 4. If user multiply every value by a constant, the mean and the median will also be multiplied by that constant
  */

public class Median {

    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter7/e8-median
    public double median(int[] array){
        // First we sort the array

        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
 
        // check for even case
        if (array.length % 2 != 0)
            return (double)array[array.length / 2];
 
        return (double)(array[(array.length - 1) / 2] + array[array.length / 2]) / 2.0;
    }
     public double medianUnsortedArray(int[] array){
         
        return 0.0;
     }
}
