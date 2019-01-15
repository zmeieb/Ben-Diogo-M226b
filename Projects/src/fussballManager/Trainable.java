package fussballManager;

public interface Trainable {
    void trainDefending(Player player, int i);

    void trainPassing(Player player, int i);

    void trainShooting(Player player, int i);

    void trainPace(Player player, int i);

    void trainDribbling(Player player, int i);

    void trainExperience();
}
