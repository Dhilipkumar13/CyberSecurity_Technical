package String;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st1=sc.next(),st2=sc.next();
		if(st1.length()!=st2.length())
			System.out.print("Invalid");
		else {
			int str1[]=new int[26];
			int str2[]=new int[26];
			for(int i=0;i<st1.length();i++)
			{
				str1[st1.charAt(i)-'a']++;
				str2[st2.charAt(i)-'a']++;
			}boolean b=true;
			for(int i=0;i<st1.length();i++)
			{
				if(str1[st1.charAt(i)-'a']!=str2[st2.charAt(i)-'a'])
				{
					b=false;
					break;
				}
			}
			if(b)
				System.out.print("Anagram");
			else
				System.out.print("NOt an Anagram");
			
		}
	}

}
