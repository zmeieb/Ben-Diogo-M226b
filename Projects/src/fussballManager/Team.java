package fussballManager;

import java.util.List;

public class Team {

    private String name;
    private String league;
    private List<Player> players;
    private CoTrainer coTrainer;
    private MainTrainer mainTrainer;

    Team(String name, String league) {
        this.name = name;
        this.league = league;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeague() {
        return league;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public CoTrainer getCoTrainer() {
        return coTrainer;
    }

    public void setCoTrainer(CoTrainer coTrainer) {
        this.coTrainer = coTrainer;
    }

    public MainTrainer getMainTrainer() {
        return mainTrainer;
    }

    public void setMainTrainer(MainTrainer mainTrainer) {
        this.mainTrainer = mainTrainer;
    }
}
