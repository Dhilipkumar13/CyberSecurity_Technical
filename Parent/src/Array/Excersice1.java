package Array;

public class Excersice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int km=50;
		int wei=125;
		int tot=0;
		if(km>=50)
		{
			int n=km/50;
			tot=n*10;
		}
		//System.out.println(tot);
		if(wei>=100)
		{
			int n=wei/100;
			tot=tot+n*10;
		}
		//System.out.println(tot);
		System.out.print(tot+5);
	}

}
