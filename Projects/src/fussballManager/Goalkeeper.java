package fussballManager;

public class Goalkeeper extends Player {
    Goalkeeper(String name, int age, int number, int defending, int passing, int shooting, int pace, int dribbling) {
        super(name, age, number, defending, passing, shooting, pace, dribbling);
    }

    @Override
    public String toString() {
        return "======== Goalkeeper =========\n" +
                this.getName() + ", " + this.getAge() + " Jahre\n" +
                "Player Number: " + this.getNumber() + "\n" +
                "Shooting: " + this.getShooting() + "\tPassing: " + this.getPassing() + "\n" +
                "Pace: " + this.getPace() + "\t\tDefending: " + this.getDefending() + "\n" +
                "Dribbling: " + this.getDribbling() +
                "\n============================="
                ;
    }
}
