package hw4;

public abstract class Item {
	public String title;
	protected int rentalPeriod;
	protected double rentalBaseCost;
	protected double lateFee;
	
	public Item(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public double rent(int daysRented) {
		double rentalCost = rentalBaseCost * daysRented;
		if(daysRented > rentalPeriod) {
			rentalCost += lateFee * (daysRented - rentalPeriod);
		}
		return rentalCost;
	}
	
	public double sell() {
		return rentalBaseCost * 5;
	}
}