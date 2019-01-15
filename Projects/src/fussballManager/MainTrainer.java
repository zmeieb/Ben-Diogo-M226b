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

    /*
    public Player addPlayer(Player player, Team team){

    }
    */
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
