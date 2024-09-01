package PROBLEM;

public class Exercise1 {
	static public void main(String arg[])
	{
		int l=2;
		int n=5;
		switch(l) {
			case 1:
				System.out.println("Out :"+recursion(n));
				break;
			case 2:
				System.out.println("Out :"+(n+recursion(n-1)));
				break;
		}
	}

	private static int recursion(int n) {
		// TODO Auto-generated method stub
		System.out.print(n+" ");
		if(n==1 )
			return 1;
		else if(n==-1)
			return -1;
		return n+recursion((n<0)?-1-n:1-n);
	}
}
