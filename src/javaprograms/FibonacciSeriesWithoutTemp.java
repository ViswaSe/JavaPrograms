package javaprograms;

public class FibonacciSeriesWithoutTemp {

	public static void main(String args[])
	{
		int n1=-1;
		int n2=1;
		
		int limit = 10;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=0;i<limit-2;i++)  //-1 //1 (0)  ==> -1 1 0
		{
			n2=n1+n2; //0
			
			System.out.println(n2);  //0
			
			n1=n2-n1;  //0-(-1) = 1	
		}
	}
}
