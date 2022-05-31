package lab5;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName=sc.nextLine();
		System.out.println("Enter Last Name");
		String lastName=sc.nextLine();
	    String fullName=firstName+" "+lastName;
	    
	    
		if(firstName.length()==0)
		{
			throw new InvalidName("First Name is Blank,Enter The First Name");
		}
		else if(lastName.length()==0)
		{
			throw new InvalidName("Last Name is Blank,Enter The Last Name");
		}
		System.out.println("Full Name:- "+fullName);
	}

}
