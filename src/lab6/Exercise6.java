package lab6;
import lab6.Ex6.pkg.Service.Age;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise6 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Map<Integer,Age> age1=new HashMap<>();
		List<Integer> id=voterList(age1);
		System.out.println("---------------------");
		System.out.println("Eligible Persons id");
		for(Integer id1:id) {
			System.out.println(id1);
		}
	}
	private static List<Integer> voterList(Map<Integer, Age> age) {
		age=new HashMap<>();
		List<Integer> list=new ArrayList<>();

		Age a1=new Age();
		Age a2=new Age();

		while(true) {

			int i=0;
			System.out.println("Enter the id and age of person:"+(i+1));

			int id=sc.nextInt();
			int aa=sc.nextInt();


			sc.nextLine();
			a1.setId(id);
			a1.setPersonAge(aa);

			if(a1.getPersonAge()>18) {
			age.put(a1.getId(), a1);
			}

			System.out.println("Do you want to continue(yes/no)");
			String ch=sc.nextLine();
			if(!ch.equalsIgnoreCase("yes")) {
				break;
			}
		}

			for(Map.Entry<Integer, Age> l:age.entrySet()) {
				list.add(l.getKey());
			}
			return list;
		}
}
