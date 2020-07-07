package stepDef;

import cucumber.api.java.Before;
import nonBDD.RestAssuredExtension;

public class Hooks {

	@Before
	public void TestSetup() {
		RestAssuredExtension restAssurecExtension = new RestAssuredExtension();
	}
	
}
