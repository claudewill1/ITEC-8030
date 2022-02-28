/**
 *  Write a recursive, string-valued method, replace, that accepts a string and returns a new string consisting of the original string with each blank replaced with an asterisk (*)

Replacing the blanks in a string involves:

    Nothing if the string is empty
    Otherwise:
        If the first character is not a blank, simply concatenate it with the result of replacing the rest of the string
        If the first character IS a blank, concatenate an * with the result of replacing the rest of the string 

 */

public class Replace {
    String replace(String s){
        if(s.equals("")) return s;
        if(s.charAt(0) == ' ') {
            return '*'+replace(s.substring(1,s.length()));
        } else {
            return s.charAt(0) + replace(s.substring(1, s.length()));
        }
    }
}
