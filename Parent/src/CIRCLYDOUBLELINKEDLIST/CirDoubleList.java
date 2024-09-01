package CIRCLYDOUBLELINKEDLIST;
import java.util.*;

public class CirDoubleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CirDoubleFunction dl=new CirDoubleFunction();
		dl.insertBegin(2);
		dl.insertEnd(5);
		dl.insertMiddle(4,1);
		dl.insertMiddle(16, 1);
		dl.insertMiddle(7, 4);
		dl.display();
		System.out.println();
		dl.deletMiddle(2);
		//System.out.println("du");
//		System.out.println();
//		dl.reverse();
//		dl.search(0);
//	//	System.out.println();
		dl.display();
//		dl.length();
	}

}
