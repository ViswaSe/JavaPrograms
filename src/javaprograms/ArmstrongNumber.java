package javaprograms;

public class ArmstrongNumber {
	
	public static void main(String args[])
	{
		int n = 1634; int input=n;
		int count=0;
		int n1=n;  //153 //0 
		
		while(n1>0)
		{
			n1=n1/10; //153 //15 //1 
			count++;
		}
		
		System.out.println(count);
		int temp;
		int result; int sumValue=0;
		
		for(int i=0;i<count;i++)   
		{
			temp=n%10; //4 //3 //6 //1 
			result=1;
			
			for(int j=0;j<count;j++)  //Nested for loop
			{
				result=result*temp; //1*4=4, 4*4 = 16, 16*4=64,64*4=216;
			}
			sumValue=sumValue+result;
			n=n/10;  //153 //15 //1 
		}
		
		System.out.println(sumValue);
		
		if(sumValue==input)
		{
			System.out.println("Given number is an armstrong number");
		}
		else
		{
			System.out.println("Given number is not an armstrong number");
		}
	}

}
