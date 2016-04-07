package hw4;

public class ChildrensMovie extends Item {
	
    private int daysRented;

	public ChildrensMovie(String title) {
		super(title);
		rentalPeriod = 2;
		rentalBaseCost = 2;
		lateFee = 1.5;
	}
}
