package CYR;
import java.util.*;

/*
 * print all combination of given two number
 * 
 * input : 1 to 100
 * 		   5 6
 * 			
 * output : 5 6 55 56 65 66
 * */
public class Preparation {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("range:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print("two nus:");
        int i = sc.nextInt();
        int j = sc.nextInt();
        
        for (int s = 1; s <= 100; s++) {
            
           System.out.print(s+" ");
        }
        }
        static boolean chek(int k,int i,int j)
        {
            while (k > 0) {
                if (k % 10 != i && k % 10 != j) {
                   return false;
                }
                k = k / 10; 
            }
            return true;
        }	

}