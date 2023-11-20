import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tickets {

	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<>();
		ArrayList<Booking> bookings = new ArrayList<>();
		
		buses.add(new Bus(1, true, 2));
		buses.add(new Bus(2, false, 150));
		buses.add(new Bus(3, true, 200));
		
		int userOption = 1;
		Scanner sc = new Scanner(System.in);
		
		while (userOption == 1) {
			System.out.println("Enter 1 to Book and Enter 2 to exit and Enter 3 to view all bookings");
			userOption = sc.nextInt();
			if (userOption == 1) {
					for(Bus b:buses) {
			b.displayBusInfo();
		}
				Booking booking = new Booking();
				if (booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					System.out.println("Your Booking is Confirmed");
				} else {
					System.out.println("Sorry, Bus is full. Try another Bus or Date.");
				}
			}else if(userOption == 3){
				System.out.println("Name \t\t Bus No \t\t Booking Date");
				System.out.println("-----------------------------------------------------");

				for(int i=0; i<bookings.size(); i++){
					System.out.println(bookings.get(i).passengerName + "\t\t " + bookings.get(i).busNo + "\t\t\t"
							+ bookings.get(i).dateInput);
				}
				System.out.println("-----------------------------------------------------");
			}
		}
		System.out.println("Enter 1 to Book and Enter 2 to exit and Enter 3 to view all bookings");
		userOption = sc.nextInt();
		if (userOption == 1) {
			for (Bus b : buses) {
				b.displayBusInfo();
			}
		}
	}
}

class Bus{
	private int busNo;
	private boolean ac;
	private int capacity;//get and set
	
	Bus(int no, boolean ac, int cap) {
		this.busNo = no;
		this.ac=ac;
		this.capacity=cap;
	}

	public int getBusNo() {
		return busNo;
	}
	public boolean isAc() {//accessor method
		return ac;
	}
	public int getCapacity() {//accessor method
		return capacity;
	}
	public void setAc(boolean val) {//mutators
		ac = val;
	}
	public void setCapacity(int cap) {//mutators
		capacity = cap;
	}

public void displayBusInfo() {
	System.out.println("Bus No:" + busNo + "  AC:" + ac + "  Total Capacity:" + capacity);
	}

}

class Booking{
	String passengerName;
	int busNo;
	String dateInput;
	Date date;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of Passenger: ");
		passengerName=scanner.next();
		System.out.println("Enter Bus No: ");
		busNo=scanner.nextInt();
		System.out.println("Enter date dd/mm/yyyy: ");
		 dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyy");
		
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		for (Bus bus : buses) {
			if (bus.getBusNo() == busNo) {
				capacity = bus.getCapacity();
			}
		}
		int booked = 0;
		for (Booking b : bookings) {
			if (b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked < capacity ? true : false;
	}
}
