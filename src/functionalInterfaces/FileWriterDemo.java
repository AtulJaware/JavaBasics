package functionalInterfaces;
import java.io.*;
public class FileWriterDemo {

	public static void main(String[] args) {
		// File Writer to write the File

		 try{    
	           FileWriter file=new FileWriter("C:\\Users\\atgajana\\Desktop\\test.txt");    
	           file.write("Updated text by FileWriter Method");    
	           file.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Updated");    
	     }
}

