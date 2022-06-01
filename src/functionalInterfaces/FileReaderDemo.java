package functionalInterfaces;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args)throws Exception{
		
		// File Reader to Read the File
		
		FileReader fr=new FileReader("C:\\Users\\atgajana\\Desktop\\test.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
		
	}
}
