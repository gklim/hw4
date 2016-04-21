package hw4;


import java.util.ArrayList;
public class AgeRenterPoints implements RenterPoints{

	@Override
	public int calculatePoints(ArrayList<Rental> movieList, int points) {
		return points *= 2;
	}

	@Override
	public boolean rewardEligible(ArrayList<Rental> movieList, int age) {
		if(age > 17 && age < 23) {
			for(Rental rental : movieList) {
	        	if(rental.getItem() instanceof NewReleaseMovie) return true;
	        }
		}
		return false;
	}
}
