package core.java.apis.stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayStackTest {
	
	@Test
	public void testPush() {
		Stack<String> names = new ArrayStack<String>(5);
		names.push("adarsh");
		names.push("mysore");
		names.push("thimmappa");
		System.out.println(names);
		Assert.assertEquals(3, names.size());

	}
}
