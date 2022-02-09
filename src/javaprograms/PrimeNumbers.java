package javaprograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int limit = 10;
		
		boolean flag = false;
		
		for(int i=2; i<=limit; i++)  // i=2, i = 3, i=4 
		{
			flag = false;
			for(int j=2;j<i;j++)  // j=2, 2<4 
			{
				if(i%j==0) //3%2 == 0  //4%2 ==0 (true) 
				{
					flag = true;
					break;
				}
			}
			
			if(flag==false)
			{
				System.out.println(i);
			}
		}

	}

}
