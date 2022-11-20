package week7.class_day1;

public class SingleLinkedList {
	Node head,tail;
	int length=0;
	
	public void add(int val)
	{
		Node newnode =new Node(val);
		if(head==null)
		{
			tail=head=newnode;
		}else
		{
			tail.next=newnode;
			tail=newnode;
		}
		length++;
	}
	
	public void insertAtBegining(int val)
	{
		Node newnode =new Node(val);
		if(head==null) // list empty
		{
			head=newnode;
		}else
		{
		 newnode.next=head;
		head =newnode;
		}
		length++;	
		
	}
	
	public int get(int index)
	{
		if(index > length) return 0;
		Node temp=head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		
		return temp.value;
	}
	
	
	public void set(int pos,int val)
	{
		  if(pos > length) return;
		Node temp =head;
	    for(int i=1;i<pos;i++)
	    {
	    	temp=temp.next;
	    }
		temp.value=val;
		
		
	}
	public void removeFirst()
	{
		Node temp=head;
		head=temp.next;
		
	}
	
	public void remove(int index)
	{
		 if(index >length) return;
		
		Node temp=head;
		for(int i=1;i<index-1;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		
	}
	
	public void print()
	{
	  Node newnode =head;
	  while(newnode!=null)
	  {
		  System.out.print(newnode.value + " ");
		  newnode=newnode.next;
	  }
	  
	}
	
	public int indexOf(int val)
	{
		Node newnode =head;
		int count=0;
		while(newnode!=null)
		{
			if(newnode.value==val) {return count;}
				count++;
				newnode=newnode.next;
		}
		
		return -1;
	}
	
	
	public int lastindexOf(int val)
	{
		Node newnode =head;
		int count=0;
		int lastcnt=-1;
		while(newnode!=null)
		{
			if(newnode.value==val) {lastcnt=count;}
				count++;
				newnode=newnode.next;
		}
		
		return lastcnt;
	}
	
	public void removeFirstIndex()
	{
		Node temp=head;
		head=temp.next;
		length--;
	}
	
	public void removeLastIndex()
	{
		remove(length);
		
	}
	
	public void addFirst(int val)
	{
		insertAtBegining(val);
	}

}
