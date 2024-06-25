package TestPackage;

public class EmployeeImpl {

	public static void main(String[] args) {


		Employee e1=new Employee("Supriya",113231,80000);
		
		System.out.println(e1.getSalary());
		
		float Salary= e1.getSalary();
		
		System.out.println("Annual Salary is " +Salary*12);
		
		System.out.println(e1.geteID());
		System.out.println(e1.geteName());

	}

}
