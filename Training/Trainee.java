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

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(firstName + " ");
        builder.append(lastName + " ");
        builder.append(department + " ");
        builder.append(hired + " ");

        return builder.toString();
    }
}
