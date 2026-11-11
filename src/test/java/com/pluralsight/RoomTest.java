package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkInShouldMakeRoomOccupiedAndDirty() {

        // Arrange
        Room room = new Room(101, "King Suite");

        // Act
        room.checkIn();

        // Assert
        assertTrue(room.isOccupied());
        assertFalse(room.isClean());
    }

    @Test
    void checkInShouldFailIfRoomIsAlreadyOccupied() {
        Room room = new Room(102, "King Suite");

        room.checkIn();
        room.checkIn();

        assertTrue(room.isOccupied());
        assertFalse(room.isClean());
    }


    @Test
    void checkInShouldFailIfRoomIsDirty() {

        // Arrange
        Room room = new Room(103, "Basic Double");
        room.checkIn();
        room.checkOut();

        // Act
        room.checkIn();

        // Assert
        assertFalse(room.isOccupied());
        assertFalse(room.isClean());
    }

    @Test
    void checkOutShouldMakeRoomVacantAndDirty() {

        // Arrange
        Room room = new Room(104, "King Suite");
        room.checkIn();

        // Act
        room.checkOut();

        // Assert
        assertFalse(room.isOccupied());
        assertFalse(room.isClean());
    }

    @Test
    void checkOutShouldNotChangeVacantRoom() {

        // Arrange
        Room room = new Room(105, "Basic Double");

        // Act
        room.checkOut();

        // Assert
        assertFalse(room.isOccupied());
        assertTrue(room.isClean());
    }

    @Test
    void cleanRoomShouldMakeRoomClean() {

        // Arrange
        Room room = new Room(106, "King Suite");
        room.checkIn();
        room.checkOut();

        // Act
        room.cleanRoom();

        // Assert
        assertFalse(room.isOccupied());
        assertTrue(room.isClean());
    }

    @Test
    void cleanRoomShouldNotCleanOccupiedRoom() {

        // Arrange
        Room room = new Room(107, "Basic Double");
        room.checkIn();

        // Act
        room.cleanRoom();

        // Assert
        assertTrue(room.isOccupied());
        assertFalse(room.isClean());
    }
}
