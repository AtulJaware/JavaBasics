package lab1;
import java.util.Scanner;
public class Exercise6 {

	// Create a class with a method to find the difference between
	// the sum of the squares and the square of the sum of the first n natural numbers
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		int sum1=0,sum2=0;
		double diff=0;
		for(int i=0;i<=num;i++) {
			sum1+=(i*i);
			sum2=sum2+i;
		}
		System.out.println(sum1+"   "+sum2);
		diff=sum1-Math.pow(sum2,2);
		System.out.println(diff);
	}

}
