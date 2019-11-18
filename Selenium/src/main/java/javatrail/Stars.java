package javatrail;

public class Stars {
	
	public static void main(String args[])
	{
		int n=10;
		
		/*for(int i=n/2;i>0;i--)
		{
			for(int j=n/2;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<n/2;i++)
		{
			for(int j=i;j<n/2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-i;j++)
			{
				System.out.print("*"+" ");
			}
		
			System.out.println();
		}
		
	}

}
