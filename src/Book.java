public class Book extends Item {
	
	public Book(String title) {
		super(title);
		rentalPeriod = 2;
		rentalBaseCost = .5;
		sellBaseCost = 10;
	}
	
}