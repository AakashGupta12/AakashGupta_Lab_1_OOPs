public enum RoomStatus {
	EMPTY,
 	NOT_EMPTY;
}

public enum Occupancy {
	SINGLE,
	DOUBLE,
	TRIPLE;
}

public enum PaymentStatus {
	PAID,
	UNPAID;
}

class Customer{
	int userId;
	String name;
	Date dateOfBirth;
	String mobNo;
	String emailId;
}

class Room {
	int roomNo;
	int hotelId;
	RoomType roomType;
	RoomStatus roomStatus;
}

class Hotel {
	int hotelId;
	String hotelName;
	Address address;
	List<Room> rooms;
	float rating;
}

class Booking {
	int bookingId;
	int userId;
	int hotelId;
	List<Rooms> bookedRooms;
	int amount;
	PaymentStatus status_of_payment;
	Date bookingTime;
	Duration duration;
}

class RequestStatus{
	enum Occupancy;
	int floorId;
	boolean isAC;
}

public static void main(String[] args){

}
