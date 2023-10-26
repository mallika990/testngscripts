package testingtestng;

import org.testng.annotations.Test;

public class sampletest2 {
	@Test(groups="featureOne")
	public void testOne() {
		System.out.println("Test42 in sampletwo");
	}
	@Test(groups="featureTwo")
	public void testtwo() {
		System.out.println("Test43 in sampletwo");
	}
	@Test(groups="featurethree")
	public void testthree() {
		System.out.println("Test44 in sampletwo");
	}
}
	
	