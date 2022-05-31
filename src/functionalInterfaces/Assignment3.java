package functionalInterfaces;
import java.util.Scanner;
@FunctionalInterface
interface Intf3{
	void rev(String t);
}
public class Assignment3 {

	public static void main(String[] args) {
		
		//  String reverse

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String : ");
		String s1=sc.nextLine();
		
		
		Intf3 intf3=(String t) ->{
			String s2="";
			char ch;
			for (int i=0; i<s1.length(); i++)
		      {
		        ch= s1.charAt(i); 
		        s2= ch+s2; 
		      }
		      System.out.println("The Reversed String : "+s2);
		};
		
		intf3.rev(s1);
	}

}
