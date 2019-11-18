package week1.task.javapgms;

public class FibbonacciSeries {
	
	public static void main(String args[])
	{
		int a =-1,b = 1;
		int c;
		
		for(int i =0;i<20;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;b=c;
		}
	}

}
