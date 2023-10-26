package parallelscripts;

import org.testng.annotations.Test;

public class sampletest2 {
	@Test(groups="featureOne")
	public void testOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Test42 in sampletwo ..."+id);
	}
	@Test(groups="featureTwo")
	public void testtwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Test43 in sampletwo.."+id);
	}
	@Test(groups="featurethree")
	public void testthree() {
		long id = Thread.currentThread().getId();
		System.out.println("Test44 in sampletwo.."+id);
	}
}
	
	