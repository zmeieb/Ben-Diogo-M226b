package fussballManager;

public class Goalkeeper extends Player {

    //only for improvised return from interface method addPlayer
    Goalkeeper(){
        super();
    }

    Goalkeeper(String name, int age, int number, int defending, int passing, int shooting, int pace, int dribbling) {
        super(name, age, number, defending, passing, shooting, pace, dribbling);
    }
}
