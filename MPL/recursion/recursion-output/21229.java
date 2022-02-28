/*
Assume the availability of a method named makeLine that can be passed a non-negative integer n and a character c and return a String consisting of n identical characters that are all equal to c. Write a method named printTriangle that receives two integer parameters n and k. If n is negative the method does nothing. If n happens to be an even number, its value is raised to the next odd number (e.g. 4-->5). Then, when k has the value zero, the method prints a SYMMETRIC triangle of O's (the capital letter O) as follows: first a line of n O, followed by a line of n-2 O's (indented by one space), and then a line of n-4 O's (indented by two spaces), and so on. For example, if the method received 5,0 (or 4,0) it would print:
OOOOO
  OOO
     O

Note: in the above output, the first line contains 0 spaces before the first O, the next line 1 space, and so on.

Note: These instructions state what the method does when k is zero, but it is up to you, the programmer, to determine what it does when k is not zero and use it for your advantage.

The method must not use a loop of any kind (for, while, do-while) to accomplish its job. The method should invoke makeLine to accomplish the task of creating Strings of varying lengths. 
*/

public void printTriangle(int n, int k){
	if(n<1) return;
	if(n%2==0) n = n+2;
	System.out.println(makeLine(k,'')+makeLine(n,'O'));
	printTriangle(n-2,++k);
}