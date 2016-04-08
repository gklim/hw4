public class NewReleaseMovie extends Item {

    private int daysRented;

	public NewReleaseMovie(String title) {
		super(title);
	}
	
	public void buyItem(Customer c) {
    	// TODO calculate price and add to customer's purchase list
    }
	
    public void rentItem(Customer c, int days) {
    	this.daysRented = days;
    	
    	double amount = days * 3;
    	
    	c.addRental(this, amount);
    }
    
    public int getFrequentRenterPoints() {
    	return (daysRented > 1) ? 2 : 1;
    }
    
    public int getDaysRented() {
        return this.daysRented;
    }
}
