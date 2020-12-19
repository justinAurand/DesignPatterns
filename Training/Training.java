import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Training {
    public static void main(String args[]) {
        ArrayList<Trainee> trainees = new ArrayList<Trainee>() {
            {
                add(new Trainee("John", "Denver", "Sales", LocalDate.of(2018, Month.JULY, 1)));
                add(new Trainee("Joan", "Baltimore", "Purchasing", LocalDate.of(2015, Month.APRIL, 15)));
                add(new Trainee("Jon", "Anchorage", "Production", LocalDate.of(2019, Month.AUGUST, 1)));
                add(new Trainee("Jean", "Dallas", "Sales", LocalDate.of(2017, Month.NOVEMBER, 15)));
                add(new Trainee("Jan", "Calgary", "Returns", LocalDate.of(2012, Month.FEBRUARY, 1)));
                add(new Trainee("Jane", "Fairbanks", "Reporting", LocalDate.of(2017, Month.JUNE, 20)));
                add(new Trainee("Juan", "Eastwood", "Packing", LocalDate.of(2018, Month.JANUARY, 25)));
                add(new Trainee("Joanne", "Gales", "Sales", LocalDate.of(2011, Month.DECEMBER, 1)));
                add(new Trainee("Jo", "Helsinki", "Personnel", LocalDate.of(2010, Month.MAY, 1)));
                add(new Trainee("Janine", "Koln", "Sales", LocalDate.of(2019, Month.APRIL, 5)));
                add(new Trainee("Daniel", "Martella", "Reporting", LocalDate.of(2020, Month.DECEMBER, 1)));
            }
        };

        Report report = new Report();
        report.generate(trainees);
    }
}
