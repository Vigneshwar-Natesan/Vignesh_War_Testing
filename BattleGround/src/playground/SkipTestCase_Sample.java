package playground;

import org.testng.annotations.Test;

public class SkipTestCase_Sample {

	@Test(priority=0)
	public void startACar() {
      System.out.println("Car has been Started");
	}
	
	@Test(priority=1,enabled=true)
	public void firstGear() {
      System.out.println("First Gear Shifted");
	}
	
	@Test(priority=2)
	public void secondGear() {
      System.out.println("Second Gear Shifted");
	}

	@Test(priority=3)
	public void thirdGear() {
      System.out.println("Third Gear Shifted");
	}
	
	@Test(priority=4)
	public void fourthGear() {
      System.out.println("Fourth Gear Shifted");
	}
	
	@Test(priority=5,enabled=false)
	public void fifthGear() {
      System.out.println("Fifth Gear Shifted");
	}
	
}
