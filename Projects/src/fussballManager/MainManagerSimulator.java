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
                    selectionInTeam(barcelona);
                    break;
                case "2":
                    selectionInTeam(liverpool);
                    break;
                case "x":
                    System.out.println("Bye Bye");
                    break;
            }
        }

    }


    public static List<Player> generatePlayer(){
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
        playerList.add(new Midfielder("Luca", 27, 62, 70, 93, 82, 81, 79));
        playerList.add(new Midfielder("Joel", 25, 54, 78, 89, 83, 71, 85));
        playerList.add(new Midfielder("Michael", 34, 22, 64, 92, 76, 86, 86));
        playerList.add(new Midfielder("Severin", 23, 21, 68, 93, 85, 78, 82));
        playerList.add(new Striker("Silvio", 23, 15, 43, 91, 91, 91, 95));
        playerList.add(new Striker("Dino", 39, 11, 29, 81, 85, 88, 89));
        playerList.add(new Striker("Ali", 26, 12, 37, 82, 93, 83, 91));
        playerList.add(new Striker("Sebastian", 22, 13, 41, 86, 88, 92, 93));
        return playerList;
    }

    private static CoTrainer generateCoTrainer(){
        CoTrainer coTrainer = new CoTrainer("Johannes", 47, 79);
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

    private static String selectionInTeam(Team team){
        Scanner scanner = new Scanner(System.in);
        String response = null;
        boolean tryAgain = true;
        while (tryAgain) {
            System.out.println("==============" + team.getName() + "================");
            System.out.println("[1] View Team");
            System.out.println("[2] Co-Trainer");
            System.out.println("[3] MainTrainer");
            System.out.println("[b] Back to Team selection");
            response = scanner.nextLine();

            if (response.equals("1") || response.equals("2")|| response.equals("3")|| response.equals("b")){
                tryAgain = false;
            }
        }
        return response;
    }

    private static void viewTeam(Team team) {
        boolean tryAgain = true;
        String response = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========Players===========");
        while (tryAgain) {
            System.out.println("[1] View whole Team");
            System.out.println("[2] View Goalkeepers");
            System.out.println("[3] View Defenders");
            System.out.println("[4] View Midfielders");
            System.out.println("[5] View Strikers");
            System.out.println("[b] Back");
            response = scanner.nextLine();

            if (response.equals("1") || response.equals("2") || response.equals("3") || response.equals("4") || response.equals("5") || response.equals("b")) {
                tryAgain = false;
            }
        }
        switch (response) {
            case "1":
                showAllPlayers(team.getPlayers());
                break;
            case "2":
                showGoalkeepers(team.getPlayers());
                break;
            case "3":
                showDefenders(team.getPlayers());
                break;
            case "4":
                showMidfielders(team.getPlayers());
            case "5":
                showStrikers(team.getPlayers());

        }
    }

    private static void showPlayer(Player player) {
            System.out.println("\n\n=======================");
            System.out.println(player.getName() + ", " + player.getAge());
            System.out.println("Player Number: " + player.getNumber());
            System.out.println("Shooting:" + player.getShooting() + "\t\t Passing: " + player.getPassing());
            System.out.println("Pace: " + player.getPace() + "\t\t\t Defending: " + player.getDefending());
            System.out.println("Dribbling: " + player.getDribbling());
    }

    private static void showAllPlayers(List<Player> players){
        for(Player player: players){
            showPlayer(player);
        }
    }

    public static void showGoalkeepers(List<Player> players){
        for(Player player : players){
            if (player instanceof Goalkeeper) {
                showPlayer(player);
                }
            }
        }


    private static void showDefenders(List<Player> players){
        for(Player player : players){
            if (player instanceof Defender) {
                showPlayer(player);
            }
        }
    }

    private static void showMidfielders(List<Player> players){
        for(Player player : players){
            if (player instanceof Midfielder) {
                showPlayer(player);
            }
        }
    }

    private static void showStrikers(List<Player> players){
        for(Player player : players){
            if (player instanceof Striker) {
                showPlayer(player);
            }
        }
    }

    private static void enteringCoTrainer(Team team){
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;

        System.out.println("=============Co-Trainer=============");

        while(tryAgain)
        System.out.println("[1] View Co-Trainer Info");
        System.out.println("[2] Train Player");
        System.out.println("[b] Back");
        String response = scanner.nextLine();

        if (response.equals("1") || response.equals("2") || response.equals("b")) {
            tryAgain = false;
        }

        switch (response){
            case "1":
                System.out.println("Co-Trainer name: " + team.getCoTrainer().getName());
                System.out.println("Co-Trainer age: " + team.getCoTrainer().getAge());
                System.out.println("Co-Trainer Train-Experience: " + team.getCoTrainer().getTrainExperience());
            case "2":
                getPlayerByNumber(team);

        }
    }

    private static Player getPlayerByNumber(Team team){
        Scanner scanner = new Scanner(System.in);
        showAllPlayers(team.getPlayers());
        Player selectedPlayer = null;
        System.out.println("Which Player do you want to train? Type his Player Number");
        int playerNumber = Integer.valueOf(scanner.nextLine());
        for(Player player : team.getPlayers()){
            if(player.getNumber() == playerNumber);
            selectedPlayer = player;
        }
        return selectedPlayer;
    }

    private static void trainSelectedPlayer(Player player){
        Trainer trainer = null;
        boolean tryAgain = true;
        String response = null;
        Scanner scanner = new Scanner(System.in);
        while(tryAgain) {
            System.out.println("Which Attribute do you want to train?");
            System.out.println("[1] Train defending (+2)");
            System.out.println("[2] Train shooting (+2)");
            System.out.println("[3] Train pace (+2)");
            System.out.println("[4] Train passing (+2)");
            System.out.println("[5] Train dribbling (+2)");
            System.out.println("[b] Back");
            response = scanner.nextLine();
            if (response.equals("1") || response.equals("2") || response.equals("3") || response.equals("4") || response.equals("5") || response.equals("b")) {
                tryAgain = false;
            }
        }
        switch (response){
            case "1":
                trainer.trainDefense(player);
                break;
            case "2":
                trainer.trainShooting(player);
                break;
            case "3":
                trainer.trainPace(player);
                break;
            case "4":
                trainer.trainPassing(player);
                break;
            case "5":
                trainer.trainDribbling(player);
                break;
            case "b":

                break;
        }
    }
}
