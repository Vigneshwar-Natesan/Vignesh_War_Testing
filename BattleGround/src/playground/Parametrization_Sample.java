package playground;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization_Sample {

	@Test
	@Parameters("Name")
	public void empName(String name) {
      System.out.println("Name of the Employee is: "+name);
	}
	
}
