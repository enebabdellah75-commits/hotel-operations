package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchInShouldSetClockedIn() {
        Employee employee = new Employee("Eneb", "Manager");

        employee.punchIn(830);

        assertTrue(employee.isClockedIn());
    }

    @Test
    void punchOutShouldSetClockedOut() {
        Employee employee = new Employee("Eneb", "Manager");

        employee.punchIn(830);
        employee.punchOut(1615);

        assertFalse(employee.isClockedIn());
    }

    @Test
    void punchInShouldNotAllowSecondPunchIn() {
        Employee employee = new Employee("Eneb", "Manager");

        employee.punchIn(830);
        employee.punchIn(900);

        assertTrue(employee.isClockedIn());
    }

    @Test
    void punchOutShouldNotWorkIfNotClockedIn() {
        Employee employee = new Employee("Eneb", "Manager");

        employee.punchOut(1615);

        assertFalse(employee.isClockedIn());
    }


}