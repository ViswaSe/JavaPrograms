package day1;

public class GreatestOfThree {

	public static void main(String[] args) {
		
		int a=40,b=25,c=20;
		
		if((a>b) && (a>c))
		{
			System.out.println(a+" is the biggest number");
		}
		else if(b>c)
		{
			System.out.println(b+" is the biggest number");
		}
		else
		{
			System.out.println(c+" is the biggest number");
		}

	}	
}
