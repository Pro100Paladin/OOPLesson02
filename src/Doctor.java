import java.time.LocalDate;

public class Doctor extends Workers implements Workable{

private String nurseName;


    public Doctor(String name, String lastName, LocalDate dateOfBirth, String specialization, String nurseName) {
        super(name, lastName, dateOfBirth);
        this.specialization = specialization;
        this.nurseName = nurseName;
    }



    public String getNurseName() {
        return nurseName;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", lastName=" + lastName +
                ", dateOfBirth=" + dateOfBirth +
                ", specialization='" + specialization + '\'' +
                ", nurseName='" + nurseName + '\'' +
                '}';
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
}


