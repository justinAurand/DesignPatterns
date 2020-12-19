import java.time.LocalDate;
import java.util.ArrayList;

public class Training {
    public static void main(String args[]) {
        ArrayList<Trainee> trainees = new ArrayList<Trainee>() {
            {
                add(new Trainee("John", "Denver", "Sales", LocalDate.now()));
            }
        };

        System.out.println(trainees.get(0).toString());
    }
}
