package fussballManager;

public abstract class Trainer extends Person implements Trainable{

    private int trainExperience;

    Trainer(String name, int age, int trainExperience) {
        super(name, age);
        this.trainExperience = trainExperience;
    }

    public int getTrainExperience() {
        return trainExperience;
    }

    public void setTrainExperience(int trainExperience) {
        this.trainExperience = trainExperience;
    }

    public void trainDefense(){

    }
    public void trainPassing(){

    }
    public void trainShooting(){

    }
    public void trainPace(){

    }
    public void trainDribbling(){

    }
}
