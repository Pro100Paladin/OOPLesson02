import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());
        Animal eagle = new Eagle("Kesha", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss");


        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        Duck duck = new Duck("Donald", LocalDate.of(1934, 5, 3), new ArrayList<>(), "Flu", "Walter");
        Penguin penguin = new Penguin("Lolo", LocalDate.of(1987, 6, 26), new ArrayList<>(), "Flu", "Gennady");

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(barsik, eagle, penguin, duck, new Fish("Pepe", LocalDate.of(1997, 2, 6), new ArrayList<>(), "Flu", "Harry"));
        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoables());


        Doctor doctor = new Doctor("Ben", "Ivanov", LocalDate.of(1987, 12, 24), "Hirurg", "Masha");
        Nurse nurse = new Nurse("Masha", "Petrova", LocalDate.of(2001, 1, 12));
        clinic.addWorkers(doctor, nurse);
        System.out.println(clinic.getWorkers());
        System.out.println(doctor + "Working hours " + Workable.duration + "\n" + "dinner " + doctor.dinner());
//        System.out.println(doctor.dinner());
        System.out.println(nurse + "Working hours " + nurse.duration + "\n" + "dinner " + nurse.dinner());



    }
}