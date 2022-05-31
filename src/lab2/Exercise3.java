package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a method which accepts an integer array, 
		// reverse the numbers in the array and returns the resulting array in sorted order
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");

		int size=sc.nextInt();

		int [] arr=new int[size];
		System.out.println("Enter array elemts: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		// Reversing Array
		System.out.println("The Reversed Array is:");
		int [] rev=new int[arr.length];
		for(int j=0;j<arr.length;j++)
		{
			rev[j]=arr[(arr.length-1)-j];
			System.out.print(rev[j]+"     ");
		}
		System.out.println();
		
		// Sorting Array by sort method
		
		Arrays.sort(rev);
		System.out.println("After sorting the Reversed Array:");
		for(int i=0;i<rev.length;i++)
		{
			System.out.print(rev[i]+"     ");
		}
		
		
	}

}
