package ca.demo.salestool;

public class Main {
	public static void main(String[] args) {
		SalesData data = new SalesData();

		displayGreeting();
		data.display();
	}

	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLES!");
		System.out.println("This app shows sales data.");
		System.out.println("--------------------------");
		
		System.out.println("test 2");
	}
}
