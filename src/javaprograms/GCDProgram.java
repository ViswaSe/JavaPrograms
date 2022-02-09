package javaprograms;

public class GCDProgram {
	
	public static void main(String args[])
	{
		int num1=105;  //1,5,15,105
		int num2=225;  //1,5,15,25,225
		
		int limit;
		
		if(num1<num2)
			limit=num1;
		else
			limit=num2;
		
		int gcd=0;
		
		for(int i=2;i<=limit;i++)  //i=2,i=3,i=4,i=5,i=6...i<=24
		{
			if(num1%i==0 && num2%i==0)  //54%5!=0 && 24%3==0 
			{
				gcd=i;  //gcd=6,gcd=100
			}
		}
		
		System.out.println(gcd);
		
		
	}
	

}
