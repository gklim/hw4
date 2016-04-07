package hw4;

public class VideoGame extends Item {
	
	public VideoGame(String title) {
		super(title);
		rentalPeriod = 5;
		rentalBaseCost = 1.5;
		sellBaseCost = 15;
	}
}
