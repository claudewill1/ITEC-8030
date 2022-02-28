/*
 Write a recursive, int-valued method, len, that accepts a string and returns the number of characters in the string.

The length of a string is:

    0 if the string is the empty string ("").
    1 more than the length of the rest of the string beyond the first character. 
    */
public class Len {
    public int len(String s){
        if(s.equals("")){
            return 0;
        } else {
            return 1 + len(s.substring(1));
        }
    }
}
