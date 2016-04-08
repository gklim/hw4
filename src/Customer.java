package hw4;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Rental> rentalList;
	private ArrayList<Rental> saleList;
	private int frequentRenterPoints;
	private double totalCost;
    
    public Customer (String name) {
    	this.name = name;
		rentalList = new ArrayList<>();
		saleList = new ArrayList<>();
		frequentRenterPoints = 0;
		totalCost = 0.0;
    }
    
    public void addRental(Rental rental) {
    	rentalList.add(rental);
		totalCost += rental.getCost();
		addPreferredRenterPoints(rental);
    }
    
    public void addSale(Rental rental) {
		saleList.add(rental);
		totalCost += rental.getSaleCost();
	}
    
    public String getName() {
        return this.name;
    }
    
    public String printStatement() {
    	String result = "";
    	result += ("Customer: " + name + "\n");
    	for(int i = 0; i < rentalList.size(); i++){
    		result += rentalList.get(i).getItem().getTitle() + "\t" + String.valueOf(rentalList.get(i).getCost()) + "\n";
    	}
    	
    	for(int i = 0; i < saleList.size(); i++){
    		result += saleList.get(i).getItem().getTitle() + "\t" + String.valueOf(saleList.get(i).getCost() + "\n");
    	}
    	
    	result += "Amount owed is " + String.valueOf(totalCost) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
    
    public String printStatementHtml() {
    	String result = "<html>\n<head>\n<title>Your Statement</title>\n</head>\n<body>\n";
    	result += printStatement();
    	result += "\n</body>\n</html>";
    	return result;
    }
    
    private void addPreferredRenterPoints(Rental rental) {
		frequentRenterPoints += rental.getfrequentRenterPoints();
	}
}