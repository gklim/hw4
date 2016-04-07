package hw4;

public class Book extends Item {
	
	public Book(String title) {
		super(title);
		rentalPeriod = 2;
		rentalBaseCost = .5;
		lateFee = 1;
	}
	
}