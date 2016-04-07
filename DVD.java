package hw4;

public class DVD extends Item {
	
	public DVD(String title) {
		super(title);
		rentalPeriod = 3;
		rentalBaseCost = 1;
		lateFee = 1.5;
	}

}