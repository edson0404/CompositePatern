package za.co.test.pattern.main;

import za.co.test.pattern.impl.CompositeImpl;
import za.co.test.pattern.impl.Leaf1;
import za.co.test.pattern.impl.Leaf2;
import za.co.test.pattern.impl.Leaf3;
import za.co.test.pattern.intf.CompositeInterface;

public class Application {
	
	public static void main(String[] args) {
		
		
		//Should reference the CompositeInterface??? Dunno why though	
		CompositeImpl compositeImpl = new CompositeImpl();
		
		CompositeInterface leaf1 = new Leaf1();
		CompositeInterface leaf2 = new Leaf2();
		CompositeInterface leaf3 = new Leaf3();
		
		compositeImpl.addLeaf("Node 1", leaf1);
		compositeImpl.addLeaf("Node 1", leaf2);
		compositeImpl.addLeaf("Node 1", leaf3);
		
		compositeImpl.addLeaf("Node 2", leaf1);
		compositeImpl.addLeaf("Node 2", leaf2);
		compositeImpl.addLeaf("Node 2", leaf3);
		
		compositeImpl.addLeaf("Node 3", leaf2);
		compositeImpl.addLeaf("Node 3", leaf3);
		compositeImpl.addLeaf("Node 3", leaf1);
		
		compositeImpl.doSomething();
		
		
		
		
		
		
	}

}
