package fussballManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainManagerSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Player> playersBarcelona = generatePlayerBarcelona();
        List<Player> playerLiverpool = generatePlayerLiverpool();
        CoTrainer johannes = generateCoTrainer("Johannes", 36, 59);
        CoTrainer antonio = generateCoTrainer("Antonio", 29, 50);
        MainTrainer rui = generateMainTrainer("Rui", 39, 77, 50);
        MainTrainer patrick = generateMainTrainer("Patrick", 45, 85, 70);
        Team barcelona = generateTeam("FC Barcelona", "Primera Division");
        Team liverpool = generateTeam("FC Liverpool", "Premier League");

        barcelona.setPlayers(playersBarcelona);
        barcelona.setCoTrainer(johannes);
        barcelona.setMainTrainer(rui);

        liverpool.setPlayers(playerLiverpool);
        liverpool.setCoTrainer(antonio);
        liverpool.setMainTrainer(patrick);

        boolean validResponse = true;
        do {
            System.out.println("====================================");
            System.out.println("Welcome to the Football Manager 2019");
            System.out.println("====================================");
            System.out.println(
                    "Chose your team!\n[1] " +
                            barcelona.getName() + " - " + barcelona.getLeague() + "\n[2] " +
                            liverpool.getName() + " - " + liverpool.getLeague() + "\n[x] End Program"
            );
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
                    validResponse = false;
                    break;
                default:
                    break;
            }
        } while (validResponse);
    }

    private static Team generateTeam(String name, String league) {
        return new Team(name, league);
    }

    private static List<Player> generatePlayerBarcelona() {
        List<Player> playerList = new ArrayList<>();

        playerList.add(new Goalkeeper("Albert", 27, 1, 76, 78, 70, 68, 55));
        playerList.add(new Defender("Hendrik", 25, 2, 87, 71, 66, 73, 69));
        playerList.add(new Defender("Jonas", 25, 19, 87, 71, 66, 73, 69));
        playerList.add(new Defender("Torben", 23, 3, 84, 74, 72, 78, 83));
        playerList.add(new Defender("Damjan", 31, 4, 86, 76, 65, 81, 74));
        playerList.add(new Midfielder("Digo", 18, 69, 65, 89, 79, 44, 33));
        playerList.add(new Midfielder("Tim", 36, 23, 51, 91, 81, 76, 76));
        playerList.add(new Midfielder("Luca", 27, 62, 70, 93, 82, 81, 79));
        playerList.add(new Midfielder("Joel", 25, 54, 78, 89, 83, 71, 85));
        playerList.add(new Striker("Silvio", 23, 15, 43, 91, 91, 91, 95));
        playerList.add(new Striker("Dino", 39, 11, 29, 81, 85, 88, 89));
        return playerList;
    }

    private static List<Player> generatePlayerLiverpool() {
        List<Player> playerList = new ArrayList<>();

        playerList.add(new Goalkeeper("Jimmy", 35, 99, 46, 67, 63, 56, 49));
        playerList.add(new Defender("Yannick", 24, 5, 91, 67, 56, 86, 76));
        playerList.add(new Defender("Cris", 17, 16, 81, 79, 47, 75, 87));
        playerList.add(new Defender("Mark", 25, 31, 82, 81, 43, 79, 77));
        playerList.add(new Midfielder("Andreas", 23, 24, 78, 89, 83, 71, 85));
        playerList.add(new Midfielder("Michael", 34, 22, 64, 92, 76, 86, 86));
        playerList.add(new Midfielder("Severin", 23, 21, 68, 93, 85, 78, 82));
        playerList.add(new Midfielder("Ben", 23, 20, 68, 93, 85, 78, 82));
        playerList.add(new Striker("Ali", 26, 12, 37, 82, 93, 83, 91));
        playerList.add(new Striker("Sebastian", 22, 13, 41, 86, 88, 92, 93));
        playerList.add(new Striker("Stefan", 22, 45, 41, 86, 88, 92, 93));
        return playerList;
    }

    private static CoTrainer generateCoTrainer(String name, int age, int trainExperience) {
        return new CoTrainer(name, age, trainExperience);
    }

    private static MainTrainer generateMainTrainer(String name, int age, int trainExperience, int manageExperience) {
        return new MainTrainer(name, age, trainExperience, manageExperience);
    }

    private static void selectionInTeam(Team team) {
        boolean tryAgain = true;
        Scanner scanner = new Scanner(System.in);
        while (tryAgain) {
            System.out.println("============= " + team.getName() + " ===============");
            System.out.println("[1] View Team");
            System.out.println("[2] Co-Trainer");
            System.out.println("[3] Main Trainer");
            System.out.println("[b] Back to Team Selection");
            String response = scanner.nextLine();

            switch (response) {
                case "1":
                    enteringTeam(team);
                    break;
                case "2":
                    enteringCoTrainer(team);
                    break;
                case "3":
                    enteringMainTrainer(team);
                    break;
                case "b":
                    tryAgain = false;
                    break;
                default:
                    break;
            }
        }
    }

    private static void enteringTeam(Team team) {
        boolean tryAgain = true;
        Scanner scanner = new Scanner(System.in);
        while (tryAgain) {
            System.out.println("========== Players ==========");
            System.out.println("[1] View whole Team");
            System.out.println("[2] View Goalkeepers");
            System.out.println("[3] View Defenders");
            System.out.println("[4] View Midfielders");
            System.out.println("[5] View Strikers");
            System.out.println("[b] Back");
            String response = scanner.nextLine();

            switch (response) {
                case "1":
                    for (Player player : team.getPlayers()) {
                        System.out.println(player.toString());
                    }
                    break;
                case "2":
                    for (Player player : team.getPlayers()) {
                        if (player instanceof Goalkeeper) {
                            System.out.println(player.toString());
                        }
                    }
                    break;
                case "3":
                    for (Player player : team.getPlayers()) {
                        if (player instanceof Defender) {
                            System.out.println(player.toString());
                        }
                    }
                    break;
                case "4":
                    for (Player player : team.getPlayers()) {
                        if (player instanceof Midfielder) {
                            System.out.println(player.toString());
                        }
                    }
                    break;
                case "5":
                    for (Player player : team.getPlayers()) {
                        if (player instanceof Striker) {
                            System.out.println(player.toString());
                        }
                    }
                    break;
                case "b":
                    tryAgain = false;
                    break;
                default:
                    break;
            }
        }
    }

    private static void enteringCoTrainer(Team team) {
        boolean tryAgain = true;
        Scanner scanner = new Scanner(System.in);
        Trainer coTrainer = team.getCoTrainer();

        while (tryAgain) {
            System.out.println("============ Co-Trainer ============");
            System.out.println("[1] View Co-Trainer Info");
            System.out.println("[2] Train Player");
            System.out.println("[b] Back");
            String response = scanner.nextLine();

            switch (response) {
                case "1":
                    System.out.println(team.getCoTrainer().toString());
                    break;
                case "2":
                    coTrainer.train(coTrainer.getPlayerByNumber(team.getPlayers()));
                    break;
                case "b":
                    tryAgain = false;
                    break;
                default:
                    break;
            }
        }
    }

    private static void enteringMainTrainer(Team team) {
        boolean tryAgain = true;
        Scanner scanner = new Scanner(System.in);
        Trainer mainTrainer = team.getMainTrainer();

        while (tryAgain) {
            System.out.println("============ Main-Trainer ============");
            System.out.println("[1] View Main-Trainer Info");
            System.out.println("[2] Train Player");
            System.out.println("[3] Manage Team");
            System.out.println("[b] Back");
            String response = scanner.nextLine();

            switch (response) {
                case "1":
                    System.out.println(team.getMainTrainer().toString());
                    break;
                case "2":
                    mainTrainer.train(mainTrainer.getPlayerByNumber(team.getPlayers()));
                    break;
                case "3":
                    //mainTrainer.train(mainTrainer.getPlayerByNumber(team.getPlayers()));
                    break;
                case "b":
                    tryAgain = false;
                    break;
                default:
                    break;
            }
        }
    }
}
