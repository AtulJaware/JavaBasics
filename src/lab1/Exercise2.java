package lab1;
import java.util.Scanner;

public class Exercise2 {

	// Write a java program that simulates a traffic light.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		int ch=0;
		
			System.out.println("Enter your choice: ");
			System.out.println("1.Red\n2.Yelloe\n3.Green");
			ch=sc.nextInt();
			switch(ch){
			case 1: System.out.println("Stop");
					break;
			case 2: System.out.println("Ready");
					break;
			case 3: System.out.println("Go");
					break;
			default: System.out.println("Invalid Choice");
			}
	}
}
