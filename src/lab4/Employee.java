package lab4;

public class Employee {

	public int id;
	public String name,designation,insuranceScheme;
	public double Salary;
	
	public Employee(int id,String name,String designation,String insuranceScheme,double Salary) {
		super();
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.insuranceScheme=insuranceScheme;
		this.Salary=Salary;
	}
	public Employee(){
		
	}
}
