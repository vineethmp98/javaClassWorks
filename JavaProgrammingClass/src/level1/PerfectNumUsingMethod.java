package level1;

public class PerfectNumUsingMethod {
	
	public static void perfectOrNot(int num)
	{
		int sum=0;
		for (int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+" is a Perfect Number");
		}
		else
		{
			System.out.println(num+" is not a Perfect Number");
		}
	}

	public static void main(String[] args) {
	   perfectOrNot(28);
	   perfectOrNot(6);
	   perfectOrNot(16);
	}

}
