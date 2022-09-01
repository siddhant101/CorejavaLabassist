/*
Program: Write a program that reads a set of integers, 
        and then prints the sum of the even and odd integers.(using arrays)
@Author : Siddhant Amruktar
@date : 1 september 2022
*/


class SumofNumber
{
	 static void sum()
	 {
		 int arr[] = {1,2,3};
		 int sum=0 , oddsum =0 ;
		 for(int i=0; i<arr.length;i++)
		 {
		   //System.out.print(arr[i]);
		   if(arr[i]%2==0)
		   {
		        sum = sum + arr[i];
			   //System.out.println(arr[i]);
		   }else{
		   oddsum = oddsum + arr[i];
		 }
		   
		 }
      
	   System.out.println(sum);
	   System.out.println(oddsum);

	 }		 
	 public static void main(String...arg)
	 {
		 sum();
	 }
	 
	 
}
