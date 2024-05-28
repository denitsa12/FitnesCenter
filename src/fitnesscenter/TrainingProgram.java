package fitnesscenter;

public class TrainingProgram {

    private String name;

    public TrainingProgram(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void execute() {

    }
}

class CardioProgram extends TrainingProgram {
    public CardioProgram() {
        super("Cardio Program");
    }

    @Override
    public void execute() {
        System.out.println("Executing Cardio Program");
    }
}

class StrengthProgram extends TrainingProgram {
    public StrengthProgram() {
        super("Strength Program");
    }

    @Override
    public void execute() {
        System.out.println("Executing Strength Program");
    }
}
