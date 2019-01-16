package fussballManager;

import java.util.List;
import java.util.Scanner;

public class MainTrainer extends Trainer implements Managable {

    private int manageExperience;

    MainTrainer(String name, int age, int trainExperience, int manageExperience) {
        super(name, age, trainExperience);
        this.manageExperience = manageExperience;
    }

    private int getManageExperience() {
        return manageExperience;
    }

    public void setManageExperience(int manageExperience) {
        this.manageExperience = manageExperience;
    }

    @Override
    public void train(Player player) {
        boolean tryAgain = true;
        String response;
        Scanner scanner = new Scanner(System.in);

        while (tryAgain) {
            System.out.println(player.toString());
            System.out.println("============ Attributes ============");
            System.out.println("Which Attribute do you want to train?");
            System.out.println("[1] Train Shooting (+2)");
            System.out.println("[2] Train Passing (+2)");
            System.out.println("[3] Train Pace (+2)");
            System.out.println("[4] Train Defending (+2)");
            System.out.println("[5] Train Dribbling (+2)");
            System.out.println("[b] Back");
            response = scanner.nextLine();

            switch (response) {
                case "1":
                    this.trainShooting(player, 2);
                    break;
                case "2":
                    this.trainPassing(player, 2);
                    break;
                case "3":
                    this.trainPace(player, 2);
                    break;
                case "4":
                    this.trainDefending(player, 2);
                    break;
                case "5":
                    this.trainDribbling(player, 2);
                    break;
                case "b":
                    tryAgain = false;
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public Player addPlayer(Team team) {
        Scanner scanner = new Scanner(System.in);
        String response = null;
        boolean tryAgain = true;
        while (tryAgain) {
            System.out.println("Was für eine Position soll der Spieler sein? \n[1] Goalkeeper\n" +
                    "[2] Defender\n[3] Midfielder\n[4] Striker \n[b] Back");
            response = scanner.nextLine();
            if (response.equals("1") || response.equals("2") || response.equals("3") || response.equals("4")) {
                tryAgain = false;
            } else if (response.equals("b")) {
                tryAgain = false;
            }

        }
        System.out.println("\nOkay lets start!\n");

        System.out.println("Geben sie den Namen des neuen Spieler ein!");
        String name = scanner.nextLine();
        System.out.println("Geben sie das Alter des neuen Spieler ein!");
        int alter = Integer.getInteger(scanner.nextLine());
        System.out.println("Geben sie die Nummer des neuen Spieler ein!");
        int nummer = Integer.getInteger(scanner.nextLine());
        System.out.println("Geben sie die DefendingStats des neuen Spieler ein!");
        int defendingStats = Integer.getInteger(scanner.nextLine());
        System.out.println("Geben sie die Passing-Stats des neuen Spieler ein!");
        int passingStats = Integer.getInteger(scanner.nextLine());
        System.out.println("Geben sie die Shooting-Stats des neuen Spieler ein!");
        int shootingStats = Integer.getInteger(scanner.nextLine());
        System.out.println("Geben sie die Sprint-Stats des neuen Spieler ein!");
        int paceStats = Integer.getInteger(scanner.nextLine());
        System.out.println("Geben sie die Dribbling-Stats des neuen Spieler ein!");
        int dribblingStats = Integer.getInteger(scanner.nextLine());
        switch (response) {
            case "1":
                return new Goalkeeper(name, alter, nummer, defendingStats, passingStats, shootingStats, paceStats, dribblingStats);
            case "2":
                return new Defender(name, alter, nummer, defendingStats, passingStats, shootingStats, paceStats, dribblingStats);
            case "3":
                return new Midfielder(name, alter, nummer, defendingStats, passingStats, shootingStats, paceStats, dribblingStats);
            case "4":
                return new Striker(name, alter, nummer, defendingStats, passingStats, shootingStats, paceStats, dribblingStats);
            default:
                return null;
        }
    }


    public void removePlayer(Player player, Team team) {
        List<Player> playerList = team.getPlayers();
        playerList.remove(player);
    }

    @Override
    public String toString() {
        return "=============================\n" +
                "Name: " + this.getName() + "\n" +
                "Age: " + this.getAge() + "\n" +
                "Train-Experience: " + this.getTrainExperience() + "\n" +
                "Manage-Experience: " + this.getManageExperience() + "\n" +
                "=============================\n";
    }
}
