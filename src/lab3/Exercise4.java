package lab3;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// user input
		System.out.println("Enter The Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		
		// int to string array
		String str=String.valueOf(num);
		
		// string array to char array
		char []ch=new char[str.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
		}
		
		int[] no=new int[ch.length];
		System.out.println("NO::"+no.length);
		
		for(int i=0;i<ch.length;i++)
		{
			no[i]=Integer.parseInt(String.valueOf(ch[i]));
		}
		for(int j=1;j<no.length;j++) {
			int diff=j==0?0:no[j]-no[j-1];
			sb.append(diff);

		}
		String s=sb.toString();
		s.split("-");

		System.out.println(s);
	}

}
