import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();

    public void addPatient(Animal animal){
        patients.add(animal);
    }
    public void addPatients(Animal ... animals){
        Collections.addAll(patients, animals);
    }
    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }

    private List<Workers> Workers = new ArrayList<>();
    public void addWorkers(Workers workers){
        Workers.add(workers);
    }
    public void addWorkers(Workers ... workers){
        Collections.addAll(Workers, workers);
    }

    public List<Workers> getWorkers(){
        return Workers;
    }


}
