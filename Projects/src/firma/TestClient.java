package firma;

public class TestClient {

    public static void main(String[] args) {
        Mitarbeiter vorstand = new Abteilungsleiter();
        //Mitarbeiterhierarschie unter Vorstand aufbauen (add())

        //Mitarbeiterhierarschie nutzen
        System.out.println(vorstand.getMitarbeiterAnzahl());
    }
}
