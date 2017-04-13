import com.bobswarehouse.BookLookUpService;


public class Book implements IBook {

	private String ISBN;
	private double basePrice;
	private String zipCode;
	private int inStock;
	public Book(String ISBN,double basePrice,String zipCode) throws BookNotAvailableException
	{
		this.ISBN = ISBN;
		this.basePrice = basePrice;
		this.zipCode = zipCode;		
		this.inStock = (new BookLookUpService()).lookup(ISBN);
		if (this.inStock < 1) throw new BookNotAvailableException("Book Not in stock");
	}
	public int getInStock() {
		return inStock;
	}	
	@Override
	public double calculateCost() {		
		return (basePrice + SalesTaxLookup.lookup(this.zipCode));
	}
	public double getBasePrice() {
		return basePrice;
	}	

}
