package assignments;

public class MyCar {

	public static void main(String args[])
	{
		System.out.println("Calling from another class..");
		
		Car obj = new Car(); //object creation
		obj.applyBrake(); //object calling
		obj.switchOnAc();
		obj.applyGear();
		obj.applyAccelarate();
	}
}
