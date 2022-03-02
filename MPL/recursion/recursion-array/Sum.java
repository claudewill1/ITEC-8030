/**
 *  The sum of the elements of an integer-valued array recursively calculated as follows:

    The sum of an array of size 0 is 0;
    Otherwise, the sum of the first n elements of an array is the sum of the last of these added to the sum of the previous n-1 elements. 

Write an int method named sum that accepts an integer array, and the number of elements in the array and returns the sum of the elements of the array. 
 */

public class Sum {
    int sum(int[] a, int n){
        int sum = 0;
        if(n==0){
            return 0;
        } else {
            sum = sum(a,--n);
            sum += a[n];
        }
        return sum;
    }
}
