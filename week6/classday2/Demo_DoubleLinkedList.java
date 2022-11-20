package week7.class_day1;

import org.junit.Test;

public class Demo_DoubleLinkedList {
	
	
	@Test
	public void example1()
	{
		DoublyLinkedList dl1 =new DoublyLinkedList();
		dl1.add(2);
		dl1.add(3);
		dl1.add(5);
		
		dl1.set(2,9);
		System.out.println(dl1.get(2));
		dl1.remove(3);
		dl1.print();
		
	}

}
