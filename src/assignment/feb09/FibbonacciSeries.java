package assignment.feb09;

public class FibbonacciSeries {
	
	public static void main(String args[])
	{
		int a = -1;
		int b = 1;
		
		int result;
		
		int n = 10;
		
		for(int i=0;i<=n;i++)
		{
			result=a+b;
			a=b;
			b=result;
			System.out.println(result);
		}
	}
}
