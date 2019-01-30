package zoo.Angestellte;

public abstract class Zoowaerter {

    private String name;
    private int alter;

    Zoowaerter(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public abstract int getZoowärterAnzahl();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
