package lab4;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EmployeeServiceImp1 emp=new EmployeeServiceImp1();
		Employee emp1=emp.getEmpDetails();
		Employee person=new Employee(emp1.id,emp1.name,emp1.designation,Scheme,emp1.Salary);
		
		
		emp.EmpDetails(person);
	}

}
