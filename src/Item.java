public abstract class Item {
	public String title;
	protected int rentalPeriod;
	protected double rentalBaseCost;
	protected double sellBaseCost;
	
	public Item(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public double rentCharge(int daysRented) {
		double result = rentalBaseCost;
		if(daysRented > rentalPeriod) {
			result += (daysRented - rentalPeriod) * 1.5;
		}
		return result;
	}
	
	public double sellCharge() {
		return sellBaseCost * 3;
	}
}