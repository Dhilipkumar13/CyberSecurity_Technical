package Array;

import java.util.Scanner;

public class NaturalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(sum(sc.nextInt()));
	}
	static int sum(int n)
	{
		if(n==1)
			return 1;
		return n+sum(n-1);
	}

}
