import java.util.Comparator;

public class SortBySeniorityDescending implements Comparator<Trainee>
{
    public int compare(Trainee trainee1, Trainee trainee2)
    {
        int seniority1 = trainee1.calculateSeniority();
        int seniority2 = trainee2.calculateSeniority();

        return seniority1 - seniority2;
    }
}
