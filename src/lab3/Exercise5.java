package lab3;
import java.util.Scanner;
public class Exercise5 {

	// Write a Java program that displays the number of characters, lines and words in a text

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter The Text :");
		Scanner sc=new Scanner(System.in);
		
		String line=sc.nextLine();
		int lineCnt=0;
		int charCnt=0;
		int wordCnt=0;
		
		while(line!=null) {

			lineCnt++;

			String [] word=line.split(" ");
			wordCnt=wordCnt+word.length;

			for(String s:word) {
				charCnt=charCnt+s.length();
			}
	}
		System.out.println("No of Words: "+wordCnt);
		System.out.println("No of characters: "+charCnt);
		System.out.println("No of lines: "+lineCnt);
	}
}
		