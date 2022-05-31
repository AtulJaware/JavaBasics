package lab3;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a class containing a method to create the mirror image of a String. 
		// The method should return the two Strings separated with a pipe(|) symbol .
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		String str2=getImage(str);

		String result=str.concat(str2);
		System.out.println("Mirror Image: "+str+"|"+str2);

		
	}
	
	public static String getImage(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		String s=sb.reverse().toString();
		return s;
	}

}
