package javaprograms;

public class StringPalindrome {
	
		public static void main(String args[])
		{
			String s ="Vishveshwar";  //s.length()=5, 
			String s1="";
			//4 3 2 1 0
			
			for(int i=s.length()-1;i>=0;i--) //reverse for loop 
			{
				s1=s1+s.charAt(i);
			}
			
			System.out.println(s1);
			
			if(s.equals(s1))
			{
				System.out.println("Given word is a palindrome");
			}
			else
			{
				System.out.println("Given word is not a palindrome");
			}
			
		}
}
