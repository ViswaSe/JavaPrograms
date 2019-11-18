package day1;

public class FindPrimeOrNot {

	public static void main(String[] args) {
		
		int a=11;
		
		boolean result=true;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				result=false;
			}
		}
		
		if(result)
		{
			System.out.println(a+" is a prime number");
		}
		else
		{
			System.out.println(a+" is not a prime number");
		}
	}
}
