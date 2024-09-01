package DOUBLYLINKEDLIST;

public class DoublyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyFunction dl=new DoublyFunction();
		dl.insertBegin(2);
		dl.insertEnd(5);
		dl.insertMiddle(4,2);
		dl.insertMiddle(16, 1);
		dl.insertMiddle(7, 4);
		dl.display();
//		System.out.println();
//		dl.DeletMiddle(4);
		System.out.println();
	//	dl.reverse();
		dl.search(0);
		System.out.println();
		dl.display();
		dl.length();
		
	}


}
