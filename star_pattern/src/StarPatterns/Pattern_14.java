package StarPatterns;

public class Pattern_14 {
	
	public static void main(String[] args)
	{
		
		int irange = 9;
		int jrange = 5;
		
		for(int i = 0 ; i < irange ; i++)
		{
			for (int j = 0; j < jrange; j++) 
			{
				if(j-i>=0 || j+i>=8)
					System.out.print("* ");
				else
					System.out.print(" ");
					
			}
			System.out.println();
		}
	}

}

//output-

/*

* * * * * 
 * * * * 
  * * * 
   * * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

 */
