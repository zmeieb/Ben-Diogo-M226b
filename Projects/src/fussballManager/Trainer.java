package fussballManager;

public abstract class Trainer extends Person {

    Trainer(String name, int age, Team team, int trainExperience) {
        super(name, age, team);
        this.trainExperience = trainExperience;
    }

    private int trainExperience;

    public int getTrainExperience() {
        return trainExperience;
    }

    public void setTrainExperience(int trainExperience) {
        this.trainExperience = trainExperience;
    }
}
