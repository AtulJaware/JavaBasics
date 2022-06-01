package functionalInterfaces;
import java.io.*;
public class StreamDemo1 {

	public static void main(String[] args) {
		
		 // output Stream
		

		 try{    
             FileOutputStream demo=new FileOutputStream("C:\\Users\\atgajana\\Desktop\\test.txt");    
            String s="Updated text by Output Stream";
            byte b[]=s.getBytes();
            
             demo.write(b);    
             demo.close();   
             System.out.println("Updated");
            }catch(Exception e){System.out.println(e);}    
	}

}
