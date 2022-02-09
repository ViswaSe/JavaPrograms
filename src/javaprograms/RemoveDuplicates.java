package javaprograms;

public class RemoveDuplicates {
	
	public static void main(String args[])
	{
		String s = "vishveshwar";  //abcedf
		
		String s1="";
		
		//2 ways -> 1. using charAt(int index) method, 2. using indexOf() method
		
		for(int i=0;i<s.length();i++)   //i=0,  i=1 , i =2 
		{
			for(int j=i+1;j<=s.length();j++) //j=1 to 11 , j=2 to 11, j=3 to 11
			{
				/*if(!(s1.contains(""+s.charAt(i))))
				{
					s1=s1+s.charAt(i); //v i s h e w a r
				}*/
				
				if(s1.indexOf(s.charAt(i))==-1)
					s1=s1+s.charAt(i);
			}
		}
		
		System.out.println(s1);
		
	}

}
