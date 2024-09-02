package STACK;

// int the given array 
// if 1 means dog weight increased by 1
// if two consecutive 1 1 means weight increase by 5

public class ProblemOfDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,1,0,1};
		int weight=1;
		if(arr[0]==1)
			weight++;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]==0 && arr[i]==1)
				weight++;
			else if(arr[i-1]==1 && arr[i]==1)
			{
				weight+=5;
			}
			else if(arr[i-1]==0 && arr[i]==0)
			{
				weight=-1;
				break;
			}
		}
		System.out.print(weight);
	}

}
