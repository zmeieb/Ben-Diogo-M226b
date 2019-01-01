package fussballManager;

public abstract class Player extends Person{

    private int number;
    private int defending;
    private int passing;
    private int shooting;
    private int pace;
    private int dribbling;

    //only for improvised return from interface method addPlayer
    Player(){
        super();
    }

    Player(String name, int age, int number, int defending, int passing, int shooting, int pace, int dribbling) {
        super(name, age);
        this.number = number;
        this.defending = defending;
        this.passing = passing;
        this.shooting = shooting;
        this.pace = pace;
        this.dribbling = dribbling;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDefending() {
        return defending;
    }

    public void setDefending(int defending) {
        this.defending = defending;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getDribbling() {
        return dribbling;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }
}
