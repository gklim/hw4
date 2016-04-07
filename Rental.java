package hw4;

public class Rental {	
	private Item item;

	private int daysRented;
	
	public Rental(Item item, int daysRented) {
		this.item = item;
		this.daysRented = daysRented;
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public int getDaysRented() {
        return daysRented;
    }

	public double getCost() {
		return this.item.rent(getDaysRented());
	}
	
	public double getSaleCost() {
		return this.item.sell();
	}
	
	public int getfrequentRenterPoints(){
		if((this.item instanceof NewReleaseMovie) && (getDaysRented() > 1)) {
				return 2;
		}
		else return 1;
	}

}