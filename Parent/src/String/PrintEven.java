package String;
import java.util.Scanner;

// print word count if even

public class PrintEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		for(String s:arr)
		{
			if(s.length()%2==0)
				System.out.println(s);
		}
	}

}
