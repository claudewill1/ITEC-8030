/**
 *  Write a recursive, void method, reverse, that accepts an integer array, a starting index and an ending index, and reverses the array. 
 * Reversing an array involves:

    Nothing if the array has 0 or 1 elements.
    swapping the first and last elements of the array and then reversing the remainder of the array (2nd through next-to-last elements). 
 */
public class Reverse {
    void reverse(int[] a, int i, int j){
        if(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            reverse(a, ++i, --j);
        }
    }
}
