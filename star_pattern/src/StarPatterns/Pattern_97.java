package StarPatterns;

public class Pattern_97 {

	public static void main(String[] args)
	{
		int irange = 5;
		int jrange = 9;
		
		for (int i = 0; i < irange; i++) 
		{
		 for (int j = 0; j < jrange; j++) 
		 {
			if(j-i==0 || j+i==8 || i==0)
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

*********
 *     * 
  *   *  
   * *   
    *   

 */
 
