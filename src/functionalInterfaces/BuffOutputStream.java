package functionalInterfaces;
import java.io.*;
public class BuffOutputStream {

	public static void main(String[] args) throws IOException {
		// Buffer Output Stream
		
		 FileOutputStream fout=new FileOutputStream("C:\\Users\\atgajana\\Desktop\\test.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Updated by Buffer Output Stream";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("Updated...");    
	}    
}
