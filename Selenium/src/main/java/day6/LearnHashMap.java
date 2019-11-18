package day6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnHashMap {
	
	public static void main(String args[])
	{
		String s="Aspire systems";
	
		Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		
		int count,keyCount;
		
		for(int i=0;i<s.length();i++)
		{
			count=1;
			
			if(map.containsKey(s.charAt(i)))
			{
				keyCount=map.get(s.charAt(i));
				keyCount++;
				map.put(s.charAt(i), keyCount);
			}
			else
			{
				map.put(s.charAt(i),count);
			}
		}
		
		for(Entry<Character, Integer> each:map.entrySet())
		{
			System.out.println(each.getKey()+"  =  "+each.getValue());
		}
	}

}
