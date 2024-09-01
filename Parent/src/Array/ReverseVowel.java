package Array;

public class ReverseVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Zoho Coorpuration";
		String vow="aeiouAEIOU";
		char sb[]=str.toCharArray();
		//StringBuilder sb=new StringBuilder(str);
		int i=0,j=str.length()-1;
		while(i<j)
		{
			if(vow.indexOf(sb[i])==-1)
			{
				i++;
			}
			else if(vow.indexOf(sb[j])==-1)
			{
				j--;
			}
			else
			{
				char temp=sb[i];
				sb[i++]=sb[j];
				sb[j--]=temp;
			}
		}
		System.out.print(String.valueOf(sb));
	}

}
