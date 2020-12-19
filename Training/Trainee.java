import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Trainee {
    private String firstName;
    private String lastName;
    private String department;
    private LocalDate hired;

    public Trainee(String firstName, String lastName, String department, LocalDate hired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.hired = hired;
    }

    // Added so we can sort by it
    public String getLastName() {
        return lastName;
    }

    // Added so we can sort by it
    public String getDepartment() {
        return department;
    }

    public int calculateSeniority() {
        LocalDate today = LocalDate.now();

        // Calculating seniority in months (since no one is hired in both the same month and year)
        int monthsEmployed = (int)Period.between(today, hired).toTotalMonths();

        return monthsEmployed;
    };

    // This is an override of the toString function built into Java.
    // Any time you print something to the console, the toString function, built into all types, is called behind the scenes.
    // For complex objects like this Trainee class, toString usually prints the class name and some memory location garbage.
    // Here, we're "overriding" toSring to print something meaningful when called.
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(firstName + ", ");
        builder.append(lastName + ", ");
        builder.append(department + ", ");
        builder.append(hired);

        return builder.toString();
    }
}
