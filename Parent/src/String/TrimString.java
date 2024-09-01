package String;

public class TrimString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="*   abc d d f   ";
		System.out.println(trim(str));
		
	}
	static String trim(String str)
	{
		int i=0,j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)==' ')
			{
				i++;
			}
			else if(str.charAt(j)==' ')
			{
				j--;
			}
			else
			{
				break;
			}
		}
		return str.substring(i,j+1);
	}

}
