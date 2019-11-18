package week1.task.javapgms;

public class SumOf100OddNumbers {
	
	public static void main(String args[])
	{
		int c=0;
		for(int i=0;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				c=c+i;
			}
		}
		
		System.out.println("Sum of first 100 odd values are "+c);
	}

}
