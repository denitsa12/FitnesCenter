package fitnesscenter;

public class Trainee {

    private String name;
    private TrainingProgram program;


    public Trainee(String name) {
        this.name = name;
    }

    public void update(TrainingProgram newProgram) {
        this.program = newProgram;
        System.out.println(name + " was notified of the new program: " + newProgram.getName());
    }

    public void executeProgram() {
        if (program != null) {
            program.execute();
        }
    }
}
