package pattern;

public class Pattern4 {

	public static void main(String[] args) {
		int n=5;
		   int k = 1;
		   for(int i=0; i<n; i++)
		   {
	           for(int j=0; j<(i*2)+1; j++)
	           {
	        	   if (j%2==0) 
	        	   {
					System.out.print(k);
					k--;
				   }
	        	   else
	        	   {
	        		   System.out.print("*");
	        	   }
	           }
	           System.out.println();
	           k=i+2;
		   }
	}

}
