package javaprograms;

public class CountOfCharacters {
	
	public static void main(String args[])
	{
		String s="vijjjayyyyy";
		
		String s1="";
		
		int count=1;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					if(s1.indexOf(s.charAt(i))==-1)  //v = 2 , i = 1 , s = 2, h = 2,//v-1
					{
						count++;
					}
					
				}
			}
			
			if(s1.indexOf(s.charAt(i))==-1)
			{
				System.out.println(s.charAt(i)+"-"+count);
			}
			
			s1=s1+s.charAt(i); //v,i,s,h,v
			count=1;
		}
	}
	
}
