package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();  //Creating arraylist  
		list.add("Monday");                               //Adding object in arraylist  
		list.add("Tuesday");  
		list.add("Wednesday");  
		list.add("Thursday");  
		list.add("Friday");
		
		System.out.println(list);
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		// Manupulating ArrayList
		
		System.out.println("Contains value : "+list.contains("Monday"));
		
		System.out.println("Size of ArrayList : "+list.size());
		
		System.out.println("Hashcode of ArrayList" +list.hashCode());
		
		System.out.println(list.remove("Sunday"));
		
		System.out.println("Fetching Elements: "+list.get(3));
		
		list.add(5, "Holiday");
		
		System.out.println(list);
		
		list.set(5, "Sunday");
		System.out.println(list);
	}

}
