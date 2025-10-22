package playground;

import org.testng.annotations.Test;

public class Grouping_Sample {

	@Test(groups= {"Apple"})
	public void apple1() {
      System.out.println("Apple Testing");
	}
	@Test(groups= {"Apple"})
	public void apple2() {
      System.out.println("Apple Testing");
	}
	
	@Test(groups= {"Samsung"})
	public void samsung1() {
      System.out.println("Samsung Testing");
	}
	
	@Test(groups= {"Samsung"})
	public void samsung2() {
      System.out.println("Samsung Testing");
	}
	
	@Test(groups= {"Sony"})
	public void sony1() {
      System.out.println("Sony Testing");
	}
	
	@Test(groups= {"Sony"})
	public void sony2() {
      System.out.println("Sony Testing");
	}
	
}
