package Array;

import java.util.Scanner;

public class PrintCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		String str="h0b3c5";
		char temp=str.charAt(0);
		String s="0";
		for(int i=0;i<str.length();i++)
		{
			//System.out.println("dhdh");
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
			
				int n=Integer.parseInt(s);
				//System.out.println(n);
				for(int j=0;j<n;j++)
				{
					System.out.print(temp);
				}
				s="";
				temp=str.charAt(i);
			}
			else
			{
				s+=str.charAt(i);
			}
		}
		int n=Integer.parseInt(s);
		//System.out.println(n);
		for(int j=0;j<n;j++)
		{
			System.out.print(temp);
		}
//		for(int i=0;i<str.length();i++)
//		{
//			//System.out.println("dhdh");
//			if(str.charAt(i)>='a' && str.charAt(i)<='z')
//			{
//				int n=Integer.parseInt(temp);
//				//System.out.println(n);
//				for(int j=0;j<n;j++)
//				{
//					System.out.print(str.charAt(i));
//				}
//				temp="";
//			}
//			else
//				temp+=str.charAt(i);
//		}
//		System.out.println();
//		System.out.println(temp);
	}

}
