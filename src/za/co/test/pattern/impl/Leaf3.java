package za.co.test.pattern.impl;

import za.co.test.pattern.intf.CompositeInterface;

public class Leaf3 implements CompositeInterface{

	@Override
	public void doSomething() {	
		System.out.println(this.getClass().getName());
	}

	
}
