import java.util.Comparator;

public class SortByDepartment implements Comparator<Trainee>
{
    public int compare(Trainee trainee1, Trainee trainee2)
    {
        String department1 = trainee1.getDepartment().toUpperCase();
        String department2 = trainee2.getDepartment().toUpperCase();

        return department1.compareTo(department2);
    }
}
