
public class DownloadableBook extends Book {
	public DownloadableBook(String ISBN, double basePrice, String zipCode) throws BookNotAvailableException {
		super(ISBN, basePrice, zipCode);	
	}
	
	public double calculateCost()
	{
		return super.calculateCost();
	}
	
	

}
