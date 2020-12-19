import java.time.Duration;
import java.time.LocalDate;

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

    public int calculateSeniority() {
        LocalDate today = LocalDate.now();
        int seniority = Duration.between(hired, today).getNano();
        return seniority;
    };

    // This is an override of the toString function built into Java.
    // Any time you print something to the console, the toString function, built into all types, is called behind the scenes.
    // For complex objects like our Trainee class, toString usually prints the class name and some memory location garbage.
    // Here, we're "overriding" toSring to print something meaningful when called.
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(firstName + " ");
        builder.append(lastName + " ");
        builder.append(department + " ");
        builder.append(hired + " ");

        return builder.toString();
    }
}
