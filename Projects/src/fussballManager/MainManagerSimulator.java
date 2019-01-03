package fussballManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainManagerSimulator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Player> playerList = generatePlayer();
        boolean validResponse = true;
        System.out.println("====================================");
        System.out.println("Welcome to the Football Manager 2019");
        System.out.println("====================================");
        Team barcelona = generateBarcelona();
        Team liverpool = generateLiverpool();
        while(validResponse) {

            System.out.println("Chose your team! \n" + "[1] Team 1\n" + "[2] Team 2 \n [x] End Program");
            String teamSelection = scanner.nextLine();
            switch (teamSelection) {

                case "1":
                    System.out.println("========Entering" + barcelona.getName() + "========");
                case "2":
                    System.out.println("========Entering" + liverpool.getName() + "========");
                case "x":
                    System.out.println("Bye Bye");
            }
        }

    }


    private static List<Player> generatePlayer(){
        List<Player> playerList = new ArrayList<>();

        playerList.add(new Goalkeeper("Albert", 27, 1, 76, 78, 70, 68, 55));
        playerList.add(new Goalkeeper("Jimmy", 35, 99, 46, 67, 63, 56, 49));
        playerList.add(new Defender("Hendrik", 25, 2, 87, 71, 66, 73, 69));
        playerList.add(new Defender("Torben", 23, 3, 84, 74, 72, 78, 83));
        playerList.add(new Defender("Damian", 31, 4, 86, 76, 65, 81, 74));
        playerList.add(new Defender("Yannick", 24, 5, 91, 67, 56, 86, 76));
        playerList.add(new Defender("Cris", 17, 16, 81, 79, 47, 75, 87));
        playerList.add(new Midfielder("Digo", 18, 69, 65, 89, 79, 44, 33));
        playerList.add(new Midfielder("Tim", 36, 23, 51, 91, 81, 76, 76));
        playerList.add(new Midfielder("Luca", 27, 12, 70, 93, 82, 81, 79));
        playerList.add(new Midfielder("Joel", 25, 54, 78, 89, 83, 71, 85));
        playerList.add(new Midfielder("Michael", 34, 22, 64, 92, 76, 86, 86));
        playerList.add(new Midfielder("Severin", 23, 21, 68, 93, 85, 78, 82));
        playerList.add(new Striker("Silvio", 23, 15, 43, 91, 91, 91, 95));
        playerList.add(new Striker("Dino", 39, 11, 29, 81, 85, 88, 89));
        playerList.add(new Striker("Ali", 26, 12, 37, 82, 93, 83, 91));
        playerList.add(new Striker("Sebastian", 22, 13, 41, 86, 88, 92, 93));
        return playerList;
    }

    private static CoTrainer generateCoTrainer(String name, int age, int trainExperience){
        CoTrainer coTrainer = new CoTrainer(name, age, trainExperience);
        return coTrainer;
    }

    private static Team generateBarcelona(){
        Team team = new Team("FC Barcelona", "Primera Division");
        team.setPlayers(generatePlayer());
        return team;
    }

    private static Team generateLiverpool(){
        Team team = new Team("FC Liverpool", "Premier League");
        team.setPlayers(generatePlayer());
        return team;
    }

    private static MainTrainer generateMainTrainer(String name, int age, int trainExperience, int manageExperience){
        MainTrainer mainTrainer = new MainTrainer(name, age, trainExperience, manageExperience);
        return mainTrainer;
    }


}
