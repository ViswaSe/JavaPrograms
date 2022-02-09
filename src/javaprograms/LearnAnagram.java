package javaprograms;

public class LearnAnagram {
	
	public static void main(String args[])
	{
		String s1 = "Viyjayyj";  //s1.length = 5 ,0<5,1<5,2<5...4<5
		String s2 = "yiaVjyyj";  // S -> a, S-> e, S-> l...
		
		String s3 = s2; 
		
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						//s3.replaceFirst(Character.toString(s1.charAt(i)), "");
						s3=s3.replaceFirst(""+s1.charAt(i), "");  //aelmS //elmS //elS //elS //eS //S //N....
						break;
					}
				}
			}
		}
		
		if(s3.length()==0)
		{
			System.out.println("Given words are anagram");
		}
		
		else
		{
			System.out.println("Given words are not an anagram");
		}
	}

}
