package functionalInterfaces;
import java.io.*;
public class StreamDemo {

	public static void main(String[] args) {
		
		 try{    
			 
			 // input Stream
			 
	            FileInputStream demo=new FileInputStream("C:\\Users\\atgajana\\Desktop\\test.txt");    
	            int i=demo.read();  
	            while((i=demo.read())!=-1){    
	                System.out.print((char)i);    
	               }   
	            demo.close();       
	          }catch(Exception e){System.out.println(e);}    
	         }
	
}
