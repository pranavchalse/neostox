package testngverificationUsingTestNG;

import org.testng.annotations.Test;

import org.testng.Assert;
public class AssertFail {
	@Test
	public void MyTC()
 {
		Assert.fail();
 }

