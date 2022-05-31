package lab5;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Salary Of Employee");
		
		long sal=sc.nextLong();
		
		if(sal<3000)
		{
			throw new com.cg.eis.exception.EmployeeException("Salary is Less than 3000");
		}
	}

}
