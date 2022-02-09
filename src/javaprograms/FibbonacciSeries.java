package javaprograms;

public class FibbonacciSeries {
	
	public static void main(String args[])
	{
		int n1=2;
		int n2=3;
		
		int n3;
		
		int limit = 10; 
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=0;i<limit-2;i++)  //n1=2, n2=3
		{
			n3=n1+n2;	 //n3=5, n3=8, n3=13
			System.out.println(n3);
			
			n1=n2;   //n1=3  //n1=5 //n1=8
			n2=n3;   //n2=5  //n2=8 //n2=13
			
		}
	}
	

}
