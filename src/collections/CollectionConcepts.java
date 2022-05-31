package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class CollectionConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l1=new ArrayList();
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		
		Iterator itr=l1.iterator();
		
		while(itr.hasNext())
		{
			Object obj=itr.next();
			if(obj instanceof Employee) {
				Employee e=(Employee) obj;
				System.out.println(e.id+" | "+e.name+" | "+e.dept);
			}
			else
			{
				Student s=(Student) obj;
				System.out.println(s.rollNo+" | "+s.name+" | "+s.age);
			}
		}
		
		
	}
}