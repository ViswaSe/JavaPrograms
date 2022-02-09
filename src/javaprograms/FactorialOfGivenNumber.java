package javaprograms;

import java.util.Scanner;

public class FactorialOfGivenNumber {
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int input = obj.nextInt();
		
		String s = obj.next();
		
		//nextInt() -> to get the integer as input
		//next()	-> to get the string as input
		
		//int n = 10;
		
		int temp=1;
		
		for(int i=1;i<=input;i++)
		{
			temp=temp*i;  // i=1, 1*1 = 1, temp=1 
							//i=2, 1*2 = 2,temp=2
							//i=3, 2*3 = 6, temp=6
		}
		
		System.out.println(temp);
		
		System.out.println(s);
	}
	

}
