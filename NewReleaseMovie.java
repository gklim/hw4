package hw4;

public class NewReleaseMovie extends Item {
	
	public NewReleaseMovie(String title) {
		super(title);
	}
	
	@Override
	public double rent(int daysRented) {
		return daysRented * 3;
	}
	
	@Override
	public double sell(){
		return 20; 
	}
}
