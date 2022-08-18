/*
Program: java Programp To print the Tagline of the Brand entered(take any 5 brands).
@Author : Siddhant Amruktar
@date : 18 august 2022
*/

class BrandTagLine
{
	 static void TagLine(int BName)
	 {
	   String n = "nike" ;
        
       //String n = (int(BName));		
		
		
		switch(n)
		{
		
		case "adidas"->System.out.println("Impossible is nothing");
		case "nike"->System.out.println("just do it");
		case "reebok"->System.out.println("FOREVER FASTER IS ALWAYS FIRST, NEVER SECOND, NEVER THIRD");
		case "puma"->System.out.println("i am what i am ");
		case "fila"->System.out.println("Power style");
		default-> System.out.println("Wrong input");
		}
		
		
		/*
		if(n == adidas)
		{
	     System.out.println("Impossible is nothing");
        }
		else if(n == nike)
		  {
			  System.out.println("just do it");
		  }
			  else if(n == puma)
		       {
			  System.out.println("FOREVER FASTER IS ALWAYS FIRST, NEVER SECOND, NEVER THIRD");
		         }
		          else if(n == reebok)
		            {
			        System.out.println("i am what i am ");
		            }
						else if(n == Fila)
						{
						System.out.println("Power style");
						}
		  
					else 
					{
					System.out.println("wrong input");
					}
				  
	 }		 */
	 
}
	 public static void main(String arg[])
	 {
		//int BrandName = Integer.parseInt(arg[0]);
		    // TagLine(BrandName);
            TagLine();
		 }
	 
	 
}
