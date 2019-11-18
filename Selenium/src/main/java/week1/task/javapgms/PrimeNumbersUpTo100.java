package week1.task.javapgms;

public class PrimeNumbersUpTo100 {
	
	public static void main(String args[])
	{
		int num=100;
		
		boolean primeFlag;
		
		for(int i=2;i<=num;i++)
		{
			primeFlag=true;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					primeFlag=false;
				}
			}
			
			if(primeFlag)
			{
				System.out.println(i);
			}
		}
	}

}
