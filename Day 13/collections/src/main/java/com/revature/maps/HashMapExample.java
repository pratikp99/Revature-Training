package com.revature.maps;
import java.util.*;

public class HashMapExample {
	public static void main(String args[])
	{
		HashMap<String,Double> bal=new HashMap<String,Double>();
		bal.put("Pratik", 9914.0);
		bal.put("Snehal", 5078.25);
		bal.put("Prasad", 4962.58);
		bal.put("Manas", 5965.59);
		System.out.println(bal.get("Pratik"));
		
		Set<String> keys=bal.keySet();
		for(String s:keys)
		{
			System.out.println(s+" : "+ bal.get(s));
		}
		
		
	}
}
