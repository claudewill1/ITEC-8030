/**
 *  Write a recursive, string-valued method, reverse, that accepts a string and returns a new string consisting of the original string in reverse. 
 * For example, calling reverse with the string goodbye returns the string eybdoog.

    Reversing a string involves:

    Nothing if the string is empty or has only 1 character (reversing a single character string does not change anything)
    Otherwise concatenate the last character with the result of reversing the string consisting of the second through the next-to-last character, 
    followed by the first character. In the above example, you would concatenate the 'e' (last character of goodbye) with the result of 
    calling reverse on oodby (the string from the second character to the next-to-last), with the 'g' (first character). 


 */
public class Reverse {

    String reverse(String s){
        String temp = "";
        if(s.length() > 1) {
            temp = s.substring(s.length()-1, s.length());
            temp += s.substring(0, s.length()-1);
        } else {
            return s;
        }
        return temp;
    }
}