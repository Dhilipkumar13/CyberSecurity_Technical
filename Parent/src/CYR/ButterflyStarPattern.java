package CYR;
/*
 * 
									*           * 
									  *       *   
									*   *   *   * 
									  *   *   *   
									*   *   *   *
									  *       * 
									*           *
 * 
 * */
import java.util.Scanner;

public class ButterflyStarPattern {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int n=7;
		int od=0,ev=0;
		int mid=n/2+1;
		for(int i=0;i<mid;i++)
		{
			if(i%2!=0)
			{
				od++;int count=0;
				for(int h=0;h<mid;h++)
				{
					if(h%2!=0 && count !=od)
					{
						count++;
						System.out.print("* ");
					}
					else
						System.out.print("  ");
				}count=mid-od*2-1;
				for(int h=0;h<mid-1;h++)
				{
					if(h%2!=0 && count<=0)
					{
						System.out.print("* ");
					}
					else
					{
						count--;
						System.out.print("  ");
					}
				}
				
			}
			else
			{
				ev++;int count=0;
				for(int h=0;h<mid;h++)
				{
					if(h%2==0&& count !=ev)
					{
						count++;
						System.out.print("* ");
					}
					else
						System.out.print("  ");
				}count=mid-ev*2-1;
				for(int h=0;h<mid-1;h++)
				{
					if(h%2==0 && count<=0)
					{
						System.out.print("* ");
					}
					else
					{
						count--;
						System.out.print("  ");
					}
				}
				
			}
			System.out.println();
		}
	}
}
