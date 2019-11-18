package week3.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortReverseOrder {
	
	public static void main(String args[])
	{
		String s[]= {"HCL","CTS","AspireSystems"};
		
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<s.length;i++)
		{
			list.add(s[i]);
		}
		
		
		Collections.reverse(list);
		
		System.out.println("Reverse order of list is: ");
		
		for(String each:list)
		{
			System.out.println(each);
		}
	}

}
