package fussballManager;

public class Team {


    Team(String name, String liga){
        this.name = name;
        this.liga = liga;
    }

    private String name;
    private String liga;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }
}
