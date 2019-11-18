package week1.task.javapgms;

public class OddIndex {

	public static void main(String args[])
	{
		String s="changeme";
		String s1="";
		
		char[] ch=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				s1=s1+ch[i];
			}
			else
			{
				s1=s1+(ch[i]+"").toUpperCase();
			}
		}
		
		System.out.println(s1);
	}
	
}
