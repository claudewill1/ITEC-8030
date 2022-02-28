/*
 Write a recursive, boolean-valued method, containsVowel, that accepts a string and returns true if the string contains a vowel.

A string contains a vowel if:

    The first character of the string is a vowel, or
    The rest of the string (beyond the first character) contains a vowel 
    */

public class ContainsVowel {
    
    // used this for now as it was taking too long to find a more efficient answer
    // other methods which I would've used were not allowed in MyProgrammingLab
    boolean containsVowel(String sentence){
        if (sentence.isEmpty()) return false;
        if (sentence.charAt(0) == 'a' || sentence.charAt(0) == 'e' || sentence.charAt(0) == 'i' || sentence.charAt(0) == 'o'
        || sentence.charAt(0) == 'u' || sentence.charAt(0) == 'A' || sentence.charAt(0) == 'E' || sentence.charAt(0) == 'I'
        || sentence.charAt(0) == 'O' || sentence.charAt(0) == 'U') return true;
        else return containsVowel(sentence.substring(1,sentence.length()));
        }
}
