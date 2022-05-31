package lab3;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a Java program that reads a line of integers and 
		// then displays each integer and the sum of all integers (Use String Tokenizer class)
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the arry: ");
		int size=sc.nextInt();
		// Array Declaration and Elements initialize
		
		int[] num=new int[size];
		System.out.println("Enter the array eleents:");
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("the integer array is");
		for(int i=0;i<size;i++) {	
			System.out.print(num[i]+"  ");
		}
		// Addition of Array Element
		int sum=0;
		for(int i=0;i<size;i++) {	
			sum=sum+num[i];
		}
		System.out.println();
		System.out.println("Sum = "+sum);
	}

}