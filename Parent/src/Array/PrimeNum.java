package Array;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=45;
		
		for(int i=2;i<n;i++)
		{
			boolean b=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					b=false;
					break;
				}					
			}
			if(b)
				System.out.print(i+" ");
		}
	}

}
