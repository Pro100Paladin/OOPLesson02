import java.time.LocalDate;

public class Nurse extends Workers implements Workable{
    public Nurse(String name, String lastName, LocalDate dateOfBirth) {
        super(name, lastName, dateOfBirth);

    }


    @Override
    public double startWorking() {
        System.out.print("Working hours ");
        return duration;
    }

    @Override
    public String dinner() {
        return "12.00 - 13:00";
    }
}
