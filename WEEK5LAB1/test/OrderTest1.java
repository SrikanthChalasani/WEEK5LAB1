import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class OrderTest1{
	List<Book> books;

	@Before
	public void setUp() {
		try
		{
		books = new ArrayList<>();
		books.add(new DownloadableBook("2345", 10, "75087"));
		books.add(new HardCoverBook("2388", 20, "75087", "GROUND"));
		books.add(new DownloadableBook("1399", 15, "30080"));
		books.add(new DownloadableBook("2222", 12, "85001"));
		books.add(new HardCoverBook("1995", 10, "30080", "SAME_DAY"));
		books.add(new HardCoverBook("2345", 20, "61761", "THREE_DAY"));
		books.add(new HardCoverBook("2337", 15, "30080", "SAME_DAY"));
		}
		catch (BookNotAvailableException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

	@Test
	public void testbook() {
		assertEquals(146.5, Order.calculateOrderCost(books), .0001d);
	}
	
	

}
