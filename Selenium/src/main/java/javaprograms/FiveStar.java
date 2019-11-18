package javaprograms;

public class FiveStar {
	
	public static void main(String args[])
	{
		int input=5;
		
		for(int i=0;i<input;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
