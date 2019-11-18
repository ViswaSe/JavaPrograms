package week3.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecondMostRepeatChar {
	
	public static void main(String args[])
	{
		String s="PayPal India";
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		Set<Integer> set=new LinkedHashSet<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		
		int count;
		
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				count=map.get(s.charAt(i));
				map.put(s.charAt(i),(count+1));
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(map);
		
		for(Entry<Character, Integer> eachSet:map.entrySet())
		{
			set.add(eachSet.getValue());
		}
		
		System.out.println(set);
		list.addAll(set);
		Collections.sort(list);
		
		int secondMax=list.get(list.size()-1);
		
		for(Entry<Character, Integer> eachSet:map.entrySet())
		{
			if(eachSet.getValue()==secondMax)
			{
				System.out.println(eachSet.getKey());
			}
		}
		
	}

}
