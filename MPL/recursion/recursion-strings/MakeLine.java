/**
 * Write a method called makeLine. The method receives an int parameter that is guaranteed not to be negative and a character. The method returns a 
 * String whose length equals the parameter and contains no characters other than the character passed. Thus, if the makeLine(5,':') will return ::::: (5 colons).

The method must not use a loop of any kind (for, while, do-while) nor use any String methods other than concatenation. Instead, 
it gets the job done by examining its parameter, and

    if zero returns an empty string
    otherwise returns the concatenation of the specified character with the string returned by an appropriately formulated recursive call to itself.

 */

 public class MakeLine {
     public String makeLine(int n, char c){
         if(n==0) return "";
         return String.format("%s", c) + makeLine(n-1, c);
     }
 }