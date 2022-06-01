package lab8.Exercise1;
import java.io.*;
import java.util.Scanner;
public class FileProgram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Text :");
			
		// Storing the characters in Source folder from user input 
		 FileOutputStream out;
		try {
			out = new FileOutputStream("C:\\Users\\atgajana\\Desktop\\Demo Files\\source.txt");
         String s=sc.nextLine();
         byte b[]=s.getBytes();
         
          out.write(b);    
          out.close();   
          System.out.println("Sucessfully Added to Source Folder");

		} catch (Exception e) {
			e.printStackTrace();
		}    
	}
}
