/**
 *  The elements of an integer-valued array can be initialized so that a[i] == i in a recursive fashion as follows:

    An array of size 0 is already initialized;
    Otherwise
        set the last element of the array to n-1 (where n is the number of elements in the array, for example, an array of size 3 will have its 
        last element -- index 2-- set to 2; and
        initialize the portion of the array consisting of the first n-1 elements (i.e., the other elements of the array) 

Write a void method named init that accepts an integer array, and the number of elements in the array and recursively initializes the array so that a[i] == i. 
 */

public class Init {
    public void init(int[] a,int n){
        if(n==0){
            a[0] = 0;
        } else {
            a[n-1]= n-1;
            init(a, n-1);
        }
    }
}
