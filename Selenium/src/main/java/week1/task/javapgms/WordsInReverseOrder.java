package week1.task.javapgms;

public class WordsInReverseOrder {
	
	public static void main(String args[])
	{
		String s="Welcome to Testleaf Chennai";
		String s1="";
		
		String[] temp=s.split(" ");
		
		for(int i=temp.length-1;i>=0;i--)
		{
			s1=s1.concat(temp[i]);
			s1=s1+" ";				
		}
		
		System.out.println(s1.trim());
		
	}

}
