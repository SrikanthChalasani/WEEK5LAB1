public class HardCoverBook extends Book {

	private String shippingmode;

	public HardCoverBook(String ISBN, double basePrice, String zipCode,
			String shippingmode) throws BookNotAvailableException {
		super(ISBN, basePrice, zipCode);
		this.shippingmode = shippingmode;
	}

	@Override
	public double calculateCost() {
		return (super.calculateCost() + (ShippingLookup.valueOf(
				this.shippingmode).increment() * super.getBasePrice()));
	}
}
