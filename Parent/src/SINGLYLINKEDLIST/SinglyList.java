package SINGLYLINKEDLIST;


public class SinglyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singly ds=new Singly();
		ds.insertBegin(3);
		ds.insertBegin(22);
		ds.insertBegin(1);
		ds.insertEnd(4);
		ds.insertMiddle(2, 2);
		ds.deletMiddle(1);
		ds.display();
	}

}
