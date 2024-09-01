package CYR;
import java.util.*;
public class CheckAlpha {
	public static void main(String[] args) {
		
		Set <Character> st=new HashSet<>();
		var sc=new Scanner(System.in);
		String str=sc.nextLine();
		str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char k=str.charAt(i);
			if(k>='a'&&k<='z')
			st.add(str.charAt(i));
		}
		System.out.print(st.size()==26);
					
	}
}
