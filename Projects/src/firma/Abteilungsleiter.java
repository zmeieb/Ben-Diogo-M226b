package firma;

import java.util.ArrayList;
import java.util.List;

public class Abteilungsleiter extends Mitarbeiter {


    public void add(Mitarbeiter mitarbeiter) {
        mitarbeiterList.add(mitarbeiter);
    }

    public void remove(Mitarbeiter mitarbeiter) {
        mitarbeiterList.remove(mitarbeiter);
    }

    public Mitarbeiter getMitarbeiter(int index) {
        return mitarbeiterList.get(index);
    }

    @Override
    public int getMitarbeiterAnzahl() {
        int summe = 1; //Für jeweils 1 Abteilungsleiter
        for (Mitarbeiter ma : mitarbeiterList) {
            summe += ma.getMitarbeiterAnzahl();
        }
        return summe;
    }


    private String abteilung;
    private List<Mitarbeiter> mitarbeiterList = new ArrayList<Mitarbeiter>();


    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

}
