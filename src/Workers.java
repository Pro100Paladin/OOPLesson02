import java.time.LocalDate;

public abstract class Workers extends VeterinaryClinic{

    protected String name;
    protected String lastName;
    protected LocalDate dateOfBirth;
    protected String specialization;



    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Workers(String name, String lastName, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;


    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", lastName=" + lastName +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
