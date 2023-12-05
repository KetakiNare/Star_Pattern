package StarPatterns;

public class Pattern_96 {

	public static void main(String[] args) 
	{
		int irange = 9;
		int jrange = 9;
		
		for (int i = 0; i < irange; i++) 
		{
		 for (int j = 0; j < jrange; j++) 
		 {
			if(j+i==4 || i==4 || j-i==4)
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

    *    
   * *   
  *   *  
 *     * 
*********

 */