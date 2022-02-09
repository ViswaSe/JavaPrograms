package javaprograms;

public class StarPgm_2 {

	public static void main(String args[])
	{
		int n=12;

		for(int i=0;i<=n/2;i++) //i=0 i=1, i=2 ... i=4 
		{
			for(int j=0;j<=i;j++) //j=0, j=0,1 j=0,1,2
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n/2;i++) //i=0, i=1 
		{
			for(int j=n/2;j>i;j--) //j=6,5,4,3,2,1 j=6,5,4,3,2
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}	
	}
}
