package collections;
import java.util.Comparator;
public class SortByDept implements Comparator<Employee> {

		
		@Override
		public int compare(Employee emp1, Employee emp2) {

			return emp2.dept.compareTo(emp1.dept); //desc order
			// return emp1.dept.compareTo(emp2.dept); // asc order
		}
}