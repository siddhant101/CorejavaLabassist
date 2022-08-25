/*
Program: Pattern program to print number
@Author : Siddhant Amruktar
@date :  25 august 2022
*/


class PatternNumber
{
	 //start NumberFive method
	 static void NumberFive()
	 {
		 //outer loop
       for(int i=0;i<=5;i++)
	   {
	    System.out.println();
		//inner loop
		for(int j=1 ;j<=i;j++)
			{
		     System.out.print(j+" ");
			}//end of inner loop
	   }//end of outer loop

	 }		//end of method NumberFive
	 
	 
	 //staring main method	 
	 public static void main(String arg[])
	 {
		 //calling method NumberFive
		 NumberFive();
		 
		 
	 }
	 
	 
}
