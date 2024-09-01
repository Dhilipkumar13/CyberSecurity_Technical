package Array;

public class PrintString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="PROGRAM";
		int n=str.length();
		str=str.substring(n/2)+str.substring(0,n/2);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}

}
