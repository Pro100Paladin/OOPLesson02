import java.time.LocalDate;

public class Nurse extends Workers implements Workable{
    public Nurse(String nurseName, String lastName, LocalDate dateOfBirth) {
        super(nurseName, lastName, dateOfBirth);

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

    @Override
    public String examinesThePatient() {
        return null;
    }
}
