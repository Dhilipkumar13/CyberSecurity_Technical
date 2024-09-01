package String;

import java.util.Scanner;

public class LongestSubPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print( longest(str));
	}
	static String longest(String str)
	{
		int j=str.length()-1;
		int count=0;
		while(count<j)
		{
			for(int st=0;st<=count;st++)
			{
				String result=str.substring(st,j+st-count);
				if(isPalindrome(result))
				{
					return result;
				}
			}
			count++;
		}
		return "";
	}
	static boolean isPalindrome(String str)
	{
		int i=0,j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
		
	}

}
