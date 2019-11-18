package day1;

public class MyMobile {
	
	public static void main(String args[])
	{
		Mobile ob=new Mobile(); //creating an object for the mobile class
		String brand = ob.brand;
		System.out.println(brand);
		String model = ob.model;
		System.out.println(model);
		String status = ob.sendSms("Hi Welcome to Java");
		System.out.println(status);
		ob.dialNo(95423);
	}

}
