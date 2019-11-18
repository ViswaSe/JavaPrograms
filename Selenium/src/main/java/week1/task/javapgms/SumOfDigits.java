package week1.task.javapgms;

public class SumOfDigits {
	
	public static void main(String args[])
	{
		int a=12345;
		
		int count=0;
		
		while(a>0)
		{
			int rem=a%10;
			int qu=a/10;
			count=count+rem;
			a=qu;
		}
		
		System.out.println(count);
	}

}
