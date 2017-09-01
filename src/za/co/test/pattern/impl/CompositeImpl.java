package za.co.test.pattern.impl;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import za.co.test.pattern.intf.CompositeInterface;

public class CompositeImpl implements CompositeInterface {
	
	Multimap<String, CompositeInterface> map = ArrayListMultimap.create();
	
	@Override
	public void doSomething() {
		
		for(String key : map.keySet()) {
			
			System.out.println("Key = " + key);
			for (CompositeInterface compositeInterface : map.get(key)) {
					compositeInterface.doSomething();
			}
		}
	}
	
	public void addLeaf(String key, CompositeInterface leaf) {
		map.put(key, leaf);
	}

}
