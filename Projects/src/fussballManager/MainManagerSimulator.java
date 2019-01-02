package fussballManager;

import java.util.ArrayList;
import java.util.List;

public class MainManagerSimulator {

    public static void main(String[] args){



    }

    private List<Player> generatePlayer(){
        List<Player> playerList = new ArrayList<>();

        Goalkeeper goalKeeper1 = new Goalkeeper("Albert", 27, 1, 76, 78, 70, 68, 55);
        Goalkeeper goalKeeper2 = new Goalkeeper("Jimmy", 35, 99, 46, 67, 63, 56, 49);
        Defender defender1 = new Defender("Hendrik", 25, 2, 87, 71, 66, 73, 69);
        Defender defender2 = new Defender("Torben", 23, 3, 84, 74, 72, 78, 83);
        Defender defender3 = new Defender("Damian", 31, 4, 86, 76, 65, 81, 74);
        Defender defender4 = new Defender("Yannick", 24, 5, 91, 67, 56, 86, 76);
        Defender defender5 = new Defender("Cris", 17, 16, 81, 79, 47, 75, 87);
        Midfielder midfielder1 = new Midfielder("Digo", 18, 69, 65, 89, 79, 44, 33);
        Midfielder midfielder2 = new Midfielder("Tim", 16, 23, 51, 91, 81, 76, 76);
        Midfielder midfielder3 = new Midfielder("Luca", 17, 12, 70, 93, 82, 81, 79);
        Midfielder midfielder4 = new Midfielder("Joel", 17, 54, 78, 89, 83, 71, 85);
        Midfielder midfielder5 = new Midfielder("Michael", 17, 22, 64, 92, 76, 86, 86);
        Midfielder midfielder6 = new Midfielder("Severin", 17, 21, 68, 93, 85, 78, 82);

        return playerList;
    }

}
