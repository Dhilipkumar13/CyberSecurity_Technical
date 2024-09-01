package Array;

import java.util.Arrays;

public class Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,4,7,14,3,15,1};
		int tar=12;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==tar)
					System.out.println(i + " , "+ j);
			}
		}
//		Arrays.sort(arr);
//		int i=0,j=arr.length-1;
//		while(i<j)
//		{
//			if(arr[i]+arr[j]<tar)
//			{
//				i++;
//			}
//			else if(arr[i]+arr[j] > tar)
//			{
//				j--;
//			}
//			else{
//				System.out.println(i +" , "+ j);
//				i++;j--;
//			}
//		}
	}

}
