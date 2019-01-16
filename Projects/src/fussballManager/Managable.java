package fussballManager;

public interface Managable {
    public Player addPlayer(Team team);

    public void removePlayer(Player player, Team team);
}
