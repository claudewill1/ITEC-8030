/**
 * Write a recursive method that accepts a string as its argument and prints the
string in reverse order. Demonstrate the method in a program that takes a
string as input from the user and prints out its reverse. 
 */

import java.util.Scanner;
public class StringReverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to be reversed:");
		String s = sc.nextLine();
		System.out.print(reverse(s));
	}
	
	static String reverse(String s){
		return !s.equals("") ? reverse(s.substring(1)) + s.charAt(0) : s;
	
	}
}