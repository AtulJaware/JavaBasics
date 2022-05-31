package lab1;
import java.util.Scanner;

public class Exercise1 {

	// Create a method to find the sum of the cubes of the digits of an n digit number


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();

		int sum=0;
		while(num!=0){
			int digit=num%10;
			sum=sum+(digit*digit*digit);

			num=num/10;
		}
		System.out.println("Sum of cube of digit : "+sum);
	}

}