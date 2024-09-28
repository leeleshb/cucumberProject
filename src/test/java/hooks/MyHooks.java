package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {

	@Before
	public void setUp(Scenario scenario) {
		System.out.println("## Execution started for scenario ## "+scenario.getName());
		System.out.println("++ Browser got opened and maximized ++");
	}
	
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("## Execution ended for scenario ## "+scenario.getName());
		System.out.println("-- Browser got closed --");
	}
}
