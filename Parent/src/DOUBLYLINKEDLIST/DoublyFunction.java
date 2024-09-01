package DOUBLYLINKEDLIST;

public class DoublyFunction {
	Node head;
	Node tail;
	static int len;
	
	class Node{
		int data;
		Node pre;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}

	public void insertBegin(int value) {
		// TODO Auto-generated method stub
		Node nnode=new Node(value);
		len++;
		if(head==null)
		{
			head=nnode;
			tail=nnode;
		}
		else
		{
			nnode.next=head;
			head.pre=nnode;
			head=nnode;
		}
	}

	public void insertEnd(int value) {
		// TODO Auto-generated method stub
		Node nnode=new Node(value);
		len++;
		if(head==null)
		{
			head=nnode;
			tail=nnode;
		}
		else
		{
			
			tail.next=nnode;
			nnode.pre=tail;
			tail=nnode;
		}
	}

	public void insertMiddle(int value, int pos) {
		// TODO Auto-generated method stub
		if(len<0 || len<pos)
		{
			System.out.println("Enter postion between :"+ len);
		}
		else
		{
			Node nnode=new Node(value);
			if(pos==1)
			{
				insertBegin(value);
			}
			else if(pos==len)
			{
				insertEnd(value);
			}
			else {
				len++;
			int count=2;
			Node temp=head;
			while(count<pos)
			{
				temp=temp.next;
				count++;
			}
			Node cur=temp.next;
			temp.next=nnode;
			nnode.next=cur;
			nnode.pre=temp;
			cur.pre=nnode;
			}
		}
	}

	public void DeletMiddle(int pos) {
		// TODO Auto-generated method stub
		if(pos<1 || pos>len)
		{
			System.out.print("Enter Valid input btw:"+len);
			System.out.println();
		}
		else
		{
			if(pos==1)
			{
				deletBegin();
			}
			else if(len==pos)
			{
				deletEnd();
			}
			else
			{
				len--;
				Node temp=head;
				int count=2;
				while(count<pos)
				{
					temp=temp.next;
					count++;
				}
				Node cur=temp.next.next;
				temp.next=cur;
				cur.pre=temp;
				
			}
		}
	}

	private void deletEnd() {
		// TODO Auto-generated method stub
		if(head==null)
		{
			System.out.println("Delet is not possible");
		}
		else{
		len--;
		Node temp=tail.pre;
		temp.next=null;
		tail.pre=null;
		tail=temp;
		}
	}

	private void deletBegin() {
		// TODO Auto-generated method stub
		if(head==null)
		{
			System.out.println("Delet is not possible");
		}
		else{
			len--;
			Node temp=head.next;
			temp.pre=null;
			head.next=null;
			head=temp;
		}		
	}

	public void display() {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}
		//System.out.print("length:"+len);
	}

	public void length() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.print("Length of the List :" +len);
	}

	public void reverse() {
		// TODO Auto-generated method stub
		
		Node cur=tail;
		tail=head;
		Node npre=null;
		Node temp=head;
		while(temp!=null)
		{
			Node nnext=temp.next;
			temp.pre=nnext;
			temp.next=npre;
			npre=temp;
			temp=nnext;
		}
		head=cur;		
	}

	public void search(int pos) {
		// TODO Auto-generated method stub
		if(pos<1 || pos>len)
		{
			System.out.print("Enter Valid input btw:"+len);
			System.out.println();
		}
		else
		{
			if(pos==1)
			{
				System.out.print(head.data);
			}
			else if(len==pos)
			{
				System.out.print(tail.data);
			}
			else
			{
				len--;
				Node temp=head;
				int count=1;
				while(count<pos)
				{
					temp=temp.next;
					count++;
				}
				System.out.print(temp.data);
			}
		}
	}

}
