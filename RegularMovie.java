package hw4;

public class RegularMovie extends Item {
	
    private int daysRented;

	public RegularMovie(String title) {
		super(title);
	}
	
	public void buyItem(Customer c) {
    	// TODO calculate price and add to customer's purchase list
    }
	
    public void rentItem(Customer c, int days) {
    	this.daysRented = days;
    	
    	double amount = 2.0;
    	if(days > 2)
    		amount += (days - 2) * 1.5;
    	
    	c.addRental(this, amount);
    }
    
    public int getFrequentRenterPoints() {
    	return 1;
    }
    
    public int getDaysRented() {
        return this.daysRented;
    }
}