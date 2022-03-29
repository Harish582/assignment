package com.one.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Long> hashMap = new HashMap<>();
		hashMap.put("Harish", 6383498688l);
		hashMap.put("Naveen", 9514467577l);
		hashMap.put("mohan", 6383868954l);
		
		Set<Entry<String, Long>> entrySet = hashMap.entrySet();
		Iterator<Entry<String, Long>> iterator = entrySet.iterator();
	//	Iterator<String> iterator2 = keySet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("===========================");
		Set<String> keySet = hashMap.keySet();
		for(String name:keySet)
		{
			System.out.println(name+"===== "+hashMap.get(name));
		}
		
	}/

}
