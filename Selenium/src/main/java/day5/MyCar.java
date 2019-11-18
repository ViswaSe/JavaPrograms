package day5;

public class MyCar extends Car implements LearnInterface{

	public void stichStickers()
	{
		System.out.println("Paste the stickers in the car");
	}

	public void sample()
	{
		System.out.println("Interface method using the value num = "+num);
	}

	public static void main(String args[])
	{
		MyCar ob=new MyCar();
		
		if (ob instanceof MyCar)
		{
			System.out.println(true);
		}
		else 
		{
			System.err.println(false);
		}
		ob.sample();
		ob.stichStickers();
		ob.changeSeat();
		ob.closeWindow();
		ob.pressHorn();
		ob.applyBrake();

		Car obj=new Car();
		System.out.println();
		obj.changeSeat();
	}
}
