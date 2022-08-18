/*
Program: Write a program to Check the number is palindrome or not.
@Author : Siddhant Amruktar
@date : 18 august 2022
*/

class PalindromeNumber
{
	 static void PalindromNum(int n)
	 {
	
	int r,num2 =0;
	
	int temp = n;
	while(n>0)
	{
	    r = n%10;
	    num2 =(num2*10)+r;
	    n = n/10;
	     if(num2==temp)
            System.out.println("number" + temp + " is a palindrom");
         else
		    System.out.println("number"+ temp + " is not palindrom"); 
 
	}// end of while loop
	 } //PalindromNum mehtod end here
	 public static void main(String arg[])
	 {
		 int num = Integer.parseInt(arg[0]);
		   PalindromNum(num);
	 }
	 
	 
	 
}