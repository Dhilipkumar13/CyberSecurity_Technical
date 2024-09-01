package Array;

import java.util.Scanner;

public class MoveZeroToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int nonzero=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=0;
				arr[nonzero++]=temp;
			}
		}
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
