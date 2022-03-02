/**
 * Write a recursive boolean method named isMember. The method should accept two
arguments: an int array and an int value. The method should return true
if the value is found in the array, or false if the value is not found in
the array.

Demonstrate the method in a program that takes input from the user. First,
the program should prompt the user to enter the length of the array. Then,
it should prompt the user for every member of the array. Then, it should ask
the user for a number to search for in the array, and print whether the
number is a member of the array (either "true" or "false"). 
 */
import java.util.Scanner;
public class Member {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i = 0; i < size; i++){
			System.out.print(String.format("Enter number for array index %d:",i));
			a[i] = sc.nextInt();
		}
		System.out.print("Enter number to search for in array:");
		int v = sc.nextInt();
		System.out.print(isMember(a,v));
	}
	
	static boolean isMember(int[] a, int v){
		if(a.length == 0) return false;
		if(a[0] == v) return true;
		int[] a2 = new int[a.length-1];
		System.arraycopy(a,1,a2,0,a2.length);
		return isMember(a2,v);
		
			
	}
}
}
