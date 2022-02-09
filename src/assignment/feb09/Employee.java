package assignment.feb09;

public class Employee {
	
	public void printEmployeeName(String empName,int empId)
	{
		System.out.println("Employee name: "+empName);
		System.out.println("Employee ID: "+empId);
	}
	
	public void printEmployeeAddress(String empAddress)
	{
		System.out.println("Employee Address:" +empAddress);
	}
	
	public void printEmployeeSalary(double salary)
	{
		System.out.println("Employee salary: "+salary);
	}
	
	public void printEmployeeMobileNumber(long mobileNo)
	{
		System.out.println("Employee contact number: "+mobileNo);
	}
	
	public static void main(String args[])
	{
		Employee obj = new Employee();
		obj.printEmployeeName("Vishveshwar", 5);
		obj.printEmployeeAddress("Chennai - West Mambalam");
		obj.printEmployeeMobileNumber(9578184957L);
		obj.printEmployeeSalary(125000.75);
	}

}
