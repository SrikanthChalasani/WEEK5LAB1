import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShippingLookupTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void SAME_DAY_DESC_test() {
		assertEquals("24 hours", ShippingLookup.SAME_DAY.description());
	}

	@Test
	public void SAME_DAY_INCR_test() {
		assertEquals(20, ShippingLookup.SAME_DAY.increment());
	}
	
	@Test
	public void THREE_DAY_DESC_test() {
		assertEquals("72 hours", ShippingLookup.THREE_DAY.description());
	}

	@Test
	public void THREE_DAY_INCR_test() {
		assertEquals(15, ShippingLookup.THREE_DAY.increment());
	}
	
	@Test
	public void GROUND_test() {
		assertEquals("5 days", ShippingLookup.GROUND.description());
	}

	@Test
	public void GROUND_INCR_test() {
		assertEquals(5, ShippingLookup.GROUND.increment());
	}
}
