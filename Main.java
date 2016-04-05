package hw4;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer("Zach");
		ChildrensMovie m = new ChildrensMovie("Kangaroo Jack");
		RegularMovie r = new RegularMovie("Con Air");
		NewReleaseMovie n = new NewReleaseMovie("Sharknado");
		m.rentItem(c, 3);
		r.rentItem(c, 3);
		n.rentItem(c, 2);
		System.out.println(c.printStatement());
		System.out.println("\n");
		System.out.println(c.printStatementHtml());
	}
}