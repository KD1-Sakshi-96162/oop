import java.util.Scanner;
class Employee{
	public String f_name;
	public String l_name;
	public double salary;
	
	public Employee() {

	}
	
	public Employee(String f_name,String l_name,double salary)
	{
		this.f_name=f_name;
		this.l_name=l_name;
		this.salary=salary;
	}
	
	public void setf_name(String f_name)
	{
		this.f_name=f_name;
	}
	
	public String getf_name()
	{
		return f_name;
	}
	
	public void setl_name(String l_name)
	{
		this.l_name=l_name;
	}
	public String getl_name()
	{
		return l_name;
	}
	
	public void setsalary(double salary)
	{
		if(salary>0)
			this.salary=salary;
		else
			salary=0.0;
	}
	public double getsalary()
	{
		return salary;
	}
	
	public double yearlySalary() {
		return salary * 12;
	}
	
	public void raiseSalary() {
		salary = salary + (salary * 0.10);
	}
	
}

class EmployeeTest{
	Employee emp=new Employee();
	Employee emp1=new Employee();
	
public void acceptRecord() {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("first name : " );
	String f_name =sc.nextLine();
	emp.setf_name(f_name);
	
	System.out.println("last name : ");
	String l_name =sc.nextLine();
	emp.setl_name(l_name);
	
	System.out.println("salary : ");
	double salary=sc.nextDouble();
	emp.setsalary(salary);

	}

public void displayRecord() {
	System.out.println("first name : " + emp.getf_name()); 
	System.out.println("last name : " + emp.getl_name());
	System.out.println("salary : " +emp.getsalary());
	System.out.println("Yearly salary: " + emp.yearlySalary());
}	
public void incrementSalary() {
    emp.raiseSalary();
}
}

public class Assignment2_2 {
	public static void main(String[] args) {
 EmployeeTest emp1=new EmployeeTest();
 EmployeeTest emp2=new EmployeeTest();
 System.out.println("enter details for emp1 : ");
 emp1.acceptRecord();
 System.out.println("enter details for emp2 : ");
 emp2.acceptRecord();
 
 emp1.displayRecord();
 emp2.displayRecord();
 
 emp1.incrementSalary();
 emp2.incrementSalary();
 
 System.out.println("After 10% Raise");
 emp1.displayRecord();
 emp2.displayRecord();
 
	}
}
