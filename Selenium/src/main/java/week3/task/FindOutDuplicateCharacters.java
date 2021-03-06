package week3.task;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindOutDuplicateCharacters {

	public static void main(String[] args) {
		
		String s="Infosys Limited";
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		int count;
		
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				count=map.get(s.charAt(i));
				map.put(s.charAt(i), count+1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(map);
		
		int temp;
		System.out.println("Duplicate Characters are: ");
		for(Entry<Character,Integer> eachSet:map.entrySet())
		{
			temp=eachSet.getValue();
			if(temp>1)
			{
				System.out.println(eachSet.getKey());
			}
		}

	}

}
