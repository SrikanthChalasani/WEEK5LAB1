import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DownloadableBookTest {
IBook book;
	@Before
	public void setUp() throws Exception {
		book = new DownloadableBook("2222", 56, "85001");
	}

	@Test
	public void test() {
		assertEquals(64.6,book.calculateCost(),.001d);
	}

}
