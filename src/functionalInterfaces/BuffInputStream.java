package functionalInterfaces;
import java.io.*;
public class BuffInputStream {

	public static void main(String[] args) {
		// Buffered Input Stream

		try{    
		    FileInputStream in=new FileInputStream("C:\\Users\\atgajana\\Desktop\\test.txt");    
		    BufferedInputStream buff=new BufferedInputStream(in);    
		    int i;    
		    while((i=buff.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    buff.close();    
		    in.close();    
		  }catch(Exception e){System.out.println(e);}    
		 }    
}
