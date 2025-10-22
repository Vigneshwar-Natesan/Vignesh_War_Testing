package playground;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Sample {

	String name ="Vignesh";
	
	@Test
	public void checkEqual() {
      Assert.assertEquals(name, "Vignesh");
	}
}
