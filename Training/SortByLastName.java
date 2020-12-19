import java.util.Comparator;

public class SortByLastName implements Comparator<Trainee>
{
    public int compare(Trainee trainee1, Trainee trainee2)
    {
        String lastName1 = trainee1.getLastName().toUpperCase();
        String lastName2 = trainee2.getLastName().toUpperCase();

        return lastName1.compareTo(lastName2);
    }
}
