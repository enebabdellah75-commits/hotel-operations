public class Main {

    public static void main(String[] args) {

        // Test Room
        Room room = new Room(2, 124.00, false, false);

        System.out.println("ROOM");
        System.out.println("Beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());

        // Test Reservation
        Reservation reservation =
                new Reservation("king", 2, true);

        System.out.println("\nRESERVATION");
        System.out.println("Room type: " + reservation.getRoomType());
        System.out.println("Price per night: $" + reservation.getPrice());
        System.out.println("Nights: " + reservation.getNumberOfNights());
        System.out.println("Weekend: " + reservation.isWeekend());
        System.out.println("Total: $" + reservation.getReservationTotal());

        // Test Employee
        Employee employee = new Employee(
                101, "Eneb", "Front Desk", 21.00, 45
        );

        System.out.println("\nEMPLOYEE");
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Pay rate: $" + employee.getPayRate());
        System.out.println("Hours worked: " + employee.getHoursWorked());
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());
        System.out.println("Total pay: $" + employee.getTotalPay());
    }
}