package fussballManager;

public class MainTrainer extends Trainer implements Managable{

    private int manageExperience;

    MainTrainer(String name, int age, int trainExperience, int manageExperience) {
        super(name, age, trainExperience);
        this.manageExperience = manageExperience;
    }

    public int getManageExperience() {
        return manageExperience;
    }

    public void setManageExperience(int manageExperience) {
        this.manageExperience = manageExperience;
    }

    public Player addPlayer(Player player, Team team){
        //improvised return
        return new Goalkeeper();
    }
    public void removePlayer(){

    }
}
