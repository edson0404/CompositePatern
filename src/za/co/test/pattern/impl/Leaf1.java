package za.co.test.pattern.impl;

import za.co.test.pattern.intf.CompositeInterface;

public class Leaf1 implements CompositeInterface {

	@Override
	public void doSomething() {
		//Functionality
		System.out.println(this.getClass().getName());
	}

}
