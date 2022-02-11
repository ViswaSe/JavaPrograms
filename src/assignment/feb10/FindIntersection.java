package assignment.feb10;

public class FindIntersection {
	
	public static void main(String args[])
	{
		int a[] = {1,3,4,5,9,8};
		int b[] = {2,4,8,6,10};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(b[j]);
					break;
				}
			}
		}
	}

}
