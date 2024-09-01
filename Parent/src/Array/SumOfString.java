package Array;

public class SumOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="100";
		String str2="123";
		int len1=0,len2=0;
		for(int i=0;i<str1.length();i++)
		{
			int k=str1.charAt(i)-'0';
			len1=len1*10+k;
		}
		for(int i=0;i<str2.length();i++)
		{
			int k=str2.charAt(i)-'0';
			len2=len2*10+k;
		}
		System.out.println(len1+" "+len2);
		System.out.print(len1*len2);
	}

}
