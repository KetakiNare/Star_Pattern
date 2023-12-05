package StarPatterns;

public class Pattern_78 {

	public static void main(String[] args) 
	{
		int irange = 5;
		int jrange = 19;
		
		for (int i = 0; i < irange; i++) 
		{
		 for (int j = 0; j < jrange; j++) 
		 {
			if(j-i<=0 || j+i<=9 && j>=5 || j-i>=9 && j<=13 || j+i>=18)
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

*    *********    *
**   **** ****   **
***  ***   ***  ***
**** **     ** ****
******       ******

 */
