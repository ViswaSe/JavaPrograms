package javaprograms;

public class IntegerPalindrome {

	public static void main(String args[])
	{
		int i = 85742;  //343 -> palindrome //187 - not a palindrome
		int temp=0;
		
		int originalInput = i;
		
		while(i>0)   //343>0 //34>0 //3>0
		{
			temp = temp*10;  //0 //30 //340
			
			temp=temp+(i%10);  //3 //30+4=34 //340+3=343 
			
			i=i/10; //i=34 //i=3 //i=0
		}
		
		System.out.println(temp);
		
		if(temp==originalInput)
		{
			System.out.println("Number is a Palindrome");
		}
		
		else
		{
			System.out.println("Number is not a palindrome");
		}
		
	}
	
}
