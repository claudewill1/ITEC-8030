/**
 *  Write a recursive, boolean-valued method named search that accepts an integer array, the number of elements in the array, and an integer (in that order), 
 * and returns whether the integer is present as an element in the array. Searching for a particular value in an array can be performed in the following recursive 
 * manner:

    If the array has no elements, the value is not there.
    Compare the first element of the array to the value, if they're equal, the value is there; other search for the value in the rest of the array. 
 */
public class SearchArray {
    boolean search(int[] a, int len, int tar){
        if(len==0) return false;
        if(a[len-1]==tar)
            return true;
        return search(a, len-1, tar);
    }
}
