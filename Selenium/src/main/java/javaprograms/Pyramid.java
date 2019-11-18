package javaprograms;

public class Pyramid {

	public static void main(String[] args) {
		
		int input=10;
		
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

	}

}
