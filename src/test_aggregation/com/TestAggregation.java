package test_aggregation.com;

//https://www.geeksforgeeks.org/association-composition-aggregation-java/
//https://www.studytonight.com/java/aggregation.php
class Bank
{
private String name ;

public Bank(String name) {
	super();
	this.name = name;
}
public String getBankName() 
{
	return this.name;
	
}
}
class Employee
{
	private String name ;

	public Employee(String name) {
		this.name = name;
	}
	
	public String getEmployeeName() 
	{
		return this.name;
		
	}
}
public class TestAggregation {

	public static void main(String[] args) {
		Bank b = new Bank("Axis Bank");
		Employee e= new Employee("jyoti");
		System.out.println(b.getBankName()+" is Bank name & "+e.getEmployeeName()+" is Employee name");
	}
}
