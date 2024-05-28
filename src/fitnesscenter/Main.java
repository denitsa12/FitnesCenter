package fitnesscenter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gym gym = Gym.getInstance();


        Trainee trainee1 = new Trainee("Maria");
        Trainee trainee2 = new Trainee("Petar");


        gym.attach(trainee1);
        gym.attach(trainee2);


        TrainingProgram cardioProgram = new CardioProgram();
        TrainingProgram strengthProgram = new StrengthProgram();


        TrainingProgram customCardioProgram = new StretchingDecorator(cardioProgram);
        TrainingProgram customStrengthProgram = new YogaDecorator(strengthProgram);


        gym.setProgram(customCardioProgram);


        trainee1.executeProgram();
        trainee2.executeProgram();


        gym.setProgram(customStrengthProgram);


        trainee1.executeProgram();
        trainee2.executeProgram();

    }
}