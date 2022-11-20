package week7.class_day1;

public class DoublyLinkedList {
	
	Node head,tail;
	int length;
	
	
	public void add(int val)
	{
		Node newnode=new Node(val);
		
		if(head==null)
		{
           tail=head=newnode;
          // newnode.prev=null;
           
		}else
		{
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
		}
		length++;
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
	
	public int get(int pos)
	{
		Node newnode =head;
		for(int i=1;i<pos;i++)
		{
			newnode=newnode.next;
		}
		
		return newnode.value;
		
	}
	
	public void set(int pos,int val)
	{
		  if(pos > length) return;

		Node newnode =head;
		for(int i=1;i<pos;i++)
		{
			newnode=newnode.next;
		}
		
		newnode.value=val;
	}
	
	public void removeFirst()
	{
		Node temp=head;
		head=temp.next;
		head.prev=null;
		length--;
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
		
		length--;
	}
	
	

}
