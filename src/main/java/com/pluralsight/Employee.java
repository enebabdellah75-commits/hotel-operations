
package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {

    // Attributes
    private String employeeName;
    private String jobTitle;
    private boolean isClockedIn;

    // Constructor
    public Employee(String employeeName, String jobTitle) {
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.isClockedIn = false;
    }

    // Punch in using a provided time
    public void punchIn(int time) {
        if (!isClockedIn) {
            isClockedIn = true;
            System.out.println(employeeName + " punched in at " + time);
        } else {
            System.out.println(employeeName + " is already punched in.");
        }
    }

    // Punch in using current time
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();

        int hour = now.getHour();
        int minute = now.getMinute();

        punchIn(hour * 100 + minute);
    }

    // Punch out using a provided time
    public void punchOut(int time) {
        if (isClockedIn) {
            isClockedIn = false;
            System.out.println(employeeName + " punched out at " + time);
        } else {
            System.out.println(employeeName + " is not punched in.");
        }
    }

    // Punch out using current time
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();

        int hour = now.getHour();
        int minute = now.getMinute();

        punchOut(hour * 100 + minute);
    }
}