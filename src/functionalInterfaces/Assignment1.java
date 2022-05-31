package functionalInterfaces;
import java.util.Scanner;
@FunctionalInterface
interface Intf1{
	int sum(int n );
}

public class Assignment1 {

	//  sum of n natural numbers
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int m=sc.nextInt();
		
		Intf1 intf=(int n) -> {
			return n*(n+1)/2;
		};
		System.out.println("The Sum of "+m+" Natural Numbers :");
		System.out.println(intf.sum(m));
	}

}
