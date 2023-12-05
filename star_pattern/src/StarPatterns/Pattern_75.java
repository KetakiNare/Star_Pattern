package StarPatterns;

public class Pattern_75 {

	public static void main(String[] args) 
	{
		int irange = 9;
		int jrange = 9;

		for(int i=2; i<irange; i=i+2)
		  {
		   for(int j=0; j<jrange; j++)
		   {
		    if(j-i<=0)
			{
			 if(j*2==i)
			 System.out.print(" ");
			 else
			System.out.print("*");
			}
			else
			System.out.print(" ");
		   }
		   System.out.println();
		  }
	}
		 
}
//output-

        /*
 
		* *
		** **
		*** ***
		**** ****

		*/