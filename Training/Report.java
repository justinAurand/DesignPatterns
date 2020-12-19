import java.util.ArrayList;

public class Report {
    public void generate(ArrayList<Trainee> trainees) {
        ArrayList<Trainee> traineesSortedByLastName = sortAlphabeticallyByLastName(trainees);
        ArrayList<Trainee> traineesSortedByDepartment = sortAlphabeticallyByDepartment(trainees);
        ArrayList<Trainee> traineesSortedBySeniorityDescending = sortBySeniorityDescending(trainees);

        print(traineesSortedByLastName);
        print(traineesSortedByDepartment);
        print(traineesSortedBySeniorityDescending);
    }

    private ArrayList<Trainee> sortAlphabeticallyByLastName(ArrayList<Trainee> trainees) {
        return trainees;
    }

    private ArrayList<Trainee> sortAlphabeticallyByDepartment(ArrayList<Trainee> trainees) {
        return trainees;
    }

    private ArrayList<Trainee> sortBySeniorityDescending(ArrayList<Trainee> trainees) {
        return trainees;
    }

    private void print(ArrayList<Trainee> trainees) {
        System.out.println("First Name, Last Name, Department, Hired Date");
        for (int i = 0; i < trainees.size(); i++) {
            System.out.println(trainees.get(i));
        }
        System.out.println();
    }
}
