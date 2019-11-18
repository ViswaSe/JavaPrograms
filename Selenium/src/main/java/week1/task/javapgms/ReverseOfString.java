package week1.task.javapgms;

public class ReverseOfString {

	public static void main(String[] args) {
		
		String s="I am a Software tester";
		
		String[] sp=s.split(" ");
		
		String s1="";
		
		for(int i=0;i<sp.length;i++)
		{
			if(i%2==0)
			{
				s1=s1+sp[i]+" ";
			}
			else
			{
				s1=s1+reverse(sp[i])+" ";
			}
		}
		
		System.out.println(s1.trim());
		
	}
	
	public static String reverse(String s)
	{	
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		
		return s1;
	}

}
