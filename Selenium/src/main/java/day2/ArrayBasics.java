package day2;

public class ArrayBasics {

	public static void main(String args[])
	{
		String[] carModels= {"ford","innova",
				"indica","rangerover","swift","indigo","cruize","celario"};
		
		System.out.println("Total cars: "+carModels.length);
		
		for(int i=0;i<carModels.length;i++)
		{
			System.out.println(carModels[i]);
		}
		
		for(String eachCar:carModels)
		{
			System.out.println(eachCar);
		}
		
		}
}

