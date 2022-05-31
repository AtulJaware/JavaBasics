package functionalInterfaces;
import java.util.Scanner;
@FunctionalInterface
interface intf{
	void swap(int a,int b);
}
public class Assignment2 {

	public static void main(String[] args) {
		
		//  Swap two numbers

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number :");
		int m=sc.nextInt();
		System.out.println("Enter the 2nd Number :");
		int n=sc.nextInt();
		
		System.out.println("After Swapping");
		intf Intf=(int a,int b) ->{
		int temp=a;
			a=b;
			b=temp;
			System.out.println("1st Number= "+a);
			System.out.println("2nd Number= "+b);
		};
		
		
		Intf.swap(m, n);
		
	}

}
