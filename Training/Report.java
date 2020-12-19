import java.util.ArrayList;

public class Report {
    public void generate(ArrayList<Trainee> trainees) {
        for (int i = 0; i < trainees.size(); i++) {
            System.out.println(trainees.get(i));
        }
    }
}
