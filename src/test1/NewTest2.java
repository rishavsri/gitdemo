package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 


{
	@Test(timeOut = 2)
	public void f() 
	{
		 Assert.assertEquals(1, 1);;
		System.out.println("");
		
	}
	
	
}
