import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DemoTest {

	@Test
	public void testOne() {
		Demo d=new Demo();
		assertTrue(d.validateEmail("abc@example.com"));
	}
	
	@Test
	public void testTwo() {
		Demo d=new Demo();
		assertFalse(d.validateEmail("abc@hrd.gov"));
	}
}
