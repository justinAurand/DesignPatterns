import java.util.ArrayList;
import java.util.Collections;

public class Report {
    public void generate(ArrayList<Trainee> trainees) {
        Collections.sort(trainees, new SortByLastName());
        print(trainees);

        Collections.sort(trainees, new SortByDepartment());
        print(trainees);

        Collections.sort(trainees, new SortBySeniorityDescending());
        print(trainees);
    }

    private void print(ArrayList<Trainee> trainees) {
        System.out.println("First Name, Last Name, Department, Hired Date");

        for (int i = 0; i < trainees.size(); i++) {
            System.out.println(trainees.get(i));
        }

        System.out.println();
    }
}
