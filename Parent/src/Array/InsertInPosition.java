package Array;
// insert in any position it will replace the value
// ex : 1 23 4 5
// postion: 0 value: 9
//output 9 1 23 4 5
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertInPosition {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Position and value");
		int pos=sc.nextInt();
		int val= sc.nextInt(); 
		for(int i=pos;i<n;i++)
		{
			int temp=arr[i];
			arr[i]=val;
			val=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
//	static void insert(int arr[])
//	{
//		System.out.println("Insert :");
//		List<Integer> list=new ArrayList<>();
//		try {
//			while(true) {
//			list.add(sc.nextInt());
//			}
//		}
//		catch(Exception e)
//		{
//			for(int i=list.size()-1;i>=0;i--)
//			{
//				arr[i]=list.remove(i);
//			}
//		}
//	}
}
