package week7.class_day1;

import org.junit.Test;

public class Demo_SingleLinkedList {
	
	@Test
	public void example1()
	{
		SingleLinkedList sl1=new SingleLinkedList();
		sl1.add(4);
		sl1.add(9);
		sl1.add(6);
		sl1.add(4);
		sl1.add(8);
		sl1.insertAtBegining(1);

		System.out.println(sl1.get(2));
		sl1.set(1, 5);
	//	sl1.removeFirst();
		//sl1.remove(3);
		sl1.print();
		System.out.println("Indexof="+sl1.indexOf(5));
		System.out.println("Last index="+sl1.lastindexOf(4));
		//sl1.print();
		
		int[] input= {19,18,16,16,16,10,23};
		sl1.addAll(input);
		sl1.removeAll(16);
		sl1.print();
		
	}

}
