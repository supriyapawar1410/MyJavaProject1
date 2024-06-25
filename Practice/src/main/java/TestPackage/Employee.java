package TestPackage;

public class Employee {

		
		private String eName;
		private long eID;
		private float esalary;
		
public Employee (String eName,long eID,float esalary)
{
	this.eName=eName;
	this.eID=eID;
	this.esalary=esalary;
	
	
}

//public void getSalary()
//{
	//System.out.println("Salary is "+this.esalary);
//}

public float getSalary()
{
	return this.esalary;
}

public String geteName() {
	return eName;
}

public void seteName(String eName) {
	this.eName = eName;
}

public long geteID() {
	return eID;
}

public void seteID(long eID) {
	this.eID = eID;
}


}
