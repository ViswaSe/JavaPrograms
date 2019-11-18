package javaprograms;

public class TenStars {

	public static void main(String args[])
	{
		int input=5;
		
		for(int i=0;i<input;i++)
		{
			for(int j=0;j<=i+1;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		for(int i=input-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
