package collections;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String>test = new LinkedList<String>();
		test.add("Tuesday");
		test.add("Wednesday");
		test.add("Thursday");
		test.addFirst("Monday");
		test.add("Friday");
		test.add("Saturday");
		test.add("Sunday");
		
		Iterator<String> itr=test.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		System.out.println("Size of List: "+ test.size());
		
	   System.out.println(test.getLast());
		
	}

}
