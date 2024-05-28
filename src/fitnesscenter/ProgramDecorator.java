package fitnesscenter;

abstract class ProgramDecorator extends TrainingProgram{

    protected TrainingProgram decoratedProgram;

    public ProgramDecorator(TrainingProgram decoratedProgram) {
        super(decoratedProgram.getName());
        this.decoratedProgram = decoratedProgram;
    }

    @Override
    public void execute() {
        decoratedProgram.execute();
    }
}

class StretchingDecorator extends ProgramDecorator {
    public StretchingDecorator(TrainingProgram decoratedProgram) {
        super(decoratedProgram);
    }

    @Override
    public void execute() {
        decoratedProgram.execute();
        System.out.println("Adding stretching exercises");
    }
}

class YogaDecorator extends ProgramDecorator {
    public YogaDecorator(TrainingProgram decoratedProgram) {
        super(decoratedProgram);
    }

    @Override
    public void execute() {
        decoratedProgram.execute();
        System.out.println("Adding yoga exercises");
    }
}
