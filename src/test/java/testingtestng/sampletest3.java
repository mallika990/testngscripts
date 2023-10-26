package testingtestng;

import org.testng.annotations.Test;

public class sampletest3 {
	@Test(groups="featureOne")
	public void testOne() {
		System.out.println("Test62 in sampletwo");
	}
	@Test(groups="featureTwo")
	public void testtwo() {
		System.out.println("Test63 in sampletwo");
	}
	@Test(groups="featurethree")
	public void testthree() {
		System.out.println("Test64 in sampletwo");
	}
}
	
	