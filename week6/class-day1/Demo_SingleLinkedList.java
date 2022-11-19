package week7.class_day1;

import org.junit.Test;

public class Demo_SingleLinkedList {
	
	@Test
	public void example1()
	{
		SingleLinkedList sl1=new SingleLinkedList();
		sl1.add(4);
		sl1.add(6);
		sl1.insertAtBegining(1);
		sl1.print();
		System.out.println(sl1.get(2));
		sl1.set(2, 5);
		sl1.removeFirst();
		sl1.remove(3);
		sl1.print();
		
	}

}
