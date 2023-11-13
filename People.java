package com.project;

import java.util.Scanner;

class PeopleList {
	public String name;
	public int ID;
	public int age;

	public PeopleList(String name, int ID, int age) {
		this.name = name;
		this.ID = ID;
		this.age = age;

	}
}

public class People {

	public static void main(String[] args) {
		
		int length = 0;
		PeopleList[] customers = new PeopleList[500];

		System.out.println("1 - Add person");
		System.out.println("2 - People who are plus eighteen");
		System.out.println("3 - People who are under eighteen");
		System.out.println("4 - View all people");
		System.out.println("0 - exit");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the option: ");
		int option = scanner.nextInt();

		while (option != 0) {

			// Add customer
			switch (option) {
			case 1:
			System.out.print("Enter the name :");
			String name = scanner.next();
			System.out.print("Enter the ID :");
			int ID = scanner.nextInt();
			System.out.println("Enter age :");
			int age = scanner.nextInt();


			customers[length] = new PeopleList(name, ID, age);
			length++;

			System.out.println("\n\n customer added \n\n ");
			break;

		case 2:
			System.out.println("name \t\t ID \t\t age");
			System.out.println("-----------------------------------");

			for (int i = 0; i < length; i++) {
				if (customers[i].age > 18) {
					System.out.println(customers[i].name + "\t\t" + customers[i].ID + "\t\t" + customers[i].age);
				}
			}
			System.out.println("-----------------------------------");

			break;

		case 3:
			System.out.println("name \t\t ID \t\t age");
			System.out.println("-----------------------------------");

			for (int i = 0; i < length; i++) {
				if (customers[i].age <= 18) {
					System.out.println(customers[i].name + "\t\t" + customers[i].ID + "\t\t" + customers[i].age);
				}

			}
			System.out.println("-----------------------------------");

			break;

		case 4:
			System.out.println("Name \t\t ID \t\t age ");
			System.out.println("-----------------------------------");

			for (int i = 0; i < length; i++) {

				System.out.println(customers[i].name + "\t\t" + customers[i].ID + "\t\t" + customers[i].age);
			}
			System.out.println("\n-----------------------------------\n");

		}

//		if (option == 1) {
//			System.out.print("Enter customer name :");
//			String name = scanner.next();
//			System.out.print("Enter customer ID :");
//			int ID = scanner.nextInt();
//			System.out.println("Enter customer age :");
//			int age = scanner.nextInt();
//
//
//			customers[length] = new PeopleList(name, ID, age);
//			length++;
//
//			System.out.println("\n\n customer added \n\n ");

//			}

//			else if (option == 2) {
//
//				System.out.println("name \t\t ID \t\t age");
//				System.out.println("---------------------------------------");
//
//				for (int i = 0; i < length; i++) {
//					if (customers[i].age > 18) {
//						System.out.println(customers[i].name + "\t\t" + customers[i].ID + "\t\t" + customers[i].age);
//						System.out.println("\n-------------------------------------------------------\n");
//
//					}
//				}
//			}
//
//			else if (option == 3) {
//				System.out.println("name \t\t ID \t\t age");
//				System.out.println("-----------------------------------");
//
//				for (int i = 0; i < length; i++) {
//					if (customers[i].age <= 18) {
//						System.out.println(customers[i].name + "\t\t" + customers[i].ID + "\t\t" + customers[i].age);
//						System.out.println("\n-------------------------------------------------\n");
//					}
//				}
//			}
//
//			else if (option == 4) {
//
//				System.out.println("Name \t\t ID \t\t age ");
//				System.out.println("------------------------------------------------------------");
//
//				for (int i = 0; i < length; i++) {
//
//					System.out.println(customers[i].name + "\t\t" + customers[i].ID + "\t\t" + customers[i].age);
//				}
//				System.out.println("\n\n------------------------------------------------------------\n\n");
//			}

			System.out.println("1 - Add person");
			System.out.println("2 - People who are under eighteen");
			System.out.println("3 - People who are plus eighteen");
			System.out.println("4 - View all people");
			System.out.println("0 - exit");

			System.out.print("Enter the option: ");
			option = scanner.nextInt();
		}
	}
}
