package javaprograms;

public class LCMProgram {

	public static void main(String args[])
	{
		int num1 = 8;  //8 16 24 32 40 48 56 64 72 80
		int num2 = 10; // 9 18 27 36 45 54 63 72 80
		
		int result=1;
		int limit; 
		int temp;
		
		if(num1>num2)
		{
			limit = num1;
			temp=num2;
		}
			
		else
		{
			limit = num2; //limit=15
			temp=num1;  //temp = 12
		}
			
		
		for(int i=1;i<=limit;i++) //1 to 15
		{
			result=i*limit; //15 //2*15=30 //3*15=45 //4*15=60.....
			
			if(result%temp==0)  //15%12!=0 //30%12!=0 //45%12!=0 //60%12==0
			{
				System.out.println("LCM is: "+result);
				break;
			}
			
		}
		
	}
	
}
