
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

    // Methods
    public void punchIn() {
        if (!isClockedIn) {
            isClockedIn = true;
            System.out.println(employeeName + " punched in.");
        } else {
            System.out.println(employeeName + " is already punched in.");
        }
    }

    public void punchOut() {
        if (isClockedIn) {
            isClockedIn = false;
            System.out.println(employeeName + " punched out.");
        } else {
            System.out.println(employeeName + " is not punched in.");
        }
    }
}
