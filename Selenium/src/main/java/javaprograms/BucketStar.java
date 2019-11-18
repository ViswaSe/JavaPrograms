package javaprograms;

public class BucketStar {

	public static void main(String[] args) {

		int input=12;

		int temp=1;

		for(int i=0;i<input;i++)
		{
			for(int j=input-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<temp;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			temp=temp+2;
		}
		
		temp=(input*2)-1;
		
		for(int i=0;i<input;i++)
		{	
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<temp;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			temp=temp-2;
			
		}

	}

}
