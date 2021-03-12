package excersise;
import java.util.Scanner;
public class Zero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		int n=10,k=5;
		int num;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num>=1 && num<=5) {
			System.out.println("number of candies sold:"+num);
			System.out.println("Number of candies left:"+ (n-num));
			}
		else {
			System.out.println("Invalid Input");
			System.out.println("Number of candies Left:"+n);
		}
		System.out.println("Hello world");
		
	}
}
