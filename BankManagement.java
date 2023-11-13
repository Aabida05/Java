import java.util.ArrayList;
import java.util.Scanner;

class Customers {
	public int balance;
	public String name;
	public int ID;

	public Customers(String name, int ID, int balance) {
		this.name = name;
		this.ID = ID;
		this.balance = balance;
	}
}

public class BankManagement {

	public static void main(String[] args) {

		
		ArrayList<Customers> customers = new ArrayList();

		System.out.println("1 - Add Customer");
		System.out.println("2 - Deposit Money");
		System.out.println("3 - Withdraw Money");
		System.out.println("4 - View All Customer");
		System.out.println("0 - exit");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the option: ");
		int option = scanner.nextInt();

		while (option != 0) {

			if (option == 1) {
				System.out.print("Enter customer name :");
				String name = scanner.next();
				System.out.print("Enter customer ID :");
				int ID = scanner.nextInt();
				int balance = 0;
				customers.add(new Customers(name, ID, balance));

				System.out.println("\n\n customer added \n\n ");
			}

			else if (option == 2) {
				System.out.print("Enter customer ID :");
				int ID = scanner.nextInt();
				System.out.println("Deposit amount :");
				int amount = scanner.nextInt();

				for (int i = 0; i < customers.size(); i++) {
					if (ID == customers.get(i).ID) {
						customers.get(i).balance += amount;
						System.out.println("amount is added");
					}
				}


			}

			else if (option == 3) {
				System.out.println("Enter customer ID :");
				int ID = scanner.nextInt();
				System.out.println("withdraw amount :");
				int amount = scanner.nextInt();

				for (int i = 0; i < customers.size(); i++) {
					if (ID == customers.get(i).ID) {
						if (customers.get(i).balance >= amount) {
						customers.get(i).balance = customers.get(i).balance - amount;


						System.out.println("amount is given");
					} else {
						System.out.println("\ninsufficiant balance\n");
					}

					}
				}
			}

			else if (option == 4) {
				System.out.println("Name \t\t ID \t\t Balance");
				System.out.println("------------------------------------------------------------");

				for (int i = 0; i < customers.size(); i++) {

					System.out.println(
							customers.get(i).name + "\t\t" + customers.get(i).ID + "\t\t" + customers.get(i).balance);
				}
				System.out.println("------------------------------------------------------------\n\n");
			}

			System.out.println("1 - Add Customer");
			System.out.println("2 - Deposit Money");
			System.out.println("3 - Withdraw Money");
			System.out.println("4 - View All Customer");
			System.out.println("0 - exit");
			option = scanner.nextInt();


		}
	}

}
