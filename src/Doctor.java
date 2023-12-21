import java.time.LocalDate;

public class Doctor extends Workers implements Workable{

protected String nurseName;


    public Doctor(String name, String lastName, LocalDate dateOfBirth, String specialization, String nurseName) {
        super(name, lastName, dateOfBirth);
        this.specialization = specialization;
        this.nurseName = nurseName;
    }


    @Override
    public double startWorking() {
        System.out.print("Working hours ");
        return duration;
    }

    @Override
    public String dinner() {
        return "12:15 - 13.00";
    }

    @Override
    public String examinesThePatient() {
        return null;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nurseName='" + nurseName + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}


