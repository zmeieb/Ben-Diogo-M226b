package fussballManager;

import java.util.List;
import java.util.Scanner;

public abstract class Trainer extends Person implements Trainable {

    private int trainExperience;

    Trainer(String name, int age, int trainExperience) {
        super(name, age);
        this.trainExperience = trainExperience;
    }

    int getTrainExperience() {
        return trainExperience;
    }

    private void setTrainExperience(int trainExperience) {
        this.trainExperience = trainExperience;
    }

    public Player getPlayerByNumber(List<Player> players) {
        Scanner scanner = new Scanner(System.in);
        Player selectedPlayer = null;

        int notInt = 0;
        for (Player player : players) {
            System.out.println(player.toString());
        }

        while (notInt == 0) {
            System.out.println("Which Player do you want to train? Type his Player Number");
            try {
                int playerNumber = Integer.parseInt(scanner.nextLine());

                for (Player player : players) {
                    if (player.getNumber() == playerNumber) {
                        selectedPlayer = player;
                    }
                }
                if (selectedPlayer != null) {
                    notInt++;
                } else {
                    System.out.println("Player does not exist! Try again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please give a valid Input!");
            }
        }
        return selectedPlayer;
    }

    public void train(Player player) {
        boolean tryAgain = true;
        String response;
        Scanner scanner = new Scanner(System.in);

        while (tryAgain) {
            System.out.println(player.toString());
            System.out.println("============ Attributes ============");
            System.out.println("Which Attribute do you want to train?");
            System.out.println("[1] Train Shooting (+1)");
            System.out.println("[2] Train Passing (+1)");
            System.out.println("[3] Train Pace (+1)");
            System.out.println("[4] Train Defending (+1)");
            System.out.println("[5] Train Dribbling (+1)");
            System.out.println("[b] Back");
            response = scanner.nextLine();

            switch (response) {
                case "1":
                    this.trainShooting(player, 1);
                    break;
                case "2":
                    this.trainPassing(player, 1);
                    break;
                case "3":
                    this.trainPace(player, 1);
                    break;
                case "4":
                    this.trainDefending(player, 1);
                    break;
                case "5":
                    this.trainDribbling(player, 1);
                    break;
                case "b":
                    tryAgain = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void trainShooting(Player player, int i) {
        int stat = player.getShooting();
        stat += i;
        player.setShooting(stat);
        this.trainExperience();
    }

    public void trainPassing(Player player, int i) {
        int stat = player.getPassing();
        stat += i;
        player.setPassing(stat);
        this.trainExperience();
    }

    public void trainPace(Player player, int i) {
        int stat = player.getPace();
        stat += i;
        player.setPace(stat);
        this.trainExperience();
    }

    public void trainDefending(Player player, int i) {
        int stat = player.getDefending();
        stat += i;
        player.setDefending(stat);
        this.trainExperience();
    }

    public void trainDribbling(Player player, int i) {
        int stat = player.getDribbling();
        stat += i;
        player.setDribbling(stat);
        this.trainExperience();
    }

    public void trainExperience() {
        int exp = this.getTrainExperience();
        exp += 1;
        this.setTrainExperience(exp);
    }

    @Override
    public String toString() {
        return "=============================\n" +
                "Name: " + this.getName() + "\n" +
                "Age: " + this.getAge() + "\n" +
                "Train-Experience: " + this.getTrainExperience() + "\n" +
                "=============================\n";
    }
}
