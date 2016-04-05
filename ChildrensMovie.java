package hw4;

public class ChildrensMovie extends Item {
	
    private int daysRented;

	public ChildrensMovie(String title) {
		super(title);
	}
	
    public void buyItem(Customer c) {
    	// TODO calculate price and add to customer's purchase list
    }
    
    public void rentItem(Customer c, int days) {
    	this.daysRented = days;
    	
    	double amount = 1.5;
    	if (days > 3) 
            amount += (days - 3) * 1.5;
    	
    	c.addRental(this, amount);
    }
    
    public int getFrequentRenterPoints() {
    	return 1;
    }
    
    public int getDaysRented() {
        return this.daysRented;
    }
}
