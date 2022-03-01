/**
 *  The elements of an integer-valued array can be set to 0 (i.e., the array can be cleared) recursively as follows:

    An array of size 0 is already cleared;
    Otherwise, set the last of the uncleared elements of the array to 0, and clear the rest of the array

Write a void method named clear that accepts an integer array, and the number of elements in the array and sets the elements of the array to 0. 
 */
public class Clear {
    public void clear(int[] a, int n){
        if(n==0) {
            return;
        }
        else {
            a[n-1]=0;
            clear(a,n-1);
        }
    }
}
