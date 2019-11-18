package week1.task.javapgms;

public class CheckPalindrome {
	
	public static void main(String args[])
	{
		String s="Level";
		String s1="";
		
		char[] charArray = s.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			s1=s1+charArray[i];
		}
		
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println(s+" is a palindrome");
		}
		else
		{
			System.out.println(s+" is not a palindrome");
		}
	}

}
