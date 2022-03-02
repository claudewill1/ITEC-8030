/**
 * An array is sorted (in ascending order) if each element of the array is less than or equal to the next element.

    An array of size 0 or 1 is sorted
    Compare the first two elements of the array; if they are out of order, the array is not sorted; otherwise, check the if the rest of the array is sorted. 

Write a boolean-valued method named isSorted that accepts an integer array, and the number of elements in the array and returns whether the array is sorted. 
 */
public class IsSorted {
    boolean isSorted(int[] a, int n){
        if(n==0||n==1){
            return true;
        } else {
            if(a[n-1]<a[n-2]){
                return false;
            } else {
                return isSorted(a, n-1);
            }
        }
    }
}
