package javaprograms;

public class PrimeOrNot {
	
	public static void main(String args[])
	{
		int input = 180; // 2 to input/2  //2 to 65
		
		boolean flag = false;
		
		for(int i=2;i<=input/2;i++)
		{
			System.out.println(i);
			if(input%i==0)
			{
				flag= true;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println(input+" is not a prime number");
		}
		else
		{
			System.out.println(input+" is a prime number");
		}
	}

}
