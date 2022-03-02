/**
 *  The maximum-valued element of an integer-valued array can be recursively calculated as follows:

    If the array has a single element, that is its maximum (note that a zero-sized array has no maximum)
    Otherwise, compare the first element with the maximum of the rest of the array-- whichever is larger is the maximum value. 

Write an int method named max that accepts an integer array, and the number of elements in the array and returns the largest value 
in the array. Assume the array has at least one element. 
 */
public class MaxElementArray {
    int max(int[] a, int n){
        if(n==1) return a[0];
        return Math.max(a[n-1],max(a,n-1));
    }
}
