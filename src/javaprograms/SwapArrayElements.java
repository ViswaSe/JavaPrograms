package javaprograms;

public class SwapArrayElements {
	
	public static void main(String args[])
	{
		//int[] a = {10,50,30,40,20};
		
		int[] a = {24,45,99,61,72};
		
		//10==> 50,30,40,20
		
		int temp;
		
		for(int i=0;i<a.length;i++)  //10 //20 //30 //40 //50
		{
			for(int j=i+1;j<a.length;j++)   // 50,30,40,20 // 50,40,30 //50,40 //50
			{
				if(a[i]>a[j])  //50 > 30  //30>20
				{
					temp=a[i];
					a[i]=a[j]; 
					a[j]=temp;
				}   
				
				//10 20 50 40 30 (i=1)
				//10 20 30 50 40 (i=2) 
				//10 20 30 40 50 (i=3)
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
