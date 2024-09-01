package Array;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,7,5,3,21};
		int firmax=Integer.MIN_VALUE,secmax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(firmax<arr[i])
			{
				secmax=firmax;
				firmax=arr[i];
			}
			else if(secmax<arr[i])
			{
				secmax=arr[i];
			}
		}
		System.out.print(secmax);
	}

}
