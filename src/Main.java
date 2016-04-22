public class Main {

	public static void main(String[] args) {
		ChildrensMovie m = new ChildrensMovie("Kangaroo Jack");
		RegularMovie r = new RegularMovie("Con Air");
		NewReleaseMovie n = new NewReleaseMovie("Sharknado");
		VideoGame g = new VideoGame("Mario");
		Rental firstRental = new Rental(m, 2);
		Rental secondRental = new Rental(r, 2);
		Rental thirdRental = new Rental(n, 2);
		Rental fourthRental = new Rental(g, 5);
		
		Customer customer = new Customer("Joe");
		
		customer.addRental(firstRental);
		customer.addRental(secondRental);
		customer.addRental(thirdRental);
		customer.addSale(fourthRental);

		System.out.println(customer.printStatement());
	}
}