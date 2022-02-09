package javaprograms;

public class StarPgmPart_1 {
	
	public static void main(String args[])
	{
		int n=8;
		
		for(int i=0;i<n;i++) //i=0 i=1, i=2 ... i=4 
		{
			for(int j=0;j<=i;j++) //j=0, j=0,1 j=0,1,2
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
