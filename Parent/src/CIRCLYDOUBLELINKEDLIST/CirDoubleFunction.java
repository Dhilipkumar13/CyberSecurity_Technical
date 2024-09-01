package CIRCLYDOUBLELINKEDLIST;

public class CirDoubleFunction {
	Node head;
	Node tail;
	private static int length=0;
	class Node{
		int data;
		Node next;
		Node pre;
		
		Node(int data)
		{
			this.data=data;
		}
	}

	public void insertBegin(int value) {
		// TODO Auto-generated method stub
		Node nnode=new Node(value);
		length++;
		if(head == null)
		{
			head=nnode;
			tail=nnode;
		}
		else
		{
			tail.next=nnode;
			nnode.pre=tail;
			nnode.next=head;
			head.pre=nnode;
			head=nnode;
		}
		
	}

	public void insertEnd(int value) {
		// TODO Auto-generated method stub
		Node nnode=new Node(value);
		length++;
		if(head == null)
		{
			nnode=tail=head;
		}
		else
		{
			tail.next=nnode;
			nnode.pre=tail;
			nnode.next=head;
			head.pre=nnode;
			tail=nnode;
		}
	}

	public void insertMiddle(int value, int pos) {
		// TODO Auto-generated method stub
		if(length<pos || pos<0)
			System.out.print("Enter value btw :"+ length);
		else
		{
			if(pos == 1)
			{
				insertBegin(value);
			}
			else if(pos == length)
			{
				insertEnd(value);
			}
			else
			{
				Node nnode = new Node(value);
				
				Node temp = head;
				int count=2;
				while(count<pos)
				{
					temp=temp.next;
				}
				Node cur=temp.next;
				temp.next=nnode;
				nnode.pre=temp;
				nnode.next=cur;
				cur.pre=nnode;
			}
		}
	}

	public void deletMiddle(int pos) {
		// TODO Auto-generated method stub
		 {
			if(pos==1)
				deletBegin();
			else if(pos==length)
				deletEnd();
			else if(length>pos || pos>0){
				Node temp=head;
				length--;
				int count=1;
				while(count<pos)
				{
					temp=temp.next;
					count++;
				}
				Node cur=temp.pre;
				cur.next=temp.next;
				temp.next.pre=cur;
				temp.next=null;
				temp.pre=null;
			}
		}
		
	}

	private void deletEnd() {
		// TODO Auto-generated method stub
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			Node temp=tail.pre;
			temp.next=head;
			head.pre=temp;
			tail.next=null;
			tail.pre=null;
			tail=temp;
		}
	}

	private void deletBegin() {
		// TODO Auto-generated method stub
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			Node temp=head.next;
			tail.next=temp;
			temp.pre=tail;
			head.next=null;
			head.pre=null;
			head=temp;
		}
	}

	public void search(int i) {
		// TODO Auto-generated method stub
		
	}

	public void display() {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=tail)
		{
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}
		System.out.print(tail.data);
	}

	public void length() {
		// TODO Auto-generated method stub
		
	}

	public void reverse() {
		// TODO Auto-generated method stub
		
	}

}
