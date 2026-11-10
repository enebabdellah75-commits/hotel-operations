public class HotelOperations {
    public static void main(String[] args) {

        // Create a Room object
        Room room = new Room(101, "Deluxe");

        // Create an Employee object
        Employee employee = new Employee("Eneb", "Receptionist");

        // Create a Reservation object
        Reservation reservation = new Reservation(1001, "Sarah", 101);

        // Test Room methods
        System.out.println("=== ROOM OPERATIONS ===");

        room.checkIn();
        room.checkOut();
        room.cleanRoom();

        // Test Employee methods
        System.out.println("\n=== EMPLOYEE OPERATIONS ===");

        employee.punchIn();
        employee.punchOut();

    }
}
