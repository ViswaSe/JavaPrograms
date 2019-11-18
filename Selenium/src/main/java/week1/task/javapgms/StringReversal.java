package week1.task.javapgms;

public class StringReversal {
	
	public static void main(String args[])
	{
		String s="TestLeaf";
		
		char[] ch=s.toCharArray();
		
		System.out.println("Using To char array method: ");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
			
		}
		
		System.out.println();
		
		System.out.println("Using charAt method: ");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
