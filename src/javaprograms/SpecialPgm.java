package javaprograms;

public class SpecialPgm {
	
	public static void main(String args[])
	{
		//String[] s= {"c","c++","python","ruby","java"}; //C.C.P.R.JAVA
		
		String[] s= {".net","C#","java"};
		
		String s1="";
		
		for(int i=0;i<s.length;i++)
		{
			if(i!=s.length-1)
			{
				s1=s1+s[i].charAt(0)+".";  //C. //C.C //C.C.P //C.C.P.R 
			}
			else
			{
				s1=s1+s[i];   //C.C.P.R.JAVA
			}
		}
		
		System.out.println(s1.toUpperCase());
		
	}
}
