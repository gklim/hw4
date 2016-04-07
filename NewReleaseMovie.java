package hw4;

public class NewReleaseMovie extends Item {
	
	public NewReleaseMovie(String title) {
		super(title);
	}
	
	@Override
	public double rentCharge(int daysRented) {
		return daysRented * 3;
	}
	
	@Override
	public double sellCharge(){
		return 20; 
	}
}
