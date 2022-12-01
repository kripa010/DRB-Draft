package samplemaventest;

import org.testng.Assert;
import org.testng.annotations.Test;

import samplemaven.App;


public class App_test {
 
@Test
	public void TestLogin()

	{
		App appobj = new App();
	
	Assert.assertEquals(0,appobj.userLogin("kripa", "test"));
		
	}
	
	
	
}
