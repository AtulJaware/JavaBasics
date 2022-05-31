package lab3;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
		
		// Create a method to accept date and print the duration in days, 
		// months and years with regards to current system date.

		Scanner sc=new Scanner(System.in);
		LocalDate now=LocalDate.now();
		
		System.out.println("Enter date(dd/MM/yyyy) : ");
		String date=sc.nextLine();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1=LocalDate.parse(date,formatter);
		System.out.println("User Date is   : "+date1);
		System.out.println("System Date is : "+now);
		
		Period diff=Period.between(date1, now);
		
		System.out.println("The Duration is : "+ diff.getYears()+" Years "+ diff.getMonths()+" Months " + diff.getDays()+" Days");
	}

}
