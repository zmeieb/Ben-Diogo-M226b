package fussballManager;

public abstract class Person {

    Person(String name, int age, Team team){
        this.name = name;
        this.age = age;
        this.team = team;
    }

    private String name;
    private int age;
    private Team team;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
