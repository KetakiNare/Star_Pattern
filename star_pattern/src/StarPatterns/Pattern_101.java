package StarPatterns;

public class Pattern_101 {

	public static void main(String[] args) 
	{
		int irange = 5;
		int jrange = 9;
		
		for (int i = 0; i < irange; i++) 
		{
		 for (int j = 0; j < jrange; j++) 
		 {
			if(i==4 && j<=4 || j+i==8 ||(i==0 && j>=4)|| j+i==4)
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

    *****
   *   * 
  *   *  
 *   *   
*****    

 */
