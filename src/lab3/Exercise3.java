package lab3;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String str=sc.nextLine();
		String result=alterString(str);
		System.out.println("Result: "+result);
		
	}
	public static String alterString(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				
			}
			else if(ch[i]=='Z')
			{
				ch[i]='A';
			}
			else if(ch[i]=='z')
			{
				ch[i]='a';
			}
			else
				ch[i]=++ch[i];
		}
		return String.valueOf(ch);
	}

}
