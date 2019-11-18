package javaprograms;

public class Colourful {

	public static void main(String args[])
	{
		String s="Vishveshwar";
		
		int temp=s.length()-1;
		int var=0;
		int count=0;
		
		//To print the first 4 characters
		
		for(int i=0;i<(s.length())/2;i++)
		{	
			for(int j=0;j<1;j++)
			{
				System.out.print(s.charAt(i));
			}
			for(int k=0;k<temp-1;k++)
			{
				System.out.print(" ");
			}
			for(int l=0;l<1;l++)
			{
				System.out.print(s.charAt(i));
			}
			
			temp=temp-2;
			System.out.println();
			
			for(int m=0;m<=i;m++)
			{
				System.out.print(" ");
			}
			count++;
		}
		
		var=temp;
		
		//To print the middle character
		
		temp=s.length()-1;
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(count));
			}
			
			for(int j=0;j<temp;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		//To print the last 4 characters
		
		var=1;
		
		temp=s.length()/2;
		
		for(int i=0;i<(s.length()/2);i++)
		{
			for(int n=temp-1;n>0;n--)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<1;k++)
			{
				System.out.print(s.charAt(++count));
			}
			
			for(int j=0;j<var;j++)
			{
				System.out.print(" ");
			}
			
			for(int m=0;m<1;m++)
			{
				System.out.print(s.charAt(count));
			}
			
			var=var+2;
			temp--;
			System.out.println();
			
		}
		

	}

}
