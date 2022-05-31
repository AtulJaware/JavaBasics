package lab5;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter age: ");
	    Scanner sc = new Scanner(System.in);
	    int age = sc.nextInt();
	    if(age<15) {
	    	throw new InvalidAge("Enter age greater than 15");
	    }
	}

}
