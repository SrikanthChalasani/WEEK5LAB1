public enum ShippingLookup {
	SAME_DAY("24 hours", 20), THREE_DAY("72 hours", 15), GROUND(
			"5 days", 5);

	private String description;
	private int increment;

	ShippingLookup(String description, int increment) {
		this.description = description;
		this.increment = increment;
	}

	public String description()
	{
		return this.description;
	}
	
	public int increment()
	{
		return this.increment;
	}
}
