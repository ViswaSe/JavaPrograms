package assignment.feb09;

public class Calculator {
	
	public void multipleTwoNumber(double a,double b)
	{
		System.out.println("Multiplication: "+a*b);
	}
	
	public void divideTwoNumber(float a, float b)
	{
		System.out.println("Division: "+a/b);
	}
	
	public static void main(String args[])
	{
		Calculator obj = new Calculator();
		obj.multipleTwoNumber(20.7, 15.2);
		obj.divideTwoNumber(10.2f, 5.6f);
	}

}
