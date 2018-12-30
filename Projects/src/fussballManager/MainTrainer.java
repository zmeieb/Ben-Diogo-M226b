package fussballManager;

public class MainTrainer extends Trainer {

    MainTrainer(String name, int age, Team team, int trainExperience, int manageExperience) {
        super(name, age, team, trainExperience);
        this.manageExperience = manageExperience;
    }

    private int manageExperience;

    public int getManageExperience() {
        return manageExperience;
    }

    public void setManageExperience(int manageExperience) {
        this.manageExperience = manageExperience;
    }
}
