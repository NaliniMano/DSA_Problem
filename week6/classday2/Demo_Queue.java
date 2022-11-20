package week7.class_day1;

import org.junit.Test;

public class Demo_Queue {
	
	@Test
	public void example()
	{
		//FIFO
		
		SingleLinkedList sl =new SingleLinkedList();
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		sl.add(5);
		sl.addFirst(9);
		sl.print();
		System.out.println("REmoving");
		sl.removeFirstIndex();
		sl.removeLastIndex();
		sl.print();
	}

}
