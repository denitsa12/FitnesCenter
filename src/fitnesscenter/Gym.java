package fitnesscenter;

import java.util.ArrayList;
import java.util.List;

public class Gym {
    private static Gym instance;

    private List<Trainee> observers = new ArrayList<>();
    private TrainingProgram currentProgram;

    private Gym () {}

    public static Gym getInstance() {
        if (instance == null) {
            instance = new Gym();
        }
        return instance;
    }

    public void attach(Trainee observer) {
        observers.add(observer);
    }

    public void detach(Trainee observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Trainee observer : observers) {
            observer.update(currentProgram);
        }
    }

    public void setProgram(TrainingProgram program) {
        this.currentProgram = program;
        notifyObservers();
    }

}
