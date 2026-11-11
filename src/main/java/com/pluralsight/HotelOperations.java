package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {

        // Create a com.pluralsight.Room object
        Room room = new Room(101, "Deluxe");

        // Create an com.pluralsight.Employee object
        Employee employee = new Employee("Eneb", "Receptionist");

        // Create a com.pluralsight.Reservation object
        Reservation reservation = new Reservation(1001, "Sarah", 101);

        // Test com.pluralsight.Room methods
        System.out.println("=== ROOM OPERATIONS ===");

        room.checkIn();
        room.checkOut();
        room.cleanRoom();

        // Test com.pluralsight.Employee methods
        System.out.println("\n=== EMPLOYEE OPERATIONS ===");

        employee.punchIn();
        employee.punchOut();

        Employee employee1 = new Employee("Sarah", "Manager");

        employee.punchIn(830);
        employee.punchOut(1615);

        Employee employee2 = new Employee("John", "Receptionist");

        employee2.punchIn();
        employee2.punchOut();



        //Testing the hotel
        //Create hotel
        Hotel hotel = new Hotel("Grand Hotel", 20, 50);

        // Display available rooms
        System.out.println("Available Suites: "
                + hotel.getAvailableSuites());

        System.out.println("Available Basic Rooms: "
                + hotel.getAvailableRooms());

        // Book 3 suites
        System.out.println("Suite booking successful: "
                + hotel.bookRoom(3, true));

        // Book 5 basic rooms
        System.out.println("Basic room booking successful: "
                + hotel.bookRoom(5, false));

        // Display updated availability
        System.out.println("Available Suites: "
                + hotel.getAvailableSuites());

        System.out.println("Available Basic Rooms: "
                + hotel.getAvailableRooms());
    }

    }

