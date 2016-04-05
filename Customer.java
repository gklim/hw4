package hw4;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private Map<Item, Double> rentals = new HashMap<Item, Double>();
    
    public Customer (String name) {
        this.name = name;
    }
    
    public void addRental(Item rental, double amount) {
        this.rentals.put(rental, amount);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String printStatement() {
    
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";
 
        for(Map.Entry<Item, Double> each : this.rentals.entrySet()) {
            
            double thisAmount = each.getValue();
            frequentRenterPoints += each.getKey().getFrequentRenterPoints();
            
            // show figures for this rental
            result += "\t" + each.getKey().getTitle() +
                      "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        
        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You have earned " + String.valueOf(frequentRenterPoints) +
                  " frequent renter points";
        return result;
    }
    
    public String printStatementHtml() {
    	String result = "<html>\n<head>\n<title>Your Statement</title>\n</head>\n<body>\n";
    	result += printStatement();
    	result += "\n</body>\n</html>";
    	return result;
    }
}