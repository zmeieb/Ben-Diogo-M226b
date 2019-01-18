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
                    trainShooting(player, 2);
                    break;
                case "2":
                    trainPassing(player, 2);
                    break;
                case "3":
                    trainPace(player, 2);
                    break;
                case "4":
                    trainDefending(player, 2);
                    break;
                case "5":
                    trainDribbling(player, 2);
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
    public Player addPlayer() {
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
        int alter = Integer.valueOf(scanner.nextLine());
        System.out.println("Geben sie die Nummer des neuen Spieler ein!");
        int nummer = Integer.valueOf(scanner.nextLine());
        System.out.println("Geben sie die DefendingStats des neuen Spieler ein!");
        int defendingStats = Integer.valueOf(scanner.nextLine());
        System.out.println("Geben sie die Passing-Stats des neuen Spieler ein!");
        int passingStats = Integer.valueOf(scanner.nextLine());
        System.out.println("Geben sie die Shooting-Stats des neuen Spieler ein!");
        int shootingStats = Integer.valueOf(scanner.nextLine());
        System.out.println("Geben sie die Sprint-Stats des neuen Spieler ein!");
        int paceStats = Integer.valueOf(scanner.nextLine());
        System.out.println("Geben sie die Dribbling-Stats des neuen Spieler ein!");
        int dribblingStats = Integer.valueOf(scanner.nextLine());
        switch (response) {
            case "1":
                System.out.println("Created new Goalkeeper! ");
                return new Goalkeeper(name, alter, nummer, defendingStats, passingStats, shootingStats, paceStats, dribblingStats);
            case "2":
                System.out.println("Created new Defender! ");
                return new Defender(name, alter, nummer, defendingStats, passingStats, shootingStats, paceStats, dribblingStats);
            case "3":
                System.out.println("Created new Midfielder! ");
                return new Midfielder(name, alter, nummer, defendingStats, passingStats, shootingStats, paceStats, dribblingStats);
            case "4":
                System.out.println("Created new Striker! ");
                return new Striker(name, alter, nummer, defendingStats, passingStats, shootingStats, paceStats, dribblingStats);
            default:
                return null;
        }
    }


    @Override
    public void removePlayer(Team team) {
        Scanner scanner = new Scanner(System.in);
        List<Player> playerList = team.getPlayers();
        System.out.println("Wie ist die Spielernummer des Spielers die entfernt werden soll?");
        int number = Integer.valueOf(scanner.nextLine());
        for (Player player : playerList) {
            if (number == player.getNumber()) {
                playerList.remove(player);
                System.out.println("Spieler wurde erfolgreich vom Team entfernt! ");
            }
        }
    }

    @Override
    public String toString() {
        return "=============================\n" +
                "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Train-Experience: " + getTrainExperience() + "\n" +
                "Manage-Experience: " + getManageExperience() + "\n" +
                "=============================\n";
    }
}
