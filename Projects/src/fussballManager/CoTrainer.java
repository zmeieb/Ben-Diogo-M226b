package fussballManager;

public class CoTrainer extends Trainer{

    CoTrainer(String name, int age, Team team, int trainExperience, String rank) {
        super(name, age, team, trainExperience);
        this.rank = rank;
    }

    private String rank;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
