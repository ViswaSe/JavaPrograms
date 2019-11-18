package day1;

public class Mobile {

	public String brand="Redmi";
	public String model="Note 6 Pro"; 
	
	public String sendSms(String message)
	{
		System.out.println(message);
		return "pass";
	}
	
	public void dialNo(int number)
	{
		System.out.println(number);
	}
	
}
