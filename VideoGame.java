package hw4;

public class VideoGame extends Item {
	
    private int daysRented;

	public VideoGame(String title) {
		super(title);
	}
	
	public void buyItem(Customer c) {
    	// TODO calculate price and add to customer's purchase list
    }
	
    public void rentItem(Customer c, int days) {
    	// TODO calculate price and add to customer's purchase list
    }
    
    public int getFrequentRenterPoints() {
    	return 1;
    }
    
    public int getDaysRented() {
        return this.daysRented;
    }
}