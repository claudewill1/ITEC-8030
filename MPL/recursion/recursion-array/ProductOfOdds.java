/**
 *  Write a recursive, int-valued method named productOfOdds that accepts an integer array, and the number of elements in the array 
 * and returns the product of the odd-valued elements of the array. 
 * You may assume the array has at least one odd-valued element. The product of the odd-valued elements of an integer-valued array 
 * recursively may be calculated as follows:

    If the array has a single element and it is odd, return the value of that element; otherwise return 1.
    Otherwise, if the first element of the array is odd, return the product of that element and the result of 
    finding the product of the odd elements of the rest of the array; if the first element is NOT odd, simply return the result of 
    finding the product of the odd elements of the rest of the array 
 */

public class ProductOfOdds {
    int productOfOdds(int[] a, int n){
        if(n==1){
            if(a[0]%2==1){
                return a[0];
            } else {
                return 1;
            }
        } else if(a[n-1]%2==1){
            return a[n-1]*productOfOdds(a, n-1);
        }
        return productOfOdds(a, n - 1);
    }
}
