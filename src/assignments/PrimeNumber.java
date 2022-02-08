package assignments;

public class PrimeNumber {
	
	//To find whether a number is a Prime number or not
	
	public static void main(String args[])
	{
		int n = 12; //a number is divisble by 1 & itself // 1,13
		//boolean flag = true;
		int count = 1;
		
		for(int i=2;i<n;i++) //2,3,4,....,12
		{
			if(n%i==0) //if a number is divisible by another number, then % = 0 then %=some reminder value 
			{
				//flag = false;
				count=count+1;  //2,3,4
			}
		}
		
		if(count==1)
		{
			System.out.println("Given number is a prime number");
		}
		else
		{
			System.out.println("Given number is not a prime number");
		}
		
		/*if(flag == true)
		{
			System.out.println("Given number is a prime number");
		}
		
		else
		{
			System.out.println("Given number is not a prime number");
		}*/
		
		
	}

}
