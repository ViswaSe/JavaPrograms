package testdefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeScenario(Scenario sc)
	{
		System.out.println("Scenario:"+sc.getName());
		System.out.println("Line Number:"+sc.getId());
		System.out.println("Status:"+sc.getStatus());
	}
	
	@After
	public void afterScenario(Scenario sc)
	{
		System.out.println("Status after execution"+sc.getStatus());
	}

}
