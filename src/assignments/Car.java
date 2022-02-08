package assignments;

public class Car {
	
	public void applyBrake()
	{
		System.out.println("Brake applied");
	}
	
	public void applyGear()
	{
		System.out.println("Gear applied");
	}
	
	public void switchOnAc()
	{
		System.out.println("Ac turned on");
	}
	
	public void applyAccelarate()
	{
		System.out.println("Accelarate applied");
	}
	
	public static void main(String args[])
	{
		System.out.println("Calling from same class");
	
		Car mycar = new Car(); //classname objname = new classname (object creation)
		mycar.applyBrake(); //objectname.methodname (method calling)
		mycar.applyGear();
		mycar.switchOnAc();
		mycar.applyAccelarate();
	}
}
