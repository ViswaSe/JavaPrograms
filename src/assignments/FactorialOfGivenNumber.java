package assignments;

public class FactorialOfGivenNumber {
	
	public static void main(String args[])
	{
		//Find the Factorial of a given number
		// 5! = 5*4*3*2*1
		//20! = 20*19....*2*1 || 1*2*...*19*20
		
		int n = 14;
		long result=1l;
		
		//backward loop
		for(int i=n;i>=1;i--)
		{
			result=result*i; //1*19=19; 19*18=324; 324*17=5508; .....
		}
		
		System.out.println("Factorial of the given number: "+ result);
				
		/*//forward loop
		for(int i=1;i<=n;i++)
		{
			result=result*i; //1*1=1,result=1 ; 1*2=2,result=2; 2*3=6, result=6; 6*4=24, result=24; 24*5....
		}
		
		System.out.println("Factorial of the given number is: "+result);*/
	}

}
