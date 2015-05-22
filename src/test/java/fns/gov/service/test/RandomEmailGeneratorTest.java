package fns.gov.service.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import fns.gov.service.RandomEmailGenerator;

public class RandomEmailGeneratorTest {
	
	@Test()
	public void testEmailGenerator() {
 
		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = obj.generate();
 
		Assert.assertNotNull(email);
		Assert.assertEquals(email, "reanugu@yoursite.com");
 
	}

}
