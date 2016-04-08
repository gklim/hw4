public abstract class Item {
    
    private String title;
    
    public Item(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return this.title;
    }
     
    abstract void rentItem(Customer c, int days);
    abstract void buyItem(Customer c);
    abstract int getFrequentRenterPoints();
    abstract int getDaysRented();
}