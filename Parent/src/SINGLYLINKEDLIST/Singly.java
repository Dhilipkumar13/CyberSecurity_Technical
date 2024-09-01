package SINGLYLINKEDLIST;

class Singly{
	Node head;
	static int len;
	class Node{
		int data;
		Node next;
		Node (int data)
		{
			this.data=data;
		}
	}
	
	void insertBegin(int val){
		Node nnode=new Node(val);
		len++;
		if(head==null)
		{
			head=nnode;
		}
		else
		{
			Node temp=head;
			head=nnode;
			head.next=temp;
		}
	}
	void insertEnd(int val)
	{
		Node nnode=new Node(val);
		len++;
		if(head==null)
		{
			head=nnode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=nnode;
		}
	}
	
	void insertMiddle(int val,int pos)
	{
		
		if(pos<0 || pos>len)
		{
			System.out.println("Enter valid input between: "+ len);
		}
		Node nnode=new Node(val);
		len++;
		if(pos==1)
		{ 
			insertBegin(val);
		}
		else{
		
			Node temp=head;
			int count=0;
			while(count<pos-2)
			{
				temp=temp.next;
				count++;
			}
			nnode.next=temp.next;
			temp.next=nnode;
		}
				
	}
	
	void deletMiddle(int pos)
	{
		if(pos<1 || pos>len)
		{
			System.out.println("Enter valid input between: "+ len);
		}
		Node temp=head;
		len--;
		if(pos==1)
		{
			head=head.next;
		}
		else {
		for(int i=0;i<pos-1;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		}
	}
	
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
}
