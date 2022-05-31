package lab4;
import java.util.Scanner;
public class EmployeeServiceImp1 implements EmployeeService{

	@Override
	public Employee getEmpDetails() {
		String designation;
		String insuranceScheme=null;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		int id=in.nextInt();
		System.out.println("Enter Employee Salary");
		double Salary=in.nextDouble();
		System.out.println("Enter Employee Name");
		String name=in.next();
		
		if (Salary<5000)
		{
			designation="Clerk";
		}
		else if(Salary>5000 && Salary<20000)
		{
			designation="System Associate";
		}
		else if(Salary>=20000 && Salary<40000)
		{
			designation="Programmer";
		}
		else {
			designation="Manager";
		}
		
		Employee emp=new Employee(id,name,designation,insuranceScheme,Salary);
		return emp;
	}
	
	@Override
	public String insuranceScheme(String designation,double Salary)
	{
		String Scheme;
		if (designation=="Clerk")
		{
			Scheme="No Scheme";
		}
		else if(designation=="Programmer")
		{
			Scheme="Scheme B";
		}
		else if(designation=="System Associate")
		{
			Scheme="Scheme C";
		}
		else
		{
			Scheme="Scheme A";
		}
		
		return Scheme;
		}
	
	@Override
	public void EmpDetails(Employee emp)
	{
		System.out.println("Employee id"+emp.id);
		System.out.println("Employee name"+emp.name);
		System.out.println("Employee designation"+emp.designation);
		System.out.println("Employee Salary"+emp.Salary);
		System.out.println("Employee insuranceScheme"+emp.insuranceScheme);
	
	}
}
