

public class Room {

    // Attributes
    private int roomNumber;
    private String roomType;
    private boolean isOccupied;
    private boolean isClean;

    // Constructor
    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = false;
        this.isClean = true;
    }

    // Methods
    public void checkIn() {
        if (!isOccupied && isClean) {
            isOccupied = true;
            isClean = false;
            System.out.println("Guest checked into room " + roomNumber);
        } else {
            System.out.println("Room is not available for check-in.");
        }
    }

    public void checkOut() {
        if (isOccupied) {
            isOccupied = false;
            isClean = false;
            System.out.println("Guest checked out of room " + roomNumber);
        } else {
            System.out.println("Room is already vacant.");
        }
    }

    public void cleanRoom() {
        if (!isOccupied) {
            isClean = true;
            System.out.println("Room " + roomNumber + " has been cleaned.");
        } else {
            System.out.println("Cannot clean an occupied room.");
        }
    }
}

