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

}
