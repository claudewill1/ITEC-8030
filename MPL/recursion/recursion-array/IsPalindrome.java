import javax.lang.model.util.ElementScanner14;

/**
 *  A 'array palindrome' is an array which, when its elements are reversed, remains the same (i.e., 
 * the elements of the array are same when scanned forward or backward) Write a recursive, boolean-valued method,
 *  isPalindrome, that accepts an integer-valued array, and a pair of integers representing the starting and ending 
 * indexes of the portion of the array to be tested for being a palindrome. The function returns whether that portion of the array is a palindrome.

An array is a palindrome if:

    the array is empty (0 elements) or contains only one element (which therefore is the same when reversed), or
    the first and last elements of the array are the same, and the rest of the array (i.e., the second through next-to-last elements) form a palindrome. 
 */
public class IsPalindrome {
    boolean isPalindrome(int[] a, int begin, int end){
        if(begin>=end){
            return true;
        }
        if(a.length == 0 || a.length == 1){
            return true;
        }
        else if (a[begin] == a[end]){
            return isPalindrome(a, begin + 1, end - 1);
        }
        else
        {
            return false;
        }
    }
}
