package party_manager;

import java.util.ArrayList;

public class Party {
    private String name;
    private String datum;
    private String zeit;
    private String ort;
    private Gastgeber gastgeber;
    private ArrayList<Gast> kommendeGäste = new ArrayList<>();
    private ArrayList<Gast> abwesendeGäste = new ArrayList<>();

    public Party(String name, String datum, String zeit, String ort, Gastgeber gastgeber) {
        this.name = name;
        this.datum = datum;
        this.zeit = zeit;
        this.ort = ort;
        this.gastgeber = gastgeber;
    }

    public void addKommenderGast(Gast kommendeGäste) {
        this.kommendeGäste.add(kommendeGäste);
    }

    public void addAbwesenderGast(Gast abwesendeGäste) {
        this.abwesendeGäste.add(abwesendeGäste);
    }

    @Override
    public String toString() {
        return "Party{" +
                "name='" + name + '\'' +
                ", datum='" + datum + '\'' +
                ", zeit='" + zeit + '\'' +
                ", ort='" + ort + '\'' +
                ", gastgeber=" + gastgeber +
                ", kommendeGäste=" + kommendeGäste +
                ", abwesendeGäste=" + abwesendeGäste +
                '}';
    }
}
