package collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create TreeSet Object
		
		SortByEmpName sortByName=new SortByEmpName();
		Set<Employee> employees=new TreeSet<>(sortByName);
		
		// Create Employee Object
		
		Employee emp1=new Employee(1111,"Atul","ADMIN");
		Employee emp2=new Employee(2222,"Dhiraj","Clerk");
		Employee emp3=new Employee(3333,"Rahul","Support");
		Employee emp4=new Employee(4444,"Vishal","Manager");
		
		Employee emp5=new Employee(4444,"Vishal","ADMIN");
		Employee emp6=emp1;
		
		// Add Employees to TreeSet
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		
		// Iterate TreeSet
		
		Iterator itr=employees.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
