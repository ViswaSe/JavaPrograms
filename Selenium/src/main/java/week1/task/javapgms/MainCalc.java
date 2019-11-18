package week1.task.javapgms;

public class MainCalc {
	
	public static void main(String args[])
	{
		int firstNum=40;
		int secondNum=20;
		
		BaseCalc ob=new BaseCalc();
		
		int add=ob.add(firstNum, secondNum);
		System.out.println("Addition: "+add);
		
		int sub=ob.sub(firstNum, secondNum);
		System.out.println("Subraction: "+sub);
		
		int mul=ob.mul(firstNum, secondNum);
		System.out.println("Multiplication: "+mul);
		
		int div=ob.div(firstNum, secondNum);
		System.out.println("Division: "+div);
	}

}
