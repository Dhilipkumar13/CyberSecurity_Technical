package Array;

import java.util.Scanner;

public class FrequencyOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
		boolean[] b=new boolean[n];
		for(int i=0;i<n;i++)
		{
			if(!b[i])
			{
				int count=1;
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						b[j]=true;
					}
				}
				if(count>1)
				System.out.println(arr[i]+" "+ count);
			}
		}
		
		
//		int len[]=new int[1000];
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//			len[arr[i]]++;
//		}
//		for(int i=0;i<1000;i++)
//		{
//			if(len[i]!=0)
//			System.out.println(i+"->"+len[i]);
//		}
		
	}

}
