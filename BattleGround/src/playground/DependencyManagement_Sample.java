package playground;

import org.testng.annotations.Test;

public class DependencyManagement_Sample {

	
	@Test(priority=0)
	public void startACar() {
      System.out.println("Car has been Started");
	}
	
	@Test(priority=1)
	public void firstGear() {
      System.out.println("First Gear Shifted");
	}
	
	@Test(enabled=true)
	public void secondGear() {
      System.out.println("Second Gear Shifted");
	}

	@Test(dependsOnMethods = "secondGear")
	public void thirdGear() {
      System.out.println("Third Gear Shifted");
	}
	
	@Test(dependsOnMethods = "thirdGear")
	public void fourthGear() {
      System.out.println("Fourth Gear Shifted");
	}
	
	@Test(dependsOnMethods = "fourthGear")
	public void fifthGear() {
      System.out.println("Fifth Gear Shifted");
	}
}
