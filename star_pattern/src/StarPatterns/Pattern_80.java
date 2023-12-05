package StarPatterns;

public class Pattern_80 {

	public static void main(String[] args)
	{
		int irange = 5;
		int jrange = 10;
		
		for (int i = 0; i < irange; i++) 
		{
		 for (int j = 0; j < jrange; j++) 
		 {
			if(j-i<=0 || j+i>=9)
				System.out.print("*");
			else
				System.out.print(" ");
		 }
		 System.out.println();
		}

	}

}

//output-

/*

*        *
**      **
***    ***
****  ****
**********


 */
